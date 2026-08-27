import java.util.Optional;

public class cny extends cov<cnx> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cnx r = new cpk(this, 3, 3);
   private final coy s = new coy();
   private final cns t;
   private final ckl u;

   public cny(int $$0, ckk $$1) {
      this($$0, $$1, cns.a);
   }

   public cny(int $$0, ckk $$1, cns $$2) {
      super(cop.m, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new coz($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cpd(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cpd($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cpd($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cnh $$0, czu $$1, ckl $$2, cnx $$3, coy $$4) {
      if (!$$1.B) {
         aqf $$5 = (aqf)$$2;
         csd $$6 = csd.i;
         Optional<cwi<cvx>> $$7 = $$1.o().aJ().a(cwl.a, $$3, $$1);
         if ($$7.isPresent()) {
            cwi<cvx> $$8 = $$7.get();
            cvx $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               csd $$10 = $$9.a($$3, $$1.H_());
               if ($$10.a($$1.J())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.d.b(new ach($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(boj $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(ckp $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cwi<? extends cwg<cnx>> $$0) {
      return $$0.b().a(this.r, this.u.dN());
   }

   @Override
   public void b(ckl $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(ckl $$0) {
      return a(this.t, $$0, dcx.cA);
   }

   @Override
   public csd a(ckl $$0, int $$1) {
      csd $$2 = csd.i;
      cpd $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csd $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.f().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return csd.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return csd.i;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return csd.i;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return csd.i;
         }

         if ($$4.d()) {
            $$3.e(csd.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return csd.i;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(csd $$0, cpd $$1) {
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
   public cow t() {
      return cow.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
