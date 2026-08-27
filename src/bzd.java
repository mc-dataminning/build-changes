import java.util.function.Predicate;

public abstract class bzd extends bjk implements byv {
   protected bzd(bip<? extends bzd> $$0, cpq $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public apa da() {
      return apa.f;
   }

   @Override
   public void b_() {
      this.eO();
      this.gf();
      super.b_();
   }

   protected void gf() {
      float $$0 = this.bm();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean S() {
      return true;
   }

   @Override
   protected aoy aL() {
      return aoz.lw;
   }

   @Override
   protected aoy aM() {
      return aoz.lv;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.lt;
   }

   @Override
   protected aoy h_() {
      return aoz.ls;
   }

   @Override
   public bjb.a eE() {
      return new bjb.a(aoz.lu, aoz.lr);
   }

   @Override
   public float a(gw $$0, cpt $$1) {
      return -$$1.v($$0);
   }

   public static boolean a(cqf $$0, gw $$1, arx $$2) {
      if ($$0.a(cpz.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         din $$3 = $$0.x_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cpz.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.C().Y() ? $$0.c($$1, 10) : $$0.z($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bip<? extends bzd> $$0, cqf $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.ai() != bgq.a && a($$1, $$3, $$4) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bip<? extends bzd> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.ai() != bgq.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bkg.a gg() {
      return bjd.x().a(bkh.f);
   }

   @Override
   public boolean ea() {
      return true;
   }

   @Override
   protected boolean eb() {
      return true;
   }

   public boolean f(cbp $$0) {
      return true;
   }

   @Override
   public cja g(cja $$0) {
      if ($$0.d() instanceof cjq) {
         Predicate<cja> $$1 = ((cjq)$$0.d()).e();
         cja $$2 = cjq.a(this, $$1);
         return $$2.b() ? new cja(cjd.nH) : $$2;
      } else {
         return cja.b;
      }
   }
}
