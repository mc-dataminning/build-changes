import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fpi extends fqh {
   static final ale b = ale.b("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int s = 1;
   private static final int u = 1;
   private static final int v = 2;
   private static final int w = 2;
   protected final fve a;
   private final Consumer<ejj> x;
   ejj y;
   private xe z;
   private xe A;
   private fpi.a B;
   private fko C;

   public fpi(fve $$0, Consumer<ejj> $$1, ejj $$2) {
      super(xe.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.x = $$1;
      this.y = $$2;
   }

   public ejj l() {
      return this.y;
   }

   public void a(ejj $$0) {
      this.y = $$0;
   }

   @Override
   protected void aS_() {
      this.z = xe.c("createWorld.customize.flat.tile");
      this.A = xe.c("createWorld.customize.flat.height");
      this.B = this.c(new fpi.a());
      this.C = this.c(fko.a(xe.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.D()) {
            List<ejg> $$1 = this.y.e();
            int $$2 = this.B.aJ_().indexOf(this.B.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.B.a($$1.isEmpty() ? null : this.B.aJ_().get(Math.min($$2, $$1.size() - 1)));
            this.y.g();
            this.B.c();
            this.m();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(fko.a(xe.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new fqd(this));
         this.y.g();
         this.m();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(fko.a(xd.d, $$0 -> {
         this.x.accept(this.y);
         this.m.a(this.a);
         this.y.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(fko.a(xd.e, $$0 -> {
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
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.z, $$4, 32, 16777215);
      $$0.b(this.p, this.A, $$4 + 2 + 213 - this.p.a(this.A), 32, 16777215);
   }

   class a extends flk<fpi.a.a> {
      public a() {
         super(fpi.this.m, fpi.this.n, fpi.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < fpi.this.y.e().size(); $$0++) {
            this.b(new fpi.a.a());
         }
      }

      public void a(@Nullable fpi.a.a $$0) {
         super.a($$0);
         fpi.this.m();
      }

      public void c() {
         int $$0 = this.aJ_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fpi.this.y.e().size(); $$1++) {
            this.b(new fpi.a.a());
         }

         List<fpi.a.a> $$2 = this.aJ_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends flk.a<fpi.a.a> {
         @Override
         public void a(fkb $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            ejg $$10 = fpi.this.y.e().get(fpi.this.y.e().size() - $$1 - 1);
            dus $$11 = $$10.b();
            cvs $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fpi.this.p, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            xe $$13;
            if ($$1 == 0) {
               $$13 = xe.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fpi.this.y.e().size() - 1) {
               $$13 = xe.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = xe.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fpi.this.p, $$13, $$3 + 2 + 213 - fpi.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private cvs a(dus $$0) {
            cvn $$1 = $$0.b().q();
            if ($$1 == cvw.a) {
               if ($$0.a(dho.G)) {
                  $$1 = cvw.qA;
               } else if ($$0.a(dho.H)) {
                  $$1 = cvw.qB;
               }
            }

            return new cvs($$1);
         }

         @Override
         public xe a() {
            ejg $$0 = fpi.this.y.e().get(fpi.this.y.e().size() - a.this.aJ_().indexOf(this) - 1);
            cvs $$1 = this.a($$0.b());
            return (xe)(!$$1.f() ? xe.a("narrator.select", $$1.y()) : xd.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fkb $$0, int $$1, int $$2, cvs $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fkb $$0, int $$1, int $$2) {
            $$0.a(ghv::B, fpi.b, $$1, $$2, 18, 18);
         }
      }
   }
}
