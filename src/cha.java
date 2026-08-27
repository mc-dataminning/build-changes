public class cha extends cgm implements cgy {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cic p = new cic();
   private final cgw q;
   private final cdu r;
   private final chc s;

   public cha(int $$0, cdt $$1) {
      super(cht.h, $$0);
      this.r = $$1.m;
      this.q = new cig(10);
      this.s = new cim(this, 3, 3);
      this.a($$1);
   }

   public cha(int $$0, cdt $$1, chc $$2, cgw $$3) {
      super(cht.h, $$0);
      this.r = $$1.m;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.m);
      this.a($$1);
      this.a(this);
   }

   private void a(cdt $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new chb(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cih($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cih($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new chx(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      chb $$2 = (chb)this.b($$0);
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
   public clj a(cdu $$0, int $$1) {
      clj $$2 = clj.b;
      cih $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clj $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return clj.b;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return clj.b;
         }

         if ($$4.b()) {
            $$3.f(clj.b);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clj.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(cdu $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof amf $$0) {
         csa $$1 = $$0.dN();
         clj $$2 = cwt.a($$1, this.s).map($$1x -> $$1x.a(this.s, $$1.H_())).orElse(clj.b);
         this.p.a(0, $$2);
      }
   }

   public biq m() {
      return this.s;
   }

   @Override
   public void a(cgm $$0, int $$1, clj $$2) {
      this.n();
   }

   @Override
   public void a(cgm $$0, int $$1, int $$2) {
   }
}
