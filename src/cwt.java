import java.util.List;
import java.util.Optional;

public class cwt extends cuq {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final cvd v;
   final cvk w = cvk.a();
   private final div x;
   private dec.b<dep> y = dec.b.a();
   private cyy z = cyy.k;
   long A;
   final cwn o;
   final cwn p;
   Runnable B = () -> {
   };
   public final btu q = new bui(1) {
      @Override
      public void e() {
         super.e();
         cwt.this.a(this);
         cwt.this.B.run();
      }
   };
   final cwi C = new cwi();

   public cwt(int $$0, cqx $$1) {
      this($$0, $$1, cvd.a);
   }

   public cwt(int $$0, cqx $$1, final cvd $$2) {
      super(cvz.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dV();
      this.o = this.a(new cwn(this.q, 0, 20, 33));
      this.p = this.a(new cwn(this.C, 1, 143, 33) {
         @Override
         public boolean a(cyy $$0) {
            return false;
         }

         @Override
         public void a(cqy $$0, cyy $$1) {
            $$1.a($$0.dV(), $$0, $$1.M());
            cwt.this.C.a($$0, this.j());
            cyy $$2 = cwt.this.o.a(1);
            if (!$$2.f()) {
               cwt.this.f(cwt.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ae();
               if (cwt.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awn.Bw, awo.e, 1.0F, 1.0F);
                  cwt.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cyy> j() {
            return List.of(cwt.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public dec.b<dep> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(cqy $$0) {
      return a(this.v, $$0, dmc.oF);
   }

   @Override
   public boolean a(cqy $$0, int $$1) {
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
   public void a(btu $$0) {
      cyy $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(cyy $$0) {
      this.w.a(-1);
      this.p.f(cyy.k);
      if (!$$0.f()) {
         this.y = this.x.Q().a().b($$0);
      } else {
         this.y = dec.b.a();
      }
   }

   void f(int $$0) {
      Optional<ddu<dep>> $$2;
      if (!this.y.c() && this.e($$0)) {
         dec.a<dep> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dep)$$0x.b()).a(new dei(this.q.a(0)), this.x.F_()));
      }, () -> {
         this.p.f(cyy.k);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public cvz<?> a() {
      return cvz.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cyy $$0, cwn $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cyy b(cqy $$0, int $$1) {
      cyy $$2 = cyy.k;
      cwn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cyy $$4 = $$3.g();
         cyu $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cyy.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cyy.k;
            }
         } else if (this.x.Q().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cyy.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cyy.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cyy.k;
         }

         if ($$4.f()) {
            $$3.e(cyy.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return cyy.k;
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
   public void a(cqy $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
