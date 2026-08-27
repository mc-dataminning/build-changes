import java.util.Optional;

public class cng extends coc<cnf> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cnf r = new coq(this, 3, 3);
   private final cof s = new cof();
   private final cna t;
   private final cjt u;

   public cng(int $$0, cjs $$1) {
      this($$0, $$1, cna.a);
   }

   public cng(int $$0, cjs $$1, cna $$2) {
      super(cnw.m, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new cog($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cok(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cok($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cok($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cmp $$0, cyx $$1, cjt $$2, cnf $$3, cof $$4) {
      if (!$$1.B) {
         apt $$5 = (apt)$$2;
         crj $$6 = crj.i;
         Optional<cvl<cva>> $$7 = $$1.o().aJ().a(cvo.a, $$3, $$1);
         if ($$7.isPresent()) {
            cvl<cva> $$8 = $$7.get();
            cva $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               crj $$10 = $$9.a($$3, $$1.H_());
               if ($$10.a($$1.J())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.d.b(new abv($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bnt $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cjx $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cvl<? extends cvj<cnf>> $$0) {
      return $$0.b().a(this.r, this.u.dM());
   }

   @Override
   public void b(cjt $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cjt $$0) {
      return a(this.t, $$0, dca.cA);
   }

   @Override
   public crj a(cjt $$0, int $$1) {
      crj $$2 = crj.i;
      cok $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crj $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.f().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return crj.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return crj.i;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return crj.i;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return crj.i;
         }

         if ($$4.d()) {
            $$3.e(crj.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return crj.i;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(crj $$0, cok $$1) {
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
   public cod t() {
      return cod.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
