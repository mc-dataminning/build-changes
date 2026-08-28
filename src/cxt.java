import java.util.List;
import java.util.Optional;

public class cxt extends cvq {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final cwd v;
   final cwk w = cwk.a();
   private final djx x;
   private dfc.b<dfp> y = dfc.b.a();
   private czy z = czy.k;
   long A;
   final cxn o;
   final cxn p;
   Runnable B = () -> {
   };
   public final buk q = new buy(1) {
      @Override
      public void e() {
         super.e();
         cxt.this.a(this);
         cxt.this.B.run();
      }
   };
   final cxi C = new cxi();

   public cxt(int $$0, crw $$1) {
      this($$0, $$1, cwd.a);
   }

   public cxt(int $$0, crw $$1, final cwd $$2) {
      super(cwz.y, $$0);
      this.v = $$2;
      this.x = $$1.h.dV();
      this.o = this.a(new cxn(this.q, 0, 20, 33));
      this.p = this.a(new cxn(this.C, 1, 143, 33) {
         @Override
         public boolean a(czy $$0) {
            return false;
         }

         @Override
         public void a(crx $$0, czy $$1) {
            $$1.a($$0.dV(), $$0, $$1.M());
            cxt.this.C.a($$0, this.j());
            czy $$2 = cxt.this.o.a(1);
            if (!$$2.f()) {
               cxt.this.f(cxt.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ae();
               if (cxt.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awp.Bz, awq.e, 1.0F, 1.0F);
                  cxt.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<czy> j() {
            return List.of(cxt.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public dfc.b<dfp> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(crx $$0) {
      return a(this.v, $$0, dne.oI);
   }

   @Override
   public boolean a(crx $$0, int $$1) {
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
   public void a(buk $$0) {
      czy $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(czy $$0) {
      this.w.a(-1);
      this.p.f(czy.k);
      if (!$$0.f()) {
         this.y = this.x.Q().a().b($$0);
      } else {
         this.y = dfc.b.a();
      }
   }

   void f(int $$0) {
      Optional<deu<dfp>> $$2;
      if (!this.y.c() && this.e($$0)) {
         dfc.a<dfp> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dfp)$$0x.b()).a(new dfi(this.q.a(0)), this.x.J_()));
      }, () -> {
         this.p.f(czy.k);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public cwz<?> a() {
      return cwz.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(czy $$0, cxn $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public czy b(crx $$0, int $$1) {
      czy $$2 = czy.k;
      cxn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czy $$4 = $$3.g();
         czu $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return czy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return czy.k;
            }
         } else if (this.x.Q().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return czy.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return czy.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return czy.k;
         }

         if ($$4.f()) {
            $$3.e(czy.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return czy.k;
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
   public void a(crx $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
