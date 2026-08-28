import java.util.List;
import java.util.Optional;

public class cwn extends cuk {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final cux v;
   final cve w = cve.a();
   private final dip x;
   private ddw.b<dej> y = ddw.b.a();
   private cys z = cys.k;
   long A;
   final cwh o;
   final cwh p;
   Runnable B = () -> {
   };
   public final btr q = new buf(1) {
      @Override
      public void e() {
         super.e();
         cwn.this.a(this);
         cwn.this.B.run();
      }
   };
   final cwc C = new cwc();

   public cwn(int $$0, cqr $$1) {
      this($$0, $$1, cux.a);
   }

   public cwn(int $$0, cqr $$1, final cux $$2) {
      super(cvt.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dV();
      this.o = this.a(new cwh(this.q, 0, 20, 33));
      this.p = this.a(new cwh(this.C, 1, 143, 33) {
         @Override
         public boolean a(cys $$0) {
            return false;
         }

         @Override
         public void a(cqs $$0, cys $$1) {
            $$1.a($$0.dV(), $$0, $$1.M());
            cwn.this.C.a($$0, this.j());
            cys $$2 = cwn.this.o.a(1);
            if (!$$2.f()) {
               cwn.this.f(cwn.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ae();
               if (cwn.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awl.Bt, awm.e, 1.0F, 1.0F);
                  cwn.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cys> j() {
            return List.of(cwn.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public ddw.b<dej> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(cqs $$0) {
      return a(this.v, $$0, dlw.oE);
   }

   @Override
   public boolean a(cqs $$0, int $$1) {
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
   public void a(btr $$0) {
      cys $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(cys $$0) {
      this.w.a(-1);
      this.p.f(cys.k);
      if (!$$0.f()) {
         this.y = this.x.Q().a().b($$0);
      } else {
         this.y = ddw.b.a();
      }
   }

   void f(int $$0) {
      Optional<ddo<dej>> $$2;
      if (!this.y.c() && this.e($$0)) {
         ddw.a<dej> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dej)$$0x.b()).a(new dec(this.q.a(0)), this.x.F_()));
      }, () -> {
         this.p.f(cys.k);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public cvt<?> a() {
      return cvt.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cys $$0, cwh $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cys b(cqs $$0, int $$1) {
      cys $$2 = cys.k;
      cwh $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cys $$4 = $$3.g();
         cyo $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cys.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cys.k;
            }
         } else if (this.x.Q().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cys.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cys.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cys.k;
         }

         if ($$4.f()) {
            $$3.e(cys.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return cys.k;
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
   public void a(cqs $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
