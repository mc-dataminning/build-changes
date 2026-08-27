import java.util.Optional;

public class cll extends cmh<clk> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final clk r = new cmu(this, 3, 3);
   private final cmk s = new cmk();
   private final clf t;
   private final cia u;

   public cll(int $$0, chz $$1) {
      this($$0, $$1, clf.a);
   }

   public cll(int $$0, chz $$1, clf $$2) {
      super(cmb.m, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new cml($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cmp(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cmp($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cmp($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cku $$0, cwe $$1, cia $$2, clk $$3, cmk $$4) {
      if (!$$1.B) {
         apb $$5 = (apb)$$2;
         cpq $$6 = cpq.h;
         Optional<csu<csj>> $$7 = $$1.o().aJ().a(csx.a, $$3, $$1);
         if ($$7.isPresent()) {
            csu<csj> $$8 = $$7.get();
            csj $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               cpq $$10 = $$9.a($$3, $$1.I_());
               if ($$10.a($$1.I())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.d.b(new abf($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bme $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cie $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(csu<? extends css<clk>> $$0) {
      return $$0.b().a(this.r, this.u.dJ());
   }

   @Override
   public void b(cia $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cia $$0) {
      return a(this.t, $$0, czh.cA);
   }

   @Override
   public cpq a(cia $$0, int $$1) {
      cpq $$2 = cpq.h;
      cmp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cpq $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.d().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cpq.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cpq.h;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cpq.h;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cpq.h;
         }

         if ($$4.b()) {
            $$3.e(cpq.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cpq.h;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cpq $$0, cmp $$1) {
      return $$1.d != this.s && super.a($$0, $$1);
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public int n() {
      return this.r.f();
   }

   @Override
   public int o() {
      return this.r.g();
   }

   @Override
   public int p() {
      return 10;
   }

   @Override
   public cmi t() {
      return cmi.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
