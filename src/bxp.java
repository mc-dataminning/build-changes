import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxp extends bxi {
   public bxp(blj<? extends bxp> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsl(this));
      this.bO.a(1, new btk(this, 2.0));
      this.bO.a(2, new bsd(this, 1.0));
      this.bO.a(3, new btz(this, 1.25, cpi.a(cmk.pt), false));
      this.bO.a(4, new bsq(this, 1.25));
      this.bO.a(5, new bue(this, 1.0));
      this.bO.a(6, new bsz(this, cer.class, 6.0F));
      this.bO.a(7, new btm(this));
   }

   public static bna.a u() {
      return blx.C().a(bnb.l, 10.0).a(bnb.m, 0.2F);
   }

   @Override
   protected arb y() {
      return arc.fy;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.fA;
   }

   @Override
   protected arb n_() {
      return arc.fz;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.fC, 0.15F, 1.0F);
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if ($$2.a(cmk.qv) && !this.o_()) {
         $$0.a(arc.fB, 1.0F, 1.0F);
         cmh $$3 = cmj.a($$2, $$0, cmk.qB.am_());
         $$0.a($$1, $$3);
         return bjl.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public bxp b(amp $$0, bla $$1) {
      return blj.u.a((csy)$$0);
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return this.o_() ? $$1.b * 0.95F : 1.3F;
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, 0.0F);
   }
}
