import java.util.Optional;

public class cet extends cfo<ces> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final ces r = new cgb(this, 3, 3);
   private final cfr s = new cfr();
   private final cep t;
   private final cbn u;

   public cet(int $$0, cbm $$1) {
      this($$0, $$1, cep.a);
   }

   public cet(int $$0, cbm $$1, cep $$2) {
      super(cfj.l, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new cfs($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cfw(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cfw($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cfw($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cee $$0, cpm $$1, cbn $$2, ces $$3, cfr $$4) {
      if (!$$1.B) {
         akl $$5 = (akl)$$2;
         ciy $$6 = ciy.b;
         Optional<cls> $$7 = $$1.n().aE().a(cme.a, $$3, $$1);
         if ($$7.isPresent()) {
            cls $$8 = $$7.get();
            if ($$4.a($$1, $$5, $$8)) {
               ciy $$9 = $$8.a($$3, $$1.B_());
               if ($$9.a($$1.G())) {
                  $$6 = $$9;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.c.b(new xm($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bgj $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cbr $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cmb<? super ces> $$0) {
      return $$0.a(this.r, this.u.dK());
   }

   @Override
   public void b(cbn $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cbn $$0) {
      return a(this.t, $$0, csn.cA);
   }

   @Override
   public ciy a(cbn $$0, int $$1) {
      ciy $$2 = ciy.b;
      cfw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.f()) {
         ciy $$4 = $$3.e();
         $$2 = $$4.p();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.d().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return ciy.b;
            }

            $$3.a($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return ciy.b;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return ciy.b;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return ciy.b;
         }

         if ($$4.b()) {
            $$3.d(ciy.b);
         } else {
            $$3.d();
         }

         if ($$4.L() == $$2.L()) {
            return ciy.b;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(ciy $$0, cfw $$1) {
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
   public cfp t() {
      return cfp.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
