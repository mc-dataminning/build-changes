import javax.annotation.Nullable;

public class cfm extends cff {
   private static final bsx bY = bta.w.n().a(0.5F).b(0.665F);

   public cfm(bta<? extends cfm> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new cah(this));
      this.bS.a(1, new cbg(this, 2.0));
      this.bS.a(2, new bzz(this, 1.0));
      this.bS.a(3, new cbv(this, 1.25, $$0 -> $$0.a(awy.aa), false));
      this.bS.a(4, new cam(this, 1.25));
      this.bS.a(5, new cca(this, 1.0));
      this.bS.a(6, new cav(this, cmx.class, 6.0F));
      this.bS.a(7, new cbi(this));
   }

   @Override
   public boolean o(cup $$0) {
      return $$0.a(awy.aa);
   }

   public static buw.a s() {
      return btr.A().a(bux.q, 10.0).a(bux.r, 0.2F);
   }

   @Override
   protected avz v() {
      return awa.gb;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.gd;
   }

   @Override
   protected avz o_() {
      return awa.gc;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      cup $$2 = $$0.b($$1);
      if ($$2.a(cus.qy) && !this.p_()) {
         $$0.a(awa.ge, 1.0F, 1.0F);
         cup $$3 = cur.a($$2, $$0, cus.qE.w());
         $$0.a($$1, $$3);
         return bqu.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cfm b(arf $$0, bso $$1) {
      return bta.w.a((dby)$$0);
   }

   @Override
   public bsx e(bub $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
