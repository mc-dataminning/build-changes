import java.util.Optional;

public class cqn extends crj<cqm> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cqm r = new cry(this, 3, 3);
   private final crm s = new crm();
   private final cqh t;
   private final cmz u;

   public cqn(int $$0, cmy $$1) {
      this($$0, $$1, cqh.a);
   }

   public cqn(int $$0, cmy $$1, cqh $$2) {
      super(crd.m, $$0);
      this.t = $$2;
      this.u = $$1.l;
      this.a(new crn($$1.l, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new crr(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crr($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crr($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cpw $$0, dca $$1, cmz $$2, cqm $$3, crm $$4) {
      if (!$$1.B) {
         arg $$5 = (arg)$$2;
         cur $$6 = cur.l;
         Optional<cyz<cyo>> $$7 = $$1.o().aJ().a(czc.a, $$3, $$1);
         if ($$7.isPresent()) {
            cyz<cyo> $$8 = $$7.get();
            cyo $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               cur $$10 = $$9.a($$3, $$1.H_());
               if ($$10.a($$1.J())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.c.b(new adf($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bqp $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cnd $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cyz<? extends cyx<cqm>> $$0) {
      return $$0.b().a(this.r, this.u.dP());
   }

   @Override
   public void b(cmz $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cmz $$0) {
      return a(this.t, $$0, dfd.cA);
   }

   @Override
   public cur a(cmz $$0, int $$1) {
      cur $$2 = cur.l;
      crr $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cur $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.g().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cur.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cur.l;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cur.l;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cur.l;
         }

         if ($$4.e()) {
            $$3.e(cur.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cur.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cur $$0, crr $$1) {
      return $$1.c != this.s && super.a($$0, $$1);
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
   public crk t() {
      return crk.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
