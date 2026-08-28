import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgx extends hee {
   private static final Logger b = LogUtils.getLogger();
   public static final xh a = xh.c("mco.upload.select.world.title");
   private static final xh c = xh.c("selectWorld.unable_to_load");
   static final xh B = xh.c("selectWorld.world");
   private static final xh C = xh.c("mco.upload.hardcore").b(-65536);
   private static final xh D = xh.c("selectWorld.commands");
   private static final DateFormat E = new SimpleDateFormat();
   @Nullable
   private final fia F;
   private final fgw G;
   private final long H;
   private final int I;
   fkz J;
   List<etl> K = Lists.newArrayList();
   int L = -1;
   fgx.b M;

   public fgx(@Nullable fia $$0, long $$1, int $$2, fgw $$3) {
      super(a);
      this.F = $$0;
      this.G = $$3;
      this.H = $$1;
      this.I = $$2;
   }

   private void D() {
      etk.a $$0 = this.m.m().b();
      this.K = this.m.m().a($$0).join().stream().filter(etl::v).collect(Collectors.toList());

      for (etl $$1 : this.K) {
         this.M.a($$1);
      }
   }

   @Override
   public void aS_() {
      this.M = this.c(new fgx.b());

      try {
         this.D();
      } catch (Exception var2) {
         b.error("Couldn't load level list", var2);
         this.m.a(new fgm(c, xh.a(var2.getMessage()), this.G));
         return;
      }

      this.J = this.c(fkz.a(xh.c("mco.upload.button.name"), $$0 -> this.E()).a(this.n / 2 - 154, this.o - 32, 153, 20).a());
      this.J.j = this.L >= 0 && this.L < this.K.size();
      this.c(fkz.a(xg.k, $$0 -> this.m.a(this.G)).a(this.n / 2 + 6, this.o - 32, 153, 20).a());
      this.a(new hec(xh.c("mco.upload.select.world.subtitle"), this.n / 2, g(-1), -6250336));
      if (this.K.isEmpty()) {
         this.a(new hec(xh.c("mco.upload.select.world.none"), this.n / 2, this.o / 2 - 20, -1));
      }
   }

   @Override
   public xh i() {
      return xg.a(this.n(), this.m());
   }

   private void E() {
      if (this.L != -1 && !this.K.get(this.L).i()) {
         etl $$0 = this.K.get(this.L);
         this.m.a(new fhd(this.F, this.H, this.I, this.G, $$0));
      }
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
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

   static xh a(etl $$0) {
      return $$0.h().d();
   }

   static String b(etl $$0) {
      return E.format(new Date($$0.f()));
   }

   class a extends flv.a<fgx.a> {
      private final etl b;
      private final String c;
      private final xh d;
      private final xh e;

      public a(final etl $$0) {
         this.b = $$0;
         this.c = $$0.b();
         this.d = xh.a("mco.upload.entry.id", $$0.a(), fgx.b($$0));
         this.e = $$0.s();
      }

      @Override
      public void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$1, $$3, $$2);
      }

      @Override
      public boolean a(double $$0, double $$1, int $$2) {
         fgx.this.M.b(fgx.this.K.indexOf(this.b));
         return super.a($$0, $$1, $$2);
      }

      protected void a(fkm $$0, int $$1, int $$2, int $$3) {
         String $$4;
         if (this.c.isEmpty()) {
            $$4 = fgx.B + " " + ($$1 + 1);
         } else {
            $$4 = this.c;
         }

         $$0.a(fgx.this.p, $$4, $$2 + 2, $$3 + 1, 16777215, false);
         $$0.a(fgx.this.p, this.d, $$2 + 2, $$3 + 12, -8355712, false);
         $$0.a(fgx.this.p, this.e, $$2 + 2, $$3 + 12 + 10, -8355712, false);
      }

      @Override
      public xh a() {
         xh $$0 = xg.b(xh.b(this.b.b()), xh.b(fgx.b(this.b)), fgx.a(this.b));
         return xh.a("narrator.select", $$0);
      }
   }

   class b extends hed<fgx.a> {
      public b() {
         super(fgx.this.n, fgx.this.o - 40 - fgx.g(0), fgx.g(0), 36);
      }

      public void a(etl $$0) {
         this.a((fgx.a)(fgx.this.new a($$0)));
      }

      @Override
      public int a() {
         return fgx.this.K.size() * 36;
      }

      public void a(@Nullable fgx.a $$0) {
         super.a($$0);
         fgx.this.L = this.aJ_().indexOf($$0);
         fgx.this.J.j = fgx.this.L >= 0 && fgx.this.L < this.l() && !fgx.this.K.get(fgx.this.L).i();
      }
   }
}
