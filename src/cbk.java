import org.joml.Vector3f;

public class cbk extends ccg {
   public cbk(bkz<? extends cbk> $$0, csf $$1) {
      super($$0, $$1);
   }

   public static boolean a(bkz<cbk> $$0, csu $$1, blp $$2, hx $$3, atw $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && ($$2 == blp.c || $$1.g($$3));
   }

   @Override
   protected boolean ae_() {
      return false;
   }

   @Override
   protected aqu y() {
      return aqv.lR;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.lU;
   }

   @Override
   protected aqu n_() {
      return aqv.lT;
   }

   @Override
   protected aqu A() {
      return aqv.lV;
   }

   @Override
   public boolean C(bkv $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eU().b() && $$0 instanceof bll) {
         float $$2 = this.dN().d_(this.dn()).b();
         ((bll)$$0).b(new bki(bkk.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gg() {
      return true;
   }

   @Override
   protected void gi() {
      this.b(bkz.bp);
      if (!this.aU()) {
         this.dN().a(null, 1041, this.dn(), 0);
      }
   }

   @Override
   protected clo gf() {
      return clo.b;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
