import java.util.Optional;

public class cqm extends cri<cql> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cql r = new crx(this, 3, 3);
   private final crl s = new crl();
   private final cqg t;
   private final cmy u;

   public cqm(int $$0, cmx $$1) {
      this($$0, $$1, cqg.a);
   }

   public cqm(int $$0, cmx $$1, cqg $$2) {
      super(crc.m, $$0);
      this.t = $$2;
      this.u = $$1.l;
      this.a(new crm($$1.l, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new crq(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new crq($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new crq($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(cpv $$0, dbz $$1, cmy $$2, cql $$3, crl $$4) {
      if (!$$1.B) {
         arg $$5 = (arg)$$2;
         cuq $$6 = cuq.l;
         Optional<cyy<cyn>> $$7 = $$1.o().aJ().a(czb.a, $$3, $$1);
         if ($$7.isPresent()) {
            cyy<cyn> $$8 = $$7.get();
            cyn $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               cuq $$10 = $$9.a($$3, $$1.H_());
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
   public void a(bqo $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cnc $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cyy<? extends cyw<cql>> $$0) {
      return $$0.b().a(this.r, this.u.dP());
   }

   @Override
   public void b(cmy $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cmy $$0) {
      return a(this.t, $$0, dfc.cA);
   }

   @Override
   public cuq a(cmy $$0, int $$1) {
      cuq $$2 = cuq.l;
      crq $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cuq $$4 = $$3.g();
         $$2 = $$4.s();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.g().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cuq.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cuq.l;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cuq.l;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cuq.l;
         }

         if ($$4.e()) {
            $$3.e(cuq.l);
         } else {
            $$3.b();
         }

         if ($$4.I() == $$2.I()) {
            return cuq.l;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cuq $$0, crq $$1) {
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
   public crj t() {
      return crj.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
