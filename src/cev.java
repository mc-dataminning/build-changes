import javax.annotation.Nullable;

public class cev extends ceo {
   private static final bsg ca = bsj.w.n().a(0.5F).b(0.665F);

   public cev(bsj<? extends cev> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzq(this));
      this.bU.a(1, new cap(this, 2.0));
      this.bU.a(2, new bzi(this, 1.0));
      this.bU.a(3, new cbe(this, 1.25, $$0 -> $$0.a(awd.aa), false));
      this.bU.a(4, new bzv(this, 1.25));
      this.bU.a(5, new cbj(this, 1.0));
      this.bU.a(6, new cae(this, cmh.class, 6.0F));
      this.bU.a(7, new car(this));
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.aa);
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 10.0).a(bug.v, 0.2F);
   }

   @Override
   protected ave v() {
      return avf.gb;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.gd;
   }

   @Override
   protected ave o_() {
      return avf.gc;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.gf, 0.15F, 1.0F);
   }

   @Override
   protected float fa() {
      return 0.4F;
   }

   @Override
   public bqd b(cmh $$0, bqc $$1) {
      cua $$2 = $$0.b($$1);
      if ($$2.a(cud.qy) && !this.p_()) {
         $$0.a(avf.ge, 1.0F, 1.0F);
         cua $$3 = cuc.a($$2, $$0, cud.qE.w());
         $$0.a($$1, $$3);
         return bqd.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cev b(aqk $$0, brx $$1) {
      return bsj.w.a((dcd)$$0);
   }

   @Override
   public bsg e(btk $$0) {
      return this.p_() ? ca : super.e($$0);
   }
}
