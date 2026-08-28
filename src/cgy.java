import javax.annotation.Nullable;

public class cgy extends cgr {
   private static final buh bY = bul.w.n().a(0.5F).b(0.665F);

   public cgy(bul<? extends cgy> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbs(this));
      this.bS.a(1, new ccr(this, 2.0));
      this.bS.a(2, new cbk(this, 1.0));
      this.bS.a(3, new cdg(this, 1.25, $$0 -> $$0.a(axj.ad), false));
      this.bS.a(4, new cbx(this, 1.25));
      this.bS.a(5, new cdl(this, 1.0));
      this.bS.a(6, new ccg(this, com.class, 6.0F));
      this.bS.a(7, new cct(this));
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.ad);
   }

   public static bwh.a q() {
      return cgr.gz().a(bwi.s, 10.0).a(bwi.v, 0.2F);
   }

   @Override
   protected awk w() {
      return awl.gc;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.ge;
   }

   @Override
   protected awk o_() {
      return awl.gd;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.gg, 0.15F, 1.0F);
   }

   @Override
   protected float fi() {
      return 0.4F;
   }

   @Override
   public bsd b(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      if ($$2.a(cwf.qz) && !this.p_()) {
         $$0.a(awl.gf, 1.0F, 1.0F);
         cwb $$3 = cwe.a($$2, $$0, cwf.qF.o());
         $$0.a($$1, $$3);
         return bsd.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cgy b(arn $$0, btv $$1) {
      return bul.w.a($$0, buk.e);
   }

   @Override
   public buh e(bvm $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
