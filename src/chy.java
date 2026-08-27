public class chy extends chk implements chw {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cja p = new cja();
   private final chu q;
   private final cer r;
   private final cia s;

   public chy(int $$0, ceq $$1) {
      super(cir.h, $$0);
      this.r = $$1.m;
      this.q = new cje(10);
      this.s = new cjk(this, 3, 3);
      this.a($$1);
   }

   public chy(int $$0, ceq $$1, cia $$2, chu $$3) {
      super(cir.h, $$0);
      this.r = $$1.m;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.m);
      this.a($$1);
      this.a(this);
   }

   private void a(ceq $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new chz(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cjf($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cjf($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new civ(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      chz $$2 = (chz)this.b($$0);
      this.q.a($$2.e, $$1 ? 0 : 1);
      this.d();
   }

   public boolean e(int $$0) {
      return $$0 > -1 && $$0 < 9 ? this.q.a($$0) == 1 : false;
   }

   public boolean l() {
      return this.q.a(9) == 1;
   }

   @Override
   public cmh a(cer $$0, int $$1) {
      cmh $$2 = cmh.f;
      cjf $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cmh $$4 = $$3.g();
         $$2 = $$4.p();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return cmh.f;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return cmh.f;
         }

         if ($$4.b()) {
            $$3.f(cmh.f);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return cmh.f;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(cer $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof amq $$0) {
         csy $$1 = $$0.dM();
         cmh $$2 = cxs.a($$1, this.s).map($$1x -> $$1x.a(this.s, $$1.I_())).orElse(cmh.f);
         this.p.a(0, $$2);
      }
   }

   public bje m() {
      return this.s;
   }

   @Override
   public void a(chk $$0, int $$1, cmh $$2) {
      this.n();
   }

   @Override
   public void a(chk $$0, int $$1, int $$2) {
   }
}
