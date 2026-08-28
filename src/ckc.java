public class ckc extends ckm {
   public ckc(bsx<? extends ckc> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public static buv.a s() {
      return ckd.gq().a(buw.v, 0.2F);
   }

   public static boolean b(bsx<ckc> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.al() != bqo.a;
   }

   @Override
   public void a(int $$0, boolean $$1) {
      super.a($$0, $$1);
      this.f(buw.a).a((double)($$0 * 3));
   }

   @Override
   public float bu() {
      return 1.0F;
   }

   @Override
   protected lk t() {
      return lm.F;
   }

   @Override
   public boolean bR() {
      return false;
   }

   @Override
   protected int x() {
      return super.x() * 4;
   }

   @Override
   protected void gg() {
      this.e *= 0.9F;
   }

   @Override
   public void ff() {
      exc $$0 = this.dr();
      float $$1 = (float)this.gl() * 0.1F;
      this.n($$0.c, (double)(this.fd() + $$1), $$0.e);
      this.av = true;
   }

   @Override
   protected void c(awu<epd> $$0) {
      if ($$0 == awk.b) {
         exc $$1 = this.dr();
         this.n($$1.c, (double)(0.22F + (float)this.gl() * 0.05F), $$1.e);
         this.av = true;
      } else {
         super.c($$0);
      }
   }

   @Override
   protected boolean gh() {
      return this.db();
   }

   @Override
   protected float gi() {
      return super.gi() + 2.0F;
   }

   @Override
   protected avo d(brk $$0) {
      return this.gm() ? avp.ot : avp.os;
   }

   @Override
   protected avo n_() {
      return this.gm() ? avp.oh : avp.or;
   }

   @Override
   protected avo gj() {
      return this.gm() ? avp.ow : avp.ov;
   }

   @Override
   protected avo gk() {
      return avp.ou;
   }
}
