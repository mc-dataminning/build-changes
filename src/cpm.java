import java.util.Optional;

public class cpm extends cqi<cpl> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cpl r = new cqx(this, 3, 3);
   private final cql s = new cql();
   private final cpg t;
   private final cly u;

   public cpm(int $$0, clx $$1) {
      this($$0, $$1, cpg.a);
   }

   public cpm(int $$0, clx $$1, cpg $$2) {
      super(cqc.m, $$0);
      this.t = $$2;
      this.u = $$1.l;
      this.a(new cqm($$1.l, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cqq(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cqq($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cqq($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cov $$0, daz $$1, cly $$2, cpl $$3, cql $$4) {
      if (!$$1.B) {
         aqo $$5 = (aqo)$$2;
         ctq $$6 = ctq.i;
         Optional<cxy<cxn>> $$7 = $$1.o().aJ().a(cyb.a, $$3, $$1);
         if ($$7.isPresent()) {
            cxy<cxn> $$8 = $$7.get();
            cxn $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               ctq $$10 = $$9.a($$3, $$1.H_());
               if ($$10.a($$1.J())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.c.b(new acn($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bpp $$0) {
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
   public boolean a(cxy<? extends cxw<cpl>> $$0) {
      return $$0.b().a(this.r, this.u.dP());
   }

   @Override
   public void b(cly $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cly $$0) {
      return a(this.t, $$0, dec.cA);
   }

   @Override
   public ctq a(cly $$0, int $$1) {
      ctq $$2 = ctq.i;
      cqq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         ctq $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.g().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return ctq.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return ctq.i;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return ctq.i;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return ctq.i;
         }

         if ($$4.e()) {
            $$3.e(ctq.i);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return ctq.i;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(ctq $$0, cqq $$1) {
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
   public cqj t() {
      return cqj.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
