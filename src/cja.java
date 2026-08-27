import java.util.Optional;

public class cja extends cjw<ciz> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final ciz r = new ckj(this, 3, 3);
   private final cjz s = new cjz();
   private final ciu t;
   private final cfq u;

   public cja(int $$0, cfp $$1) {
      this($$0, $$1, ciu.a);
   }

   public cja(int $$0, cfp $$1, ciu $$2) {
      super(cjq.m, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new cka($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cke(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cke($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cke($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cij $$0, ctx $$1, cfq $$2, ciz $$3, cjz $$4) {
      if (!$$1.B) {
         anf $$5 = (anf)$$2;
         cng $$6 = cng.f;
         Optional<cqm<cqb>> $$7 = $$1.o().aG().a(cqp.a, $$3, $$1);
         if ($$7.isPresent()) {
            cqm<cqb> $$8 = $$7.get();
            cqb $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               cng $$10 = $$9.a($$3, $$1.I_());
               if ($$10.a($$1.I())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.c.b(new zx($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bjv $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cfu $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cqm<? extends cqk<ciz>> $$0) {
      return $$0.b().a(this.r, this.u.dL());
   }

   @Override
   public void b(cfq $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cfq $$0) {
      return a(this.t, $$0, cxa.cA);
   }

   @Override
   public cng a(cfq $$0, int $$1) {
      cng $$2 = cng.f;
      cke $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cng $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.d().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cng.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cng.f;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cng.f;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cng.f;
         }

         if ($$4.b()) {
            $$3.e(cng.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cng.f;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cng $$0, cke $$1) {
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
   public cjx t() {
      return cjx.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
