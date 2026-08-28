import java.util.Optional;

public class cqk extends crg<cqj> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cqj r = new crv(this, 3, 3);
   private final crj s = new crj();
   private final cqe t;
   private final cmw u;

   public cqk(int $$0, cmv $$1) {
      this($$0, $$1, cqe.a);
   }

   public cqk(int $$0, cmv $$1, cqe $$2) {
      super(cra.m, $$0);
      this.t = $$2;
      this.u = $$1.l;
      this.a(new crk($$1.l, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cro(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cro($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cro($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cpt $$0, dbx $$1, cmw $$2, cqj $$3, crj $$4) {
      if (!$$1.B) {
         arf $$5 = (arf)$$2;
         cuo $$6 = cuo.l;
         Optional<cyw<cyl>> $$7 = $$1.o().aJ().a(cyz.a, $$3, $$1);
         if ($$7.isPresent()) {
            cyw<cyl> $$8 = $$7.get();
            cyl $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               cuo $$10 = $$9.a($$3, $$1.H_());
               if ($$10.a($$1.J())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.c.b(new ade($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bqm $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cna $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cyw<? extends cyu<cqj>> $$0) {
      return $$0.b().a(this.r, this.u.dP());
   }

   @Override
   public void b(cmw $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cmw $$0) {
      return a(this.t, $$0, dfa.cA);
   }

   @Override
   public cuo a(cmw $$0, int $$1) {
      cuo $$2 = cuo.l;
      cro $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuo $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.g().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cuo.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cuo.l;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cuo.l;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cuo.l;
         }

         if ($$4.e()) {
            $$3.e(cuo.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cuo.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cuo $$0, cro $$1) {
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
   public crh t() {
      return crh.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
