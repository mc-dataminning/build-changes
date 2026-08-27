import javax.annotation.Nullable;

public class cen extends ceg {
   private static final brz bY = bsc.w.n().a(0.5F).b(0.665F);

   public cen(bsc<? extends cen> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzi(this));
      this.bS.a(1, new cah(this, 2.0));
      this.bS.a(2, new bza(this, 1.0));
      this.bS.a(3, new caw(this, 1.25, $$0 -> $$0.a(awf.aa), false));
      this.bS.a(4, new bzn(this, 1.25));
      this.bS.a(5, new cbb(this, 1.0));
      this.bS.a(6, new bzw(this, cly.class, 6.0F));
      this.bS.a(7, new caj(this));
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.aa);
   }

   public static btx.a s() {
      return bss.A().a(bty.q, 10.0).a(bty.r, 0.2F);
   }

   @Override
   protected avh v() {
      return avi.gb;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.gd;
   }

   @Override
   protected avh o_() {
      return avi.gc;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if ($$2.a(ctt.qy) && !this.p_()) {
         $$0.a(avi.ge, 1.0F, 1.0F);
         ctq $$3 = cts.a($$2, $$0, ctt.qE.w());
         $$0.a($$1, $$3);
         return bpw.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cen b(aqn $$0, brq $$1) {
      return bsc.w.a((daz)$$0);
   }

   @Override
   public brz e(btc $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
