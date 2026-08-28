import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ffy extends hct {
   private static final Logger b = LogUtils.getLogger();
   public static final xd a = xd.c("mco.upload.select.world.title");
   private static final xd c = xd.c("selectWorld.unable_to_load");
   static final xd B = xd.c("selectWorld.world");
   private static final xd C = xd.c("mco.upload.hardcore").b(-65536);
   private static final xd D = xd.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final fhb F;
   private final ffx G;
   private final long H;
   private final int I;
   fka J;
   List<esi> K = Lists.newArrayList();
   int L = -1;
   ffy.b M;

   public ffy(@Nullable fhb $$0, long $$1, int $$2, ffx $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void D() {
      esh.a $$0 = this.m.m().b();
      this.K = this.m.m().a($$0).join().stream().filter(esi::v).collect(Collectors.toList());

      for (esi $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aT_() {
      this.M = this.c(new ffy.b());

      try {
         this.D();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new ffn(c, xd.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(fka.a(xd.c("mco.upload.button.name"), $$0 -> this.E()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(fka.a(xc.k, $$0 -> this.m.a(this.G)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hcr(xd.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new hcr(xd.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xd i() {
      return xc.a(this.n(), this.m());
   }

   private void E() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         esi $$0 = this.K.get(this.L);
         this.m.a(new fge(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
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

   static xd a(esi $$0) {
      return $$0.h().d();
   }

   static String b(esi $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends fkw.a<ffy.a> {
      private final esi b;
      private final String c;
      private final xd d;
      private final xd e;

      public a(final esi $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xd.a("mco.upload.entry.id", $$0.a(), ffy.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         ffy.this.M.b(ffy.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fjn $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = ffy.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(ffy.this.p, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(ffy.this.p, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(ffy.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public xd a() {
         xd $$0 = xc.b(xd.b(this.b.b()), xd.b(ffy.b(this.b)), ffy.a(this.b));
         return xd.a("narrator.select", $$0);
      }
   }

   class b extends hcs<ffy.a> {
      public b() {
         super(ffy.this.n, ffy.this.o - 40 - ffy.g(0), ffy.g(0), 36);
      }

      public void a(esi $$0) {
         this.a((ffy.a)(ffy.this.new a($$0)));
      }

      @Override
      public int a() {
         return ffy.this.K.size() * 36;
      }

      public void a(@Nullable ffy.a $$0) {
         super.a($$0);
         ffy.this.L = this.aK_().indexOf($$0);
         ffy.this.J.j = ffy.this.L >= 0 && ffy.this.L < this.l() && !ffy.this.K.get(ffy.this.L).i();
      }
   }
}
