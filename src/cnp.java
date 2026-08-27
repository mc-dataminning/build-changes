import com.google.common.collect.Lists;
import java.util.List;

public class cnp extends clq {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cmb t;
   private final cmi u = cmi.a();
   private final cxb v;
   private List<ctr<cuj>> w = Lists.newArrayList();
   private cqm x = cqm.h;
   long y;
   final cnl m;
   final cnl n;
   Runnable z = () -> {
   };
   public final bmw o = new bnm(1) {
      @Override
      public void e() {
         super.e();
         cnp.this.a(this);
         cnp.this.z.run();
      }
   };
   final cng A = new cng();

   public cnp(int $$0, cit $$1) {
      this($$0, $$1, cmb.a);
   }

   public cnp(int $$0, cit $$1, final cmb $$2) {
      super(cmx.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dM();
      this.m = this.a(new cnl(this.o, 0, 20, 33));
      this.n = this.a(new cnl(this.A, 1, 143, 33) {
         @Override
         public boolean a(cqm $$0) {
            return false;
         }

         @Override
         public void a(ciu $$0, cqm $$1) {
            $$1.a($$0.dM(), $$0, $$1.M());
            cnp.this.A.a($$0, this.j());
            cqm $$2 = cnp.this.m.a(1);
            if (!$$2.b()) {
               cnp.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.X();
               if (cnp.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, aty.zW, atz.e, 1.0F, 1.0F);
                  cnp.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cqm> j() {
            return List.of(cnp.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cnl($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cnl($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<ctr<cuj>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(ciu $$0) {
      return a(this.t, $$0, dae.oc);
   }

   @Override
   public boolean b(ciu $$0, int $$1) {
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
   public void a(bmw $$0) {
      cqm $$1 = this.m.g();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.q();
         this.a($$0, $$1);
      }
   }

   private void a(bmw $$0, cqm $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cqm.h);
      if (!$$1.b()) {
         this.w = this.v.r().b(ctu.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         ctr<cuj> $$0 = this.w.get(this.u.b());
         cqm $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.I())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cqm.h);
         }
      } else {
         this.n.f(cqm.h);
      }

      this.d();
   }

   @Override
   public cmx<?> a() {
      return cmx.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cqm $$0, cnl $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cqm a(ciu $$0, int $$1) {
      cqm $$2 = cqm.h;
      cnl $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqm $$4 = $$3.g();
         cqh $$5 = $$4.d();
         $$2 = $$4.q();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cqm.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cqm.h;
            }
         } else if (this.v.r().a(ctu.f, new bnm($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cqm.h;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cqm.h;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cqm.h;
         }

         if ($$4.b()) {
            $$3.e(cqm.h);
         }

         $$3.b();
         if ($$4.M() == $$2.M()) {
            return cqm.h;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(ciu $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
