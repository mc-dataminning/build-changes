import javax.annotation.Nullable;

public class cgc extends cfv {
   private static final btm bZ = btq.w.n().a(0.5F).b(0.665F);

   public cgc(btq<? extends cgc> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bT.a(0, new caw(this));
      this.bT.a(1, new cbv(this, 2.0));
      this.bT.a(2, new cao(this, 1.0));
      this.bT.a(3, new cck(this, 1.25, $$0 -> $$0.a(axb.aa), false));
      this.bT.a(4, new cbb(this, 1.25));
      this.bT.a(5, new ccp(this, 1.0));
      this.bT.a(6, new cbk(this, cnp.class, 6.0F));
      this.bT.a(7, new cbx(this));
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.aa);
   }

   public static bvl.a q() {
      return cfv.gt().a(bvm.s, 10.0).a(bvm.v, 0.2F);
   }

   @Override
   protected awc w() {
      return awd.gc;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.ge;
   }

   @Override
   protected awc n_() {
      return awd.gd;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.gg, 0.15F, 1.0F);
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ($$2.a(cvo.qz) && !this.o_()) {
         $$0.a(awd.gf, 1.0F, 1.0F);
         cvl $$3 = cvn.a($$2, $$0, cvo.qF.w());
         $$0.a($$1, $$3);
         return brk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cgc b(arg $$0, btc $$1) {
      return btq.w.a($$0, btp.e);
   }

   @Override
   public btm e(bur $$0) {
      return this.o_() ? bZ : super.e($$0);
   }
}
