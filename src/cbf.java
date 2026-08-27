import org.joml.Vector3f;

public class cbf extends ccb {
   public cbf(bku<? extends cbf> $$0, csa $$1) {
      super($$0, $$1);
   }

   public static boolean a(bku<cbf> $$0, csp $$1, blk $$2, ht $$3, ats $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == blk.c || $$1.g($$3));
   }

   @Override
   protected boolean ad_() {
      return false;
   }

   @Override
   protected aqq y() {
      return aqr.lR;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.lU;
   }

   @Override
   protected aqq m_() {
      return aqr.lT;
   }

   @Override
   protected aqq A() {
      return aqr.lV;
   }

   @Override
   public boolean C(bkq $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eU().b() && $$0 instanceof blg) {
         float $$2 = this.dN().d_(this.dn()).b();
         ((blg)$$0).b(new bkd(bkf.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gg() {
      return true;
   }

   @Override
   protected void gi() {
      this.b(bku.bp);
      if (!this.aU()) {
         this.dN().a(null, 1041, this.dn(), 0);
      }
   }

   @Override
   protected clj gf() {
      return clj.b;
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
