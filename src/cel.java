import javax.annotation.Nullable;

public class cel extends cee {
   private static final brx bY = bsa.w.n().a(0.5F).b(0.665F);

   public cel(bsa<? extends cel> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzg(this));
      this.bS.a(1, new caf(this, 2.0));
      this.bS.a(2, new byy(this, 1.0));
      this.bS.a(3, new cau(this, 1.25, $$0 -> $$0.a(awe.aa), false));
      this.bS.a(4, new bzl(this, 1.25));
      this.bS.a(5, new caz(this, 1.0));
      this.bS.a(6, new bzu(this, clw.class, 6.0F));
      this.bS.a(7, new cah(this));
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.aa);
   }

   public static btv.a s() {
      return bsq.A().a(btw.q, 10.0).a(btw.r, 0.2F);
   }

   @Override
   protected avg v() {
      return avh.gb;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.gd;
   }

   @Override
   protected avg o_() {
      return avh.gc;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fe() {
      return 0.4F;
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if ($$2.a(ctr.qy) && !this.p_()) {
         $$0.a(avh.ge, 1.0F, 1.0F);
         cto $$3 = ctq.a($$2, $$0, ctr.qE.v());
         $$0.a($$1, $$3);
         return bpu.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cel b(aqm $$0, bro $$1) {
      return bsa.w.a((dax)$$0);
   }

   @Override
   public brx e(bta $$0) {
      return this.p_() ? bY : super.e($$0);
   }
}
