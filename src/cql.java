import java.util.Optional;

public class cql extends crh<cqk> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cqk r = new crw(this, 3, 3);
   private final crk s = new crk();
   private final cqf t;
   private final cmx u;

   public cql(int $$0, cmw $$1) {
      this($$0, $$1, cqf.a);
   }

   public cql(int $$0, cmw $$1, cqf $$2) {
      super(crb.m, $$0);
      this.t = $$2;
      this.u = $$1.l;
      this.a(new crl($$1.l, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new crp(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crp($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crp($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cpu $$0, dby $$1, cmx $$2, cqk $$3, crk $$4) {
      if (!$$1.B) {
         arg $$5 = (arg)$$2;
         cup $$6 = cup.l;
         Optional<cyx<cym>> $$7 = $$1.o().aJ().a(cza.a, $$3, $$1);
         if ($$7.isPresent()) {
            cyx<cym> $$8 = $$7.get();
            cym $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               cup $$10 = $$9.a($$3, $$1.H_());
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
   public void a(bqn $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cnb $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cyx<? extends cyv<cqk>> $$0) {
      return $$0.b().a(this.r, this.u.dP());
   }

   @Override
   public void b(cmx $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cmx $$0) {
      return a(this.t, $$0, dfb.cA);
   }

   @Override
   public cup a(cmx $$0, int $$1) {
      cup $$2 = cup.l;
      crp $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cup $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.g().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cup.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cup.l;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cup.l;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cup.l;
         }

         if ($$4.e()) {
            $$3.e(cup.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cup.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cup $$0, crp $$1) {
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
   public cri t() {
      return cri.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
