import java.util.Optional;

public class cib extends cix<cia> {
   public static final int k = 0;
   private static final int l = 1;
   private static final int m = 10;
   private static final int n = 10;
   private static final int o = 37;
   private static final int p = 37;
   private static final int q = 46;
   private final cia r = new cjk(this, 3, 3);
   private final cja s = new cja();
   private final chv t;
   private final cer u;

   public cib(int $$0, ceq $$1) {
      this($$0, $$1, chv.a);
   }

   public cib(int $$0, ceq $$1, chv $$2) {
      super(cir.m, $$0);
      this.t = $$2;
      this.u = $$1.m;
      this.a(new cjb($$1.m, this.r, this.s, 0, 124, 35));

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 3; $$4++) {
            this.a(new cjf(this.r, $$4 + $$3 * 3, 30 + $$4 * 18, 17 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 3; $$5++) {
         for (int $$6 = 0; $$6 < 9; $$6++) {
            this.a(new cjf($$1, $$6 + $$5 * 9 + 9, 8 + $$6 * 18, 84 + $$5 * 18));
         }
      }

      for (int $$7 = 0; $$7 < 9; $$7++) {
         this.a(new cjf($$1, $$7, 8 + $$7 * 18, 142));
      }
   }

   protected static void a(chk $$0, csy $$1, cer $$2, cia $$3, cja $$4) {
      if (!$$1.B) {
         amq $$5 = (amq)$$2;
         cmh $$6 = cmh.f;
         Optional<cpn<cpc>> $$7 = $$1.n().aG().a(cpq.a, $$3, $$1);
         if ($$7.isPresent()) {
            cpn<cpc> $$8 = $$7.get();
            cpc $$9 = $$8.b();
            if ($$4.a($$1, $$5, $$8)) {
               cmh $$10 = $$9.a($$3, $$1.I_());
               if ($$10.a($$1.H())) {
                  $$6 = $$10;
               }
            }
         }

         $$4.a(0, $$6);
         $$0.a(0, $$6);
         $$5.c.b(new zk($$0.j, $$0.k(), 0, $$6));
      }
   }

   @Override
   public void a(bje $$0) {
      this.t.a(($$0x, $$1) -> a(this, $$0x, this.u, this.r, this.s));
   }

   @Override
   public void a(cev $$0) {
      this.r.a($$0);
   }

   @Override
   public void l() {
      this.r.a();
      this.s.a();
   }

   @Override
   public boolean a(cpn<? extends cpl<cia>> $$0) {
      return $$0.b().a(this.r, this.u.dM());
   }

   @Override
   public void b(cer $$0) {
      super.b($$0);
      this.t.a(($$1, $$2) -> this.a($$0, this.r));
   }

   @Override
   public boolean a(cer $$0) {
      return a(this.t, $$0, cwb.cA);
   }

   @Override
   public cmh a(cer $$0, int $$1) {
      cmh $$2 = cmh.f;
      cjf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmh $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 == 0) {
            this.t.a(($$2x, $$3x) -> $$4.d().b($$4, $$2x, $$0));
            if (!this.a($$4, 10, 46, true)) {
               return cmh.f;
            }

            $$3.b($$4, $$2);
         } else if ($$1 >= 10 && $$1 < 46) {
            if (!this.a($$4, 1, 10, false)) {
               if ($$1 < 37) {
                  if (!this.a($$4, 37, 46, false)) {
                     return cmh.f;
                  }
               } else if (!this.a($$4, 10, 37, false)) {
                  return cmh.f;
               }
            }
         } else if (!this.a($$4, 10, 46, false)) {
            return cmh.f;
         }

         if ($$4.b()) {
            $$3.e(cmh.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmh.f;
         }

         $$3.a($$0, $$4);
         if ($$1 == 0) {
            $$0.a($$4, false);
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cmh $$0, cjf $$1) {
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
   public ciy t() {
      return ciy.a;
   }

   @Override
   public boolean e(int $$0) {
      return $$0 != this.m();
   }
}
