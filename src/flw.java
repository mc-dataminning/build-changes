import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class flw extends fnb {
   static final ale b = new ale("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int r = 1;
   private static final int s = 1;
   private static final int u = 2;
   private static final int v = 2;
   protected final frq a;
   private final Consumer<egl> w;
   egl x;
   private xo y;
   private xo z;
   private flw.a A;
   private fhc B;

   public flw(frq $$0, Consumer<egl> $$1, egl $$2) {
      super(xo.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   public egl l() {
      return this.x;
   }

   public void a(egl $$0) {
      this.x = $$0;
   }

   @Override
   protected void aM_() {
      this.y = xo.c("createWorld.customize.flat.tile");
      this.z = xo.c("createWorld.customize.flat.height");
      this.A = this.c(new flw.a());
      this.B = this.c(fhc.a(xo.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.D()) {
            List<egi> $$1 = this.x.e();
            int $$2 = this.A.aE_().indexOf(this.A.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.A.a($$1.isEmpty() ? null : this.A.aE_().get(Math.min($$2, $$1.size() - 1)));
            this.x.g();
            this.A.d();
            this.m();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(fhc.a(xo.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new fmx(this));
         this.x.g();
         this.m();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(fhc.a(xn.d, $$0 -> {
         this.w.accept(this.x);
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(fhc.a(xn.e, $$0 -> {
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.x.g();
      this.m();
   }

   void m() {
      this.B.j = this.D();
   }

   private boolean D() {
      return this.A.h() != null;
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.y, $$4, 32, 16777215);
      $$0.b(this.p, this.z, $$4 + 2 + 213 - this.p.a(this.z), 32, 16777215);
   }

   class a extends fhy<flw.a.a> {
      public a() {
         super(flw.this.m, flw.this.n, flw.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < flw.this.x.e().size(); $$0++) {
            this.b(new flw.a.a());
         }
      }

      public void a(@Nullable flw.a.a $$0) {
         super.a($$0);
         flw.this.m();
      }

      public void d() {
         int $$0 = this.aE_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < flw.this.x.e().size(); $$1++) {
            this.b(new flw.a.a());
         }

         List<flw.a.a> $$2 = this.aE_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fhy.a<flw.a.a> {
         @Override
         public void a(fgp $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            egi $$10 = flw.this.x.e().get(flw.this.x.e().size() - $$1 - 1);
            dsa $$11 = $$10.b();
            cun $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(flw.this.p, $$12.x(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            xo $$13;
            if ($$1 == 0) {
               $$13 = xo.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == flw.this.x.e().size() - 1) {
               $$13 = xo.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = xo.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(flw.this.p, $$13, $$3 + 2 + 213 - flw.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private cun a(dsa $$0) {
            cui $$1 = $$0.b().r();
            if ($$1 == cuq.a) {
               if ($$0.a(dez.G)) {
                  $$1 = cuq.qz;
               } else if ($$0.a(dez.H)) {
                  $$1 = cuq.qA;
               }
            }

            return new cun($$1);
         }

         @Override
         public xo a() {
            egi $$0 = flw.this.x.e().get(flw.this.x.e().size() - a.this.aE_().indexOf(this) - 1);
            cun $$1 = this.a($$0.b());
            return (xo)(!$$1.e() ? xo.a("narrator.select", $$1.x()) : xn.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fgp $$0, int $$1, int $$2, cun $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.e()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fgp $$0, int $$1, int $$2) {
            $$0.a(flw.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
