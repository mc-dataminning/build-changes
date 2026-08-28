import java.util.List;
import java.util.Optional;

public class cuf extends csc {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final csp v;
   final csw w = csw.a();
   private final dgi x;
   private dbr.b<dce> y = dbr.b.a();
   private cwp z = cwp.j;
   long A;
   final ctz o;
   final ctz p;
   Runnable B = () -> {
   };
   public final bsd q = new bsr(1) {
      @Override
      public void e() {
         super.e();
         cuf.this.a(this);
         cuf.this.B.run();
      }
   };
   final ctu C = new ctu();

   public cuf(int $$0, cow $$1) {
      this($$0, $$1, csp.a);
   }

   public cuf(int $$0, cow $$1, final csp $$2) {
      super(ctl.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dV();
      this.o = this.a(new ctz(this.q, 0, 20, 33));
      this.p = this.a(new ctz(this.C, 1, 143, 33) {
         @Override
         public boolean a(cwp $$0) {
            return false;
         }

         @Override
         public void a(cox $$0, cwp $$1) {
            $$1.a($$0.dV(), $$0, $$1.M());
            cuf.this.C.a($$0, this.j());
            cwp $$2 = cuf.this.o.a(1);
            if (!$$2.f()) {
               cuf.this.f(cuf.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ad();
               if (cuf.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awa.Bj, awb.e, 1.0F, 1.0F);
                  cuf.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cwp> j() {
            return List.of(cuf.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public dbr.b<dce> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(cox $$0) {
      return a(this.v, $$0, djo.oE);
   }

   @Override
   public boolean a(cox $$0, int $$1) {
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
   public void a(bsd $$0) {
      cwp $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(cwp $$0) {
      this.w.a(-1);
      this.p.f(cwp.j);
      if (!$$0.f()) {
         this.y = this.x.Q().a().b($$0);
      } else {
         this.y = dbr.b.a();
      }
   }

   void f(int $$0) {
      Optional<dbj<dce>> $$2;
      if (!this.y.c() && this.e($$0)) {
         dbr.a<dce> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dce)$$0x.b()).a(new dbx(this.q.a(0)), this.x.K_()));
      }, () -> {
         this.p.f(cwp.j);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public ctl<?> a() {
      return ctl.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cwp $$0, ctz $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cwp b(cox $$0, int $$1) {
      cwp $$2 = cwp.j;
      ctz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwp $$4 = $$3.g();
         cwl $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cwp.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cwp.j;
            }
         } else if (this.x.Q().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cwp.j;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cwp.j;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cwp.j;
         }

         if ($$4.f()) {
            $$3.e(cwp.j);
         }

         $$3.c();
         if ($$4.M() == $$2.M()) {
            return cwp.j;
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
   public void a(cox $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
