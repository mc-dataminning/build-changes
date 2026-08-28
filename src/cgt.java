import javax.annotation.Nullable;

public class cgt extends cgm {
   private static final buc bY = bug.w.n().a(0.5F).b(0.665F);

   public cgt(bug<? extends cgt> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbn(this));
      this.bS.a(1, new ccm(this, 2.0));
      this.bS.a(2, new cbf(this, 1.0));
      this.bS.a(3, new cdb(this, 1.25, $$0 -> $$0.a(axi.ab), false));
      this.bS.a(4, new cbs(this, 1.25));
      this.bS.a(5, new cdg(this, 1.0));
      this.bS.a(6, new ccb(this, coh.class, 6.0F));
      this.bS.a(7, new cco(this));
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.ab);
   }

   public static bwc.a q() {
      return cgm.gA().a(bwd.s, 10.0).a(bwd.v, 0.2F);
   }

   @Override
   protected awj w() {
      return awk.gc;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.ge;
   }

   @Override
   protected awj o_() {
      return awk.gd;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.gg, 0.15F, 1.0F);
   }

   @Override
   protected float fi() {
      return 0.4F;
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$2.a(cwb.qz) && !this.p_()) {
         $$0.a(awk.gf, 1.0F, 1.0F);
         cvx $$3 = cwa.a($$2, $$0, cwb.qF.o());
         $$0.a($$1, $$3);
         return bry.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cgt b(arm $$0, btq $$1) {
      return bug.w.a($$0, buf.e);
   }

   @Override
   public buc e(bvh $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
