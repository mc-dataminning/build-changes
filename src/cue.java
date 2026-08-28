import java.util.List;
import java.util.Optional;

public class cue extends csb {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final cso v;
   final csv w = csv.a();
   private final dgh x;
   private dbq.b<dcd> y = dbq.b.a();
   private cwo z = cwo.j;
   long A;
   final cty o;
   final cty p;
   Runnable B = () -> {
   };
   public final bsc q = new bsq(1) {
      @Override
      public void e() {
         super.e();
         cue.this.a(this);
         cue.this.B.run();
      }
   };
   final ctt C = new ctt();

   public cue(int $$0, cov $$1) {
      this($$0, $$1, cso.a);
   }

   public cue(int $$0, cov $$1, final cso $$2) {
      super(ctk.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dV();
      this.o = this.a(new cty(this.q, 0, 20, 33));
      this.p = this.a(new cty(this.C, 1, 143, 33) {
         @Override
         public boolean a(cwo $$0) {
            return false;
         }

         @Override
         public void a(cow $$0, cwo $$1) {
            $$1.a($$0.dV(), $$0, $$1.M());
            cue.this.C.a($$0, this.j());
            cwo $$2 = cue.this.o.a(1);
            if (!$$2.f()) {
               cue.this.f(cue.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ad();
               if (cue.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awa.Bj, awb.e, 1.0F, 1.0F);
                  cue.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cwo> j() {
            return List.of(cue.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public dbq.b<dcd> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(cow $$0) {
      return a(this.v, $$0, djn.oE);
   }

   @Override
   public boolean a(cow $$0, int $$1) {
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
   public void a(bsc $$0) {
      cwo $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(cwo $$0) {
      this.w.a(-1);
      this.p.f(cwo.j);
      if (!$$0.f()) {
         this.y = this.x.Q().a().b($$0);
      } else {
         this.y = dbq.b.a();
      }
   }

   void f(int $$0) {
      Optional<dbi<dcd>> $$2;
      if (!this.y.c() && this.e($$0)) {
         dbq.a<dcd> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dcd)$$0x.b()).a(new dbw(this.q.a(0)), this.x.K_()));
      }, () -> {
         this.p.f(cwo.j);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public ctk<?> a() {
      return ctk.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cwo $$0, cty $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cwo b(cow $$0, int $$1) {
      cwo $$2 = cwo.j;
      cty $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwo $$4 = $$3.g();
         cwk $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cwo.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cwo.j;
            }
         } else if (this.x.Q().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cwo.j;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cwo.j;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cwo.j;
         }

         if ($$4.f()) {
            $$3.e(cwo.j);
         }

         $$3.c();
         if ($$4.M() == $$2.M()) {
            return cwo.j;
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
   public void a(cow $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
