public class cos extends cod implements coq {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cpu p = new cpu();
   private final coo q;
   private final clh r;
   private final cou s;

   public cos(int $$0, clg $$1) {
      super(cpl.h, $$0);
      this.r = $$1.l;
      this.q = new cpy(10);
      this.s = new cqg(this, 3, 3);
      this.a($$1);
   }

   public cos(int $$0, clg $$1, cou $$2, coo $$3) {
      super(cpl.h, $$0);
      this.r = $$1.l;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.l);
      this.a($$1);
      this.a(this);
   }

   private void a(clg $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new cot(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cpz($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cpz($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new cpp(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      cot $$2 = (cot)this.b($$0);
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
   public csz a(clh $$0, int $$1) {
      csz $$2 = csz.i;
      cpz $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         csz $$4 = $$3.g();
         $$2 = $$4.r();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return csz.i;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return csz.i;
         }

         if ($$4.d()) {
            $$3.f(csz.i);
         } else {
            $$3.b();
         }

         if ($$4.G() == $$2.G()) {
            return csz.i;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(clh $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof aqi $$0) {
         dad $$1 = $$0.dN();
         csz $$2 = dex.a($$1, this.s).map($$1x -> $$1x.b().a(this.s, $$1.H_())).orElse(csz.i);
         this.p.a(0, $$2);
      }
   }

   public bpf m() {
      return this.s;
   }

   @Override
   public void a(cod $$0, int $$1, csz $$2) {
      this.n();
   }

   @Override
   public void a(cod $$0, int $$1, int $$2) {
   }
}
