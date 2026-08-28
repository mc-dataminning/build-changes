import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqb extends fra {
   static final ali b = ali.b("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int s = 1;
   private static final int u = 1;
   private static final int v = 2;
   private static final int w = 2;
   protected final fvx a;
   private final Consumer<eka> x;
   eka y;
   private xi z;
   private xi A;
   private fqb.a B;
   private flh C;

   public fqb(fvx $$0, Consumer<eka> $$1, eka $$2) {
      super(xi.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.x = $$1;
      this.y = $$2;
   }

   public eka l() {
      return this.y;
   }

   public void a(eka $$0) {
      this.y = $$0;
   }

   @Override
   protected void aR_() {
      this.z = xi.c("createWorld.customize.flat.tile");
      this.A = xi.c("createWorld.customize.flat.height");
      this.B = this.c(new fqb.a());
      this.C = this.c(flh.a(xi.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.D()) {
            List<ejx> $$1 = this.y.e();
            int $$2 = this.B.aI_().indexOf(this.B.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.B.a($$1.isEmpty() ? null : this.B.aI_().get(Math.min($$2, $$1.size() - 1)));
            this.y.g();
            this.B.c();
            this.m();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(flh.a(xi.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new fqw(this));
         this.y.g();
         this.m();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(flh.a(xh.d, $$0 -> {
         this.x.accept(this.y);
         this.m.a(this.a);
         this.y.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(flh.a(xh.e, $$0 -> {
         this.m.a(this.a);
         this.y.g();
      }).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
      this.y.g();
      this.m();
   }

   void m() {
      this.C.j = this.D();
   }

   private boolean D() {
      return this.B.h() != null;
   }

   @Override
   public void d() {
      this.m.a(this.a);
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.z, $$4, 32, 16777215);
      $$0.b(this.p, this.A, $$4 + 2 + 213 - this.p.a(this.A), 32, 16777215);
   }

   class a extends fmd<fqb.a.a> {
      public a() {
         super(fqb.this.m, fqb.this.n, fqb.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < fqb.this.y.e().size(); $$0++) {
            this.b(new fqb.a.a());
         }
      }

      public void a(@Nullable fqb.a.a $$0) {
         super.a($$0);
         fqb.this.m();
      }

      public void c() {
         int $$0 = this.aI_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fqb.this.y.e().size(); $$1++) {
            this.b(new fqb.a.a());
         }

         List<fqb.a.a> $$2 = this.aI_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fmd.a<fqb.a.a> {
         @Override
         public void a(fku $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            ejx $$10 = fqb.this.y.e().get(fqb.this.y.e().size() - $$1 - 1);
            dvj $$11 = $$10.b();
            cwb $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fqb.this.p, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            xi $$13;
            if ($$1 == 0) {
               $$13 = xi.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fqb.this.y.e().size() - 1) {
               $$13 = xi.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = xi.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fqb.this.p, $$13, $$3 + 2 + 213 - fqb.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private cwb a(dvj $$0) {
            cvx $$1 = $$0.b().j();
            if ($$1 == cwf.a) {
               if ($$0.a(dig.G)) {
                  $$1 = cwf.qA;
               } else if ($$0.a(dig.H)) {
                  $$1 = cwf.qB;
               }
            }

            return new cwb($$1);
         }

         @Override
         public xi a() {
            ejx $$0 = fqb.this.y.e().get(fqb.this.y.e().size() - a.this.aI_().indexOf(this) - 1);
            cwb $$1 = this.a($$0.b());
            return (xi)(!$$1.f() ? xi.a("narrator.select", $$1.y()) : xh.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fku $$0, int $$1, int $$2, cwb $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fku $$0, int $$1, int $$2) {
            $$0.a(gir::B, fqb.b, $$1, $$2, 18, 18);
         }
      }
   }
}
