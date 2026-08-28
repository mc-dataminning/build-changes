import java.util.Optional;

public class cqg extends crc<cqf> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cqf r = new crr(this, 3, 3);
   private final crf s = new crf();
   private final cqa t;
   private final cms u;

   public cqg(int $$0, cmr $$1) {
      this($$0, $$1, cqa.a);
   }

   public cqg(int $$0, cmr $$1, cqa $$2) {
      super(cqw.m, $$0);
      this.t = $$2;
      this.u = $$1.l;
      this.a(new crg($$1.l, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new crk(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crk($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crk($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cpp $$0, dbt $$1, cms $$2, cqf $$3, crf $$4) {
      if (!$$1.B) {
         arc $$5 = (arc)$$2;
         cuk $$6 = cuk.l;
         Optional<cys<cyh>> $$7 = $$1.o().aJ().a(cyv.a, $$3, $$1);
         if ($$7.isPresent()) {
            cys<cyh> $$8 = $$7.get();
            cyh $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               cuk $$10 = $$9.a($$3, $$1.H_());
               if ($$10.a($$1.J())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.c.b(new adb($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bqi $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cmw $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cys<? extends cyq<cqf>> $$0) {
      return $$0.b().a(this.r, this.u.dP());
   }

   @Override
   public void b(cms $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cms $$0) {
      return a(this.t, $$0, dew.cA);
   }

   @Override
   public cuk a(cms $$0, int $$1) {
      cuk $$2 = cuk.l;
      crk $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuk $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.g().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cuk.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cuk.l;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cuk.l;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cuk.l;
         }

         if ($$4.e()) {
            $$3.e(cuk.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cuk.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cuk $$0, crk $$1) {
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
   public crd t() {
      return crd.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
