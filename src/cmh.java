import java.util.Optional;

public class cmh extends cnd<cmg> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cmg r = new cnq(this, 3, 3);
   private final cng s = new cng();
   private final cmb t;
   private final ciu u;

   public cmh(int $$0, cit $$1) {
      this($$0, $$1, cmb.a);
   }

   public cmh(int $$0, cit $$1, cmb $$2) {
      super(cmx.m, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new cnh($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cnl(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cnl($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cnl($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(clq $$0, cxb $$1, ciu $$2, cmg $$3, cng $$4) {
      if (!$$1.B) {
         apg $$5 = (apg)$$2;
         cqm $$6 = cqm.h;
         Optional<ctr<ctg>> $$7 = $$1.o().aJ().a(ctu.a, $$3, $$1);
         if ($$7.isPresent()) {
            ctr<ctg> $$8 = $$7.get();
            ctg $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               cqm $$10 = $$9.a($$3, $$1.H_());
               if ($$10.a($$1.I())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.d.b(new abj($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bmw $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(ciy $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(ctr<? extends ctp<cmg>> $$0) {
      return $$0.b().a(this.r, this.u.dM());
   }

   @Override
   public void b(ciu $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(ciu $$0) {
      return a(this.t, $$0, dae.cA);
   }

   @Override
   public cqm a(ciu $$0, int $$1) {
      cqm $$2 = cqm.h;
      cnl $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cqm $$4 = $$3.g();
         $$2 = $$4.q();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.d().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cqm.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cqm.h;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cqm.h;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cqm.h;
         }

         if ($$4.b()) {
            $$3.e(cqm.h);
         } else {
            $$3.b();
         }

         if ($$4.M() == $$2.M()) {
            return cqm.h;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cqm $$0, cnl $$1) {
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
   public cne t() {
      return cne.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
