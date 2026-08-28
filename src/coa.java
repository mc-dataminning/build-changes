import javax.annotation.Nullable;

public class coa extends cmr {
   public coa(bwb<? extends coa> $$0, dhp $$1) {
      super($$0, $$1);
      this.a(evk.i, 8.0F);
   }

   @Override
   protected void D() {
      this.bC.a(3, new cfg<>(this, cow.class, true));
      super.D();
   }

   @Override
   protected awj u() {
      return awk.DB;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.DD;
   }

   @Override
   protected awj l_() {
      return awk.DC;
   }

   @Override
   awj m() {
      return awk.DE;
   }

   @Override
   public axp<cxu> Y() {
      return null;
   }

   @Override
   public boolean h(cxy $$0) {
      return !$$0.a(axi.bW) && super.h($$0);
   }

   @Override
   protected void a(arn $$0, buh $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cmv $$4 && $$4.x()) {
         $$4.gq();
         this.a($$0, cyc.vp);
      }
   }

   @Override
   protected void a(azs $$0, bto $$1) {
      this.a(bwc.a, new cxy(cyc.pA));
   }

   @Override
   protected void a(dig $$0, azs $$1, bto $$2) {
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      bxj $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bxx.c).a(4.0);
      this.n();
      return $$4;
   }

   @Override
   public boolean c(arn $$0, bvs $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bwr) {
            ((bwr)$$1).b(new buw(buy.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cqp a(cxy $$0, float $$1, @Nullable cxy $$2) {
      cqp $$3 = super.a($$0, $$1, $$2);
      $$3.e(100.0F);
      return $$3;
   }

   @Override
   public boolean b(buw $$0) {
      return $$0.a(buy.t) ? false : super.b($$0);
   }
}
