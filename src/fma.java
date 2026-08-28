import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fma extends fnf {
   static final alf b = new alf("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int r = 1;
   private static final int s = 1;
   private static final int u = 2;
   private static final int v = 2;
   protected final fru a;
   private final Consumer<egp> w;
   egp x;
   private xp y;
   private xp z;
   private fma.a A;
   private fhg B;

   public fma(fru $$0, Consumer<egp> $$1, egp $$2) {
      super(xp.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   public egp l() {
      return this.x;
   }

   public void a(egp $$0) {
      this.x = $$0;
   }

   @Override
   protected void aM_() {
      this.y = xp.c("createWorld.customize.flat.tile");
      this.z = xp.c("createWorld.customize.flat.height");
      this.A = this.c(new fma.a());
      this.B = this.c(fhg.a(xp.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.E()) {
            List<egm> $$1 = this.x.e();
            int $$2 = this.A.aD_().indexOf(this.A.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.A.a($$1.isEmpty() ? null : this.A.aD_().get(Math.min($$2, $$1.size() - 1)));
            this.x.g();
            this.A.c();
            this.m();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(fhg.a(xp.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new fnb(this));
         this.x.g();
         this.m();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(fhg.a(xo.d, $$0 -> {
         this.w.accept(this.x);
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(fhg.a(xo.e, $$0 -> {
         this.m.a(this.a);
         this.x.g();
      }).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.x.g();
      this.m();
   }

   void m() {
      this.B.j = this.E();
   }

   private boolean E() {
      return this.A.h() != null;
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public void a(fgt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.y, $$4, 32, 16777215);
      $$0.b(this.p, this.z, $$4 + 2 + 213 - this.p.a(this.z), 32, 16777215);
   }

   class a extends fic<fma.a.a> {
      public a() {
         super(fma.this.m, fma.this.n, fma.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < fma.this.x.e().size(); $$0++) {
            this.b(new fma.a.a());
         }
      }

      public void a(@Nullable fma.a.a $$0) {
         super.a($$0);
         fma.this.m();
      }

      public void c() {
         int $$0 = this.aD_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fma.this.x.e().size(); $$1++) {
            this.b(new fma.a.a());
         }

         List<fma.a.a> $$2 = this.aD_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fic.a<fma.a.a> {
         @Override
         public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            egm $$10 = fma.this.x.e().get(fma.this.x.e().size() - $$1 - 1);
            dse $$11 = $$10.b();
            cur $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fma.this.p, $$12.x(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            xp $$13;
            if ($$1 == 0) {
               $$13 = xp.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fma.this.x.e().size() - 1) {
               $$13 = xp.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = xp.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fma.this.p, $$13, $$3 + 2 + 213 - fma.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private cur a(dse $$0) {
            cum $$1 = $$0.b().r();
            if ($$1 == cuu.a) {
               if ($$0.a(dfd.G)) {
                  $$1 = cuu.qz;
               } else if ($$0.a(dfd.H)) {
                  $$1 = cuu.qA;
               }
            }

            return new cur($$1);
         }

         @Override
         public xp a() {
            egm $$0 = fma.this.x.e().get(fma.this.x.e().size() - a.this.aD_().indexOf(this) - 1);
            cur $$1 = this.a($$0.b());
            return (xp)(!$$1.e() ? xp.a("narrator.select", $$1.x()) : xo.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fgt $$0, int $$1, int $$2, cur $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.e()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fgt $$0, int $$1, int $$2) {
            $$0.a(fma.b, $$1, $$2, 0, 18, 18);
         }
      }
   }
}
