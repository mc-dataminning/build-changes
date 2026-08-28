import java.util.List;
import java.util.Optional;

public class cvq extends ctn {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final cua v;
   final cuh w = cuh.a();
   private final dhp x;
   private dcy.b<ddl> y = dcy.b.a();
   private cxy z = cxy.k;
   long A;
   final cvk o;
   final cvk p;
   Runnable B = () -> {
   };
   public final btj q = new btx(1) {
      @Override
      public void e() {
         super.e();
         cvq.this.a(this);
         cvq.this.B.run();
      }
   };
   final cvf C = new cvf();

   public cvq(int $$0, cqh $$1) {
      this($$0, $$1, cua.a);
   }

   public cvq(int $$0, cqh $$1, final cua $$2) {
      super(cuw.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dV();
      this.o = this.a(new cvk(this.q, 0, 20, 33));
      this.p = this.a(new cvk(this.C, 1, 143, 33) {
         @Override
         public boolean a(cxy $$0) {
            return false;
         }

         @Override
         public void a(cqi $$0, cxy $$1) {
            $$1.a($$0.dV(), $$0, $$1.M());
            cvq.this.C.a($$0, this.j());
            cxy $$2 = cvq.this.o.a(1);
            if (!$$2.f()) {
               cvq.this.f(cvq.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ae();
               if (cvq.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awk.Bt, awl.e, 1.0F, 1.0F);
                  cvq.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cxy> j() {
            return List.of(cvq.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public dcy.b<ddl> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(cqi $$0) {
      return a(this.v, $$0, dkw.oE);
   }

   @Override
   public boolean a(cqi $$0, int $$1) {
      if (this.w.b() == $$1) {
         return false;
      } else {
         if (this.e($$1)) {
            this.w.a($$1);
            this.f($$1);
         }

         return true;
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.y.d();
   }

   @Override
   public void a(btj $$0) {
      cxy $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(cxy $$0) {
      this.w.a(-1);
      this.p.f(cxy.k);
      if (!$$0.f()) {
         this.y = this.x.Q().a().b($$0);
      } else {
         this.y = dcy.b.a();
      }
   }

   void f(int $$0) {
      Optional<dcq<ddl>> $$2;
      if (!this.y.c() && this.e($$0)) {
         dcy.a<ddl> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((ddl)$$0x.b()).a(new dde(this.q.a(0)), this.x.F_()));
      }, () -> {
         this.p.f(cxy.k);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public cuw<?> a() {
      return cuw.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cxy $$0, cvk $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cxy b(cqi $$0, int $$1) {
      cxy $$2 = cxy.k;
      cvk $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxy $$4 = $$3.g();
         cxu $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cxy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cxy.k;
            }
         } else if (this.x.Q().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cxy.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cxy.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cxy.k;
         }

         if ($$4.f()) {
            $$3.e(cxy.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return cxy.k;
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
   public void a(cqi $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
