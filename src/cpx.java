import java.util.Optional;

public class cpx extends cqw<cpw> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cpw r = new crl(this, 3, 3);
   private final cqz s = new cqz();
   private final cpr t;
   private final cly u;

   public cpx(int $$0, clx $$1) {
      this($$0, $$1, cpr.a);
   }

   public cpx(int $$0, clx $$1, cpr $$2) {
      super(cqo.m, $$0);
      this.t = $$2;
      this.u = $$1.l;
      this.a(new cra($$1.l, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cre(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cre($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cre($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cpg $$0, dca $$1, cly $$2, cpw $$3, cqz $$4) {
      if (!$$1.C) {
         aqu $$5 = (aqu)$$2;
         cuh $$6 = cuh.i;
         Optional<czc<cyp>> $$7 = $$1.o().aJ().a(czf.a, $$3, $$1);
         if ($$7.isPresent()) {
            czc<cyp> $$8 = $$7.get();
            cyp $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               cuh $$10 = $$9.a($$3, $$1.I_());
               if ($$10.a($$1.K())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.d.b(new acu($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bpt $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cmc $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(czc<? extends cza<cpw>> $$0) {
      return $$0.b().a(this.r, this.u.dU());
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.t, $$0, dfe.dl);
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      cuh $$2 = cuh.i;
      cre $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuh $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.f().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cuh.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cuh.i;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cuh.i;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cuh.i;
         }

         if ($$4.d()) {
            $$3.e(cuh.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return cuh.i;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cuh $$0, cre $$1) {
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
   public cqx t() {
      return cqx.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
