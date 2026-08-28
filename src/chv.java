import javax.annotation.Nullable;

public class chv extends cho {
   private static final bve bZ = bvi.C.n().a(0.5F).b(0.665F);

   public chv(bvi<? extends chv> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccp(this));
      this.bT.a(1, new cdo(this, 2.0));
      this.bT.a(2, new cch(this, 1.0));
      this.bT.a(3, new ced(this, 1.25, $$0 -> $$0.a(axt.af), false));
      this.bT.a(4, new ccu(this, 1.25));
      this.bT.a(5, new cei(this, 1.0));
      this.bT.a(6, new cdd(this, cpo.class, 6.0F));
      this.bT.a(7, new cdq(this));
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.af);
   }

   public static bxe.a p() {
      return cho.gt().a(bxf.s, 10.0).a(bxf.v, 0.2F);
   }

   @Override
   protected awu u() {
      return awv.gd;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.gf;
   }

   @Override
   protected awu o_() {
      return awv.ge;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.gh, 0.15F, 1.0F);
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   public bta b(cpo $$0, bsz $$1) {
      cxg $$2 = $$0.b($$1);
      if ($$2.a(cxk.rf) && !this.e_()) {
         $$0.a(awv.gg, 1.0F, 1.0F);
         cxg $$3 = cxj.a($$2, $$0, cxk.rl.n());
         $$0.a($$1, $$3);
         return bta.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public chv b(arx $$0, bus $$1) {
      return bvi.C.a($$0, bvh.e);
   }

   @Override
   public bve e(bwj $$0) {
      return this.e_() ? bZ : super.e($$0);
   }
}
