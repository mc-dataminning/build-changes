import com.google.common.collect.Lists;
import java.util.List;

public class cme extends ckf {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final ckq t;
   private final ckx u = ckx.a();
   private final cvr v;
   private List<csh<csz>> w = Lists.newArrayList();
   private cpd x = cpd.h;
   long y;
   final cma m;
   final cma n;
   Runnable z = () -> {
   };
   public final blp o = new bmf(1) {
      @Override
      public void e() {
         super.e();
         cme.this.a(this);
         cme.this.z.run();
      }
   };
   final clv A = new clv();

   public cme(int $$0, chk $$1) {
      this($$0, $$1, ckq.a);
   }

   public cme(int $$0, chk $$1, final ckq $$2) {
      super(clm.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dM();
      this.m = this.a(new cma(this.o, 0, 20, 33));
      this.n = this.a(new cma(this.A, 1, 143, 33) {
         @Override
         public boolean a(cpd $$0) {
            return false;
         }

         @Override
         public void a(chl $$0, cpd $$1) {
            $$1.a($$0.dM(), $$0, $$1.M());
            cme.this.A.a($$0, this.j());
            cpd $$2 = cme.this.m.a(1);
            if (!$$2.b()) {
               cme.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.X();
               if (cme.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, atl.zO, atm.e, 1.0F, 1.0F);
                  cme.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cpd> j() {
            return List.of(cme.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cma($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cma($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<csh<csz>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(chl $$0) {
      return a(this.t, $$0, cyu.oc);
   }

   @Override
   public boolean b(chl $$0, int $$1) {
      if (this.e($$1)) {
         this.u.a($$1);
         this.p();
      }

      return true;
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.w.size();
   }

   @Override
   public void a(blp $$0) {
      cpd $$1 = this.m.g();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.q();
         this.a($$0, $$1);
      }
   }

   private void a(blp $$0, cpd $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cpd.h);
      if (!$$1.b()) {
         this.w = this.v.r().b(csk.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         csh<csz> $$0 = this.w.get(this.u.b());
         cpd $$1 = $$0.b().a(this.o, this.v.I_());
         if ($$1.a(this.v.I())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cpd.h);
         }
      } else {
         this.n.f(cpd.h);
      }

      this.d();
   }

   @Override
   public clm<?> a() {
      return clm.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cpd $$0, cma $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cpd a(chl $$0, int $$1) {
      cpd $$2 = cpd.h;
      cma $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpd $$4 = $$3.g();
         coy $$5 = $$4.d();
         $$2 = $$4.q();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cpd.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cpd.h;
            }
         } else if (this.v.r().a(csk.f, new bmf($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cpd.h;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cpd.h;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cpd.h;
         }

         if ($$4.b()) {
            $$3.e(cpd.h);
         }

         $$3.b();
         if ($$4.M() == $$2.M()) {
            return cpd.h;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(chl $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
