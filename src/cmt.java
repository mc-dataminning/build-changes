import com.google.common.collect.Lists;
import java.util.List;

public class cmt extends cku {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final clf t;
   private final clm u = clm.a();
   private final cwe v;
   private List<csu<ctm>> w = Lists.newArrayList();
   private cpq x = cpq.h;
   long y;
   final cmp m;
   final cmp n;
   Runnable z = () -> {
   };
   public final bme o = new bmu(1) {
      @Override
      public void e() {
         super.e();
         cmt.this.a(this);
         cmt.this.z.run();
      }
   };
   final cmk A = new cmk();

   public cmt(int $$0, chz $$1) {
      this($$0, $$1, clf.a);
   }

   public cmt(int $$0, chz $$1, final clf $$2) {
      super(cmb.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dJ();
      this.m = this.a(new cmp(this.o, 0, 20, 33));
      this.n = this.a(new cmp(this.A, 1, 143, 33) {
         @Override
         public boolean a(cpq $$0) {
            return false;
         }

         @Override
         public void a(cia $$0, cpq $$1) {
            $$1.a($$0.dJ(), $$0, $$1.M());
            cmt.this.A.a($$0, this.j());
            cpq $$2 = cmt.this.m.a(1);
            if (!$$2.b()) {
               cmt.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.X();
               if (cmt.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, atp.zO, atq.e, 1.0F, 1.0F);
                  cmt.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cpq> j() {
            return List.of(cmt.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cmp($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cmp($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<csu<ctm>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cia $$0) {
      return a(this.t, $$0, czh.oc);
   }

   @Override
   public boolean b(cia $$0, int $$1) {
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
   public void a(bme $$0) {
      cpq $$1 = this.m.g();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.q();
         this.a($$0, $$1);
      }
   }

   private void a(bme $$0, cpq $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cpq.h);
      if (!$$1.b()) {
         this.w = this.v.r().b(csx.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         csu<ctm> $$0 = this.w.get(this.u.b());
         cpq $$1 = $$0.b().a(this.o, this.v.I_());
         if ($$1.a(this.v.I())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cpq.h);
         }
      } else {
         this.n.f(cpq.h);
      }

      this.d();
   }

   @Override
   public cmb<?> a() {
      return cmb.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cpq $$0, cmp $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public cpq a(cia $$0, int $$1) {
      cpq $$2 = cpq.h;
      cmp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpq $$4 = $$3.g();
         cpl $$5 = $$4.d();
         $$2 = $$4.q();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dJ(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cpq.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cpq.h;
            }
         } else if (this.v.r().a(csx.f, new bmu($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cpq.h;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cpq.h;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cpq.h;
         }

         if ($$4.b()) {
            $$3.e(cpq.h);
         }

         $$3.b();
         if ($$4.M() == $$2.M()) {
            return cpq.h;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cia $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
