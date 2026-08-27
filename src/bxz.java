import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxz extends bxs {
   public bxz(blt<? extends bxz> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsv(this));
      this.bO.a(1, new btu(this, 2.0));
      this.bO.a(2, new bsn(this, 1.0));
      this.bO.a(3, new buj(this, 1.25, cps.a(cmu.pt), false));
      this.bO.a(4, new bta(this, 1.25));
      this.bO.a(5, new buo(this, 1.0));
      this.bO.a(6, new btj(this, cfb.class, 6.0F));
      this.bO.a(7, new btw(this));
   }

   public static bnk.a u() {
      return bmh.C().a(bnl.l, 10.0).a(bnl.m, 0.2F);
   }

   @Override
   protected arl y() {
      return arm.fy;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.fA;
   }

   @Override
   protected arl n_() {
      return arm.fz;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.fC, 0.15F, 1.0F);
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if ($$2.a(cmu.qv) && !this.o_()) {
         $$0.a(arm.fB, 1.0F, 1.0F);
         cmr $$3 = cmt.a($$2, $$0, cmu.qB.am_());
         $$0.a($$1, $$3);
         return bjv.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public bxz b(amz $$0, blk $$1) {
      return blt.u.a((cti)$$0);
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return this.o_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
