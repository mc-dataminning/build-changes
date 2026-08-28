import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fou extends fpt {
   static final alb b = alb.b("container/slot");
   private static final int c = 18;
   private static final int d = 20;
   private static final int s = 1;
   private static final int u = 1;
   private static final int v = 2;
   private static final int w = 2;
   protected final fuq a;
   private final Consumer<eir> x;
   eir y;
   private xd z;
   private xd A;
   private fou.a B;
   private fka C;

   public fou(fuq $$0, Consumer<eir> $$1, eir $$2) {
      super(xd.c("createWorld.customize.flat.title"));
      this.a = $$0;
      this.x = $$1;
      this.y = $$2;
   }

   public eir l() {
      return this.y;
   }

   public void a(eir $$0) {
      this.y = $$0;
   }

   @Override
   protected void aT_() {
      this.z = xd.c("createWorld.customize.flat.tile");
      this.A = xd.c("createWorld.customize.flat.height");
      this.B = this.c(new fou.a());
      this.C = this.c(fka.a(xd.c("createWorld.customize.flat.removeLayer"), $$0 -> {
         if (this.D()) {
            List<eio> $$1 = this.y.e();
            int $$2 = this.B.aK_().indexOf(this.B.h());
            int $$3 = $$1.size() - $$2 - 1;
            $$1.remove($$3);
            this.B.a($$1.isEmpty() ? null : this.B.aK_().get(Math.min($$2, $$1.size() - 1)));
            this.y.g();
            this.B.c();
            this.m();
         }
      }).a(this.n / 2 - 155, this.o - 52, 150, 20).a());
      this.c(fka.a(xd.c("createWorld.customize.presets"), $$0 -> {
         this.m.a(new fpp(this));
         this.y.g();
         this.m();
      }).a(this.n / 2 + 5, this.o - 52, 150, 20).a());
      this.c(fka.a(xc.d, $$0 -> {
         this.x.accept(this.y);
         this.m.a(this.a);
         this.y.g();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a());
      this.c(fka.a(xc.e, $$0 -> {
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
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
      int $$4 = this.n / 2 - 92 - 16;
      $$0.b(this.p, this.z, $$4, 32, 16777215);
      $$0.b(this.p, this.A, $$4 + 2 + 213 - this.p.a(this.A), 32, 16777215);
   }

   class a extends fkw<fou.a.a> {
      public a() {
         super(fou.this.m, fou.this.n, fou.this.o - 103, 43, 24);

         for (int $$0 = 0; $$0 < fou.this.y.e().size(); $$0++) {
            this.b(new fou.a.a());
         }
      }

      public void a(@Nullable fou.a.a $$0) {
         super.a($$0);
         fou.this.m();
      }

      public void c() {
         int $$0 = this.aK_().indexOf(this.h());
         this.k();

         for (int $$1 = 0; $$1 < fou.this.y.e().size(); $$1++) {
            this.b(new fou.a.a());
         }

         List<fou.a.a> $$2 = this.aK_();
         if ($$0 >= 0 && $$0 < $$2.size()) {
            this.a($$2.get($$0));
         }
      }

      class a extends fkw.a<fou.a.a> {
         @Override
         public void a(fjn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            eio $$10 = fou.this.y.e().get(fou.this.y.e().size() - $$1 - 1);
            dua $$11 = $$10.b();
            cvl $$12 = this.a($$11);
            this.a($$0, $$3, $$2, $$12);
            $$0.a(fou.this.p, $$12.y(), $$3 + 18 + 5, $$2 + 3, 16777215, false);
            xd $$13;
            if ($$1 == 0) {
               $$13 = xd.a("createWorld.customize.flat.layer.top", $$10.a());
            } else if ($$1 == fou.this.y.e().size() - 1) {
               $$13 = xd.a("createWorld.customize.flat.layer.bottom", $$10.a());
            } else {
               $$13 = xd.a("createWorld.customize.flat.layer", $$10.a());
            }

            $$0.a(fou.this.p, $$13, $$3 + 2 + 213 - fou.this.p.a($$13), $$2 + 3, 16777215, false);
         }

         private cvl a(dua $$0) {
            cvg $$1 = $$0.b().r();
            if ($$1 == cvo.a) {
               if ($$0.a(dgx.G)) {
                  $$1 = cvo.qA;
               } else if ($$0.a(dgx.H)) {
                  $$1 = cvo.qB;
               }
            }

            return new cvl($$1);
         }

         @Override
         public xd a() {
            eio $$0 = fou.this.y.e().get(fou.this.y.e().size() - a.this.aK_().indexOf(this) - 1);
            cvl $$1 = this.a($$0.b());
            return (xd)(!$$1.f() ? xd.a("narrator.select", $$1.y()) : xc.a);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(this);
            return super.a($$0, $$1, $$2);
         }

         private void a(fjn $$0, int $$1, int $$2, cvl $$3) {
            this.a($$0, $$1 + 1, $$2 + 1);
            if (!$$3.f()) {
               $$0.b($$3, $$1 + 2, $$2 + 2);
            }
         }

         private void a(fjn $$0, int $$1, int $$2) {
            $$0.a(ghe::C, fou.b, $$1, $$2, 18, 18);
         }
      }
   }
}
