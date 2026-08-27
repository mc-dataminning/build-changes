import org.joml.Vector3f;

public class cbw extends ccs {
   public cbw(blj<? extends cbw> $$0, csy $$1) {
      super($$0, $$1);
   }

   public static boolean a(blj<cbw> $$0, ctn $$1, blz $$2, hv $$3, auf $$4) {
      return b($$0, $$1, $$2, $$3, $$4) && (blz.a($$2) || $$1.g($$3));
   }

   @Override
   protected boolean ae_() {
      return false;
   }

   @Override
   protected arb y() {
      return arc.ml;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.mo;
   }

   @Override
   protected arb n_() {
      return arc.mn;
   }

   @Override
   protected arb A() {
      return arc.mp;
   }

   @Override
   public boolean C(blf $$0) {
      boolean $$1 = super.C($$0);
      if ($$1 && this.eT().b() && $$0 instanceof blv) {
         float $$2 = this.dM().d_(this.dm()).b();
         ((blv)$$0).b(new bks(bku.q, 140 * (int)$$2), this);
      }

      return $$1;
   }

   @Override
   protected boolean gf() {
      return true;
   }

   @Override
   protected void gh() {
      this.b(blj.br);
      if (!this.aU()) {
         this.dM().a(null, 1041, this.dm(), 0);
      }
   }

   @Override
   protected cmh ge() {
      return cmh.f;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.125F * $$2, 0.0F);
   }
}
