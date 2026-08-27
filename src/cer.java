import java.util.Optional;

public class cer extends cfm<ceq> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final ceq r = new cfz(this, 3, 3);
   private final cfp s = new cfp();
   private final cen t;
   private final cbl u;

   public cer(int $$0, cbk $$1) {
      this($$0, $$1, cen.a);
   }

   public cer(int $$0, cbk $$1, cen $$2) {
      super(cfh.l, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new cfq($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cfu(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cfu($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cfu($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cec $$0, cpk $$1, cbl $$2, ceq $$3, cfp $$4) {
      if (!$$1.B) {
         akj $$5 = (akj)$$2;
         ciw $$6 = ciw.b;
         Optional<clq> $$7 = $$1.n().aE().a(cmc.a, $$3, $$1);
         if ($$7.isPresent()) {
            clq $$8 = $$7.get();
            if ($$4.a($$1, $$5, $$8)) {
               ciw $$9 = $$8.a($$3, $$1.B_());
               if ($$9.a($$1.G())) {
                  $$6 = $$9;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.c.b(new xl($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bgh $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cbp $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(clz<? super ceq> $$0) {
      return $$0.a(this.r, this.u.dK());
   }

   @Override
   public void b(cbl $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cbl $$0) {
      return a(this.t, $$0, csl.cA);
   }

   @Override
   public ciw a(cbl $$0, int $$1) {
      ciw $$2 = ciw.b;
      cfu $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciw $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.d().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return ciw.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return ciw.b;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return ciw.b;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return ciw.b;
         }

         if ($$4.b()) {
            $$3.d(ciw.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ciw.b;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(ciw $$0, cfu $$1) {
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
   public cfn t() {
      return cfn.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
