import java.util.List;
import java.util.Optional;

public class cuw extends cst {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final ctg v;
   final ctn w = ctn.a();
   private final dgz x;
   private dci.b<dcv> y = dci.b.a();
   private cxg z = cxg.j;
   long A;
   final cuq o;
   final cuq p;
   Runnable B = () -> {
   };
   public final bst q = new bth(1) {
      @Override
      public void e() {
         super.e();
         cuw.this.a(this);
         cuw.this.B.run();
      }
   };
   final cul C = new cul();

   public cuw(int $$0, cpn $$1) {
      this($$0, $$1, ctg.a);
   }

   public cuw(int $$0, cpn $$1, final ctg $$2) {
      super(cuc.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dW();
      this.o = this.a(new cuq(this.q, 0, 20, 33));
      this.p = this.a(new cuq(this.C, 1, 143, 33) {
         @Override
         public boolean a(cxg $$0) {
            return false;
         }

         @Override
         public void a(cpo $$0, cxg $$1) {
            $$1.a($$0.dW(), $$0, $$1.M());
            cuw.this.C.a($$0, this.j());
            cxg $$2 = cuw.this.o.a(1);
            if (!$$2.f()) {
               cuw.this.f(cuw.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ad();
               if (cuw.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awv.Bk, aww.e, 1.0F, 1.0F);
                  cuw.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cxg> j() {
            return List.of(cuw.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public dci.b<dcv> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(cpo $$0) {
      return a(this.v, $$0, dkf.oE);
   }

   @Override
   public boolean a(cpo $$0, int $$1) {
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
   public void a(bst $$0) {
      cxg $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(cxg $$0) {
      this.w.a(-1);
      this.p.f(cxg.j);
      if (!$$0.f()) {
         this.y = this.x.Q().a().b($$0);
      } else {
         this.y = dci.b.a();
      }
   }

   void f(int $$0) {
      Optional<dca<dcv>> $$2;
      if (!this.y.c() && this.e($$0)) {
         dci.a<dcv> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dcv)$$0x.b()).a(new dco(this.q.a(0)), this.x.K_()));
      }, () -> {
         this.p.f(cxg.j);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public cuc<?> a() {
      return cuc.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cxg $$0, cuq $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      cxg $$2 = cxg.j;
      cuq $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxg $$4 = $$3.g();
         cxc $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dW(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cxg.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cxg.j;
            }
         } else if (this.x.Q().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cxg.j;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cxg.j;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cxg.j;
         }

         if ($$4.f()) {
            $$3.e(cxg.j);
         }

         $$3.c();
         if ($$4.M() == $$2.M()) {
            return cxg.j;
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
   public void a(cpo $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
