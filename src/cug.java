import java.util.List;
import java.util.Optional;

public class cug extends csd {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final csq v;
   final csx w = csx.a();
   private final dgj x;
   private dbs.b<dcf> y = dbs.b.a();
   private cwq z = cwq.j;
   long A;
   final cua o;
   final cua p;
   Runnable B = () -> {
   };
   public final bse q = new bss(1) {
      @Override
      public void e() {
         super.e();
         cug.this.a(this);
         cug.this.B.run();
      }
   };
   final ctv C = new ctv();

   public cug(int $$0, cox $$1) {
      this($$0, $$1, csq.a);
   }

   public cug(int $$0, cox $$1, final csq $$2) {
      super(ctm.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dV();
      this.o = this.a(new cua(this.q, 0, 20, 33));
      this.p = this.a(new cua(this.C, 1, 143, 33) {
         @Override
         public boolean a(cwq $$0) {
            return false;
         }

         @Override
         public void a(coy $$0, cwq $$1) {
            $$1.a($$0.dV(), $$0, $$1.M());
            cug.this.C.a($$0, this.j());
            cwq $$2 = cug.this.o.a(1);
            if (!$$2.f()) {
               cug.this.f(cug.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ad();
               if (cug.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awa.Bj, awb.e, 1.0F, 1.0F);
                  cug.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cwq> j() {
            return List.of(cug.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public dbs.b<dcf> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(coy $$0) {
      return a(this.v, $$0, djp.oE);
   }

   @Override
   public boolean a(coy $$0, int $$1) {
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
   public void a(bse $$0) {
      cwq $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(cwq $$0) {
      this.w.a(-1);
      this.p.f(cwq.j);
      if (!$$0.f()) {
         this.y = this.x.Q().a().b($$0);
      } else {
         this.y = dbs.b.a();
      }
   }

   void f(int $$0) {
      Optional<dbk<dcf>> $$2;
      if (!this.y.c() && this.e($$0)) {
         dbs.a<dcf> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dcf)$$0x.b()).a(new dby(this.q.a(0)), this.x.K_()));
      }, () -> {
         this.p.f(cwq.j);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public ctm<?> a() {
      return ctm.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cwq $$0, cua $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cwq b(coy $$0, int $$1) {
      cwq $$2 = cwq.j;
      cua $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwq $$4 = $$3.g();
         cwm $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cwq.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cwq.j;
            }
         } else if (this.x.Q().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cwq.j;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cwq.j;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cwq.j;
         }

         if ($$4.f()) {
            $$3.e(cwq.j);
         }

         $$3.c();
         if ($$4.M() == $$2.M()) {
            return cwq.j;
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
   public void a(coy $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
