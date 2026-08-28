import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fie extends hfq {
   private static final Logger b = LogUtils.getLogger();
   public static final xj a = xj.c("mco.upload.select.world.title");
   private static final xj c = xj.c("selectWorld.unable_to_load");
   static final xj B = xj.c("selectWorld.world");
   private static final xj C = xj.c("mco.upload.hardcore").b(-65536);
   private static final xj D = xj.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final fjf F;
   private final fid G;
   private final long H;
   private final int I;
   fmd J;
   List<euc> K = Lists.newArrayList();
   int L = -1;
   fie.b M;

   public fie(@Nullable fjf $$0, long $$1, int $$2, fid $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void F() {
      eub.a $$0 = this.m.m().b();
      this.K = this.m.m().a($$0).join().stream().filter(euc::v).collect(Collectors.toList());

      for (euc $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aR_() {
      this.M = this.c(new fie.b());

      try {
         this.F();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fhu(c, xj.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(fmd.a(xj.c("mco.upload.button.name"), $$0 -> this.G()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(fmd.a(xi.k, $$0 -> this.m.a(this.G)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hfo(xj.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new hfo(xj.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xj i() {
      return xi.a(this.n(), this.m());
   }

   private void G() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         euc $$0 = this.K.get(this.L);
         this.m.a(new fik(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 13, -1);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.a(this.G);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   static xj a(euc $$0) {
      return $$0.h().d();
   }

   static String b(euc $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends fmz.a<fie.a> {
      private final euc b;
      private final String c;
      private final xj d;
      private final xj e;

      public a(final euc $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xj.a("mco.upload.entry.id", $$0.a(), fie.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(flq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fie.this.M.b(fie.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(flq $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fie.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fie.this.p, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fie.this.p, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fie.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public xj a() {
         xj $$0 = xi.b(xj.b(this.b.b()), xj.b(fie.b(this.b)), fie.a(this.b));
         return xj.a("narrator.select", $$0);
      }
   }

   class b extends hfp<fie.a> {
      public b() {
         super(fie.this.n, fie.this.o - 40 - fie.g(0), fie.g(0), 36);
      }

      public void a(euc $$0) {
         this.a((fie.a)(fie.this.new a($$0)));
      }

      @Override
      public int a() {
         return fie.this.K.size() * 36;
      }

      public void a(@Nullable fie.a $$0) {
         super.a($$0);
         fie.this.L = this.aH_().indexOf($$0);
         fie.this.J.j = fie.this.L >= 0 && fie.this.L < this.l() && !fie.this.K.get(fie.this.L).i();
      }
   }
}
