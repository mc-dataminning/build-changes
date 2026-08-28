import java.util.List;
import java.util.Optional;

public class cvf extends ctc {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final ctp v;
   final ctw w = ctw.a();
   private final dhi x;
   private dcr.b<dde> y = dcr.b.a();
   private cxp z = cxp.j;
   long A;
   final cuz o;
   final cuz p;
   Runnable B = () -> {
   };
   public final btc q = new btq(1) {
      @Override
      public void e() {
         super.e();
         cvf.this.a(this);
         cvf.this.B.run();
      }
   };
   final cuu C = new cuu();

   public cvf(int $$0, cpw $$1) {
      this($$0, $$1, ctp.a);
   }

   public cvf(int $$0, cpw $$1, final ctp $$2) {
      super(cul.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dW();
      this.o = this.a(new cuz(this.q, 0, 20, 33));
      this.p = this.a(new cuz(this.C, 1, 143, 33) {
         @Override
         public boolean a(cxp $$0) {
            return false;
         }

         @Override
         public void a(cpx $$0, cxp $$1) {
            $$1.a($$0.dW(), $$0, $$1.L());
            cvf.this.C.a($$0, this.j());
            cxp $$2 = cvf.this.o.a(1);
            if (!$$2.f()) {
               cvf.this.f(cvf.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ac();
               if (cvf.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, axf.AU, axg.e, 1.0F, 1.0F);
                  cvf.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cxp> j() {
            return List.of(cvf.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public dcr.b<dde> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(cpx $$0) {
      return a(this.v, $$0, dko.ox);
   }

   @Override
   public boolean a(cpx $$0, int $$1) {
      if (this.e($$1)) {
         this.w.a($$1);
         this.f($$1);
      }

      return true;
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.y.d();
   }

   @Override
   public void a(btc $$0) {
      cxp $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(cxp $$0) {
      this.w.a(-1);
      this.p.f(cxp.j);
      if (!$$0.f()) {
         this.y = this.x.P().a().b($$0);
      } else {
         this.y = dcr.b.a();
      }
   }

   void f(int $$0) {
      Optional<dcj<dde>> $$2;
      if (!this.y.c() && this.e($$0)) {
         dcr.a<dde> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dde)$$0x.b()).a(new dcx(this.q.a(0)), this.x.K_()));
      }, () -> {
         this.p.f(cxp.j);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public cul<?> a() {
      return cul.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cxp $$0, cuz $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cxp b(cpx $$0, int $$1) {
      cxp $$2 = cxp.j;
      cuz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxp $$4 = $$3.g();
         cxl $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dW(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cxp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cxp.j;
            }
         } else if (this.x.P().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cxp.j;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cxp.j;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cxp.j;
         }

         if ($$4.f()) {
            $$3.e(cxp.j);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cxp.j;
         }

         $$3.a($$0, $$4);
         if ($$1 == 1) {
            $$0.a($$4, false);
         }

         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cpx $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
