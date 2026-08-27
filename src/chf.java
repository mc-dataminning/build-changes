public class chf extends cgr implements chd {
   protected static final int k = 9;
   private static final int l = 9;
   private static final int m = 36;
   private static final int n = 36;
   private static final int o = 45;
   private final cih p = new cih();
   private final chb q;
   private final cdz r;
   private final chh s;

   public chf(int $$0, cdy $$1) {
      super(chy.h, $$0);
      this.r = $$1.m;
      this.q = new cil(10);
      this.s = new cir(this, 3, 3);
      this.a($$1);
   }

   public chf(int $$0, cdy $$1, chh $$2, chb $$3) {
      super(chy.h, $$0);
      this.r = $$1.m;
      this.q = $$3;
      this.s = $$2;
      a($$2, 9);
      $$2.d_($$1.m);
      this.a($$1);
      this.a(this);
   }

   private void a(cdy $$0) {
      for (int $$1 = 0; $$1 < 3; $$1++) {
         for (int $$2 = 0; $$2 < 3; $$2++) {
            int $$3 = $$2 + $$1 * 3;
            this.a(new chg(this.s, $$3, 26 + $$2 * 18, 17 + $$1 * 18, this));
         }
      }

      for (int $$4 = 0; $$4 < 3; $$4++) {
         for (int $$5 = 0; $$5 < 9; $$5++) {
            this.a(new cim($$0, $$5 + $$4 * 9 + 9, 8 + $$5 * 18, 84 + $$4 * 18));
         }
      }

      for (int $$6 = 0; $$6 < 9; $$6++) {
         this.a(new cim($$0, $$6, 8 + $$6 * 18, 142));
      }

      this.a(new cic(this.p, 0, 134, 35));
      this.a(this.q);
      this.n();
   }

   public void a(int $$0, boolean $$1) {
      chg $$2 = (chg)this.b($$0);
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
   public clo a(cdz $$0, int $$1) {
      clo $$2 = clo.b;
      cim $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clo $$4 = $$3.f();
         $$2 = $$4.p();
         if ($$1 < 9) {
            if (!this.a($$4, 9, 45, true)) {
               return clo.b;
            }
         } else if (!this.a($$4, 0, 9, false)) {
            return clo.b;
         }

         if ($$4.b()) {
            $$3.f(clo.b);
         } else {
            $$3.b();
         }

         if ($$4.L() == $$2.L()) {
            return clo.b;
         }

         $$3.a($$0, $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(cdz $$0) {
      return this.s.a($$0);
   }

   private void n() {
      if (this.r instanceof amj $$0) {
         csf $$1 = $$0.dN();
         clo $$2 = cwy.a($$1, this.s).map($$1x -> $$1x.a(this.s, $$1.I_())).orElse(clo.b);
         this.p.a(0, $$2);
      }
   }

   public biu m() {
      return this.s;
   }

   @Override
   public void a(cgr $$0, int $$1, clo $$2) {
      this.n();
   }

   @Override
   public void a(cgr $$0, int $$1, int $$2) {
   }
}
