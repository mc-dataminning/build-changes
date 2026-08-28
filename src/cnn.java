import javax.annotation.Nullable;

public class cnn extends cme {
   public cnn(bvq<? extends cnn> $$0, dhh $$1) {
      super($$0, $$1);
      this.a(eun.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bU.a(3, new cew<>(this, coj.class, true));
      super.B();
   }

   @Override
   protected axe u() {
      return axf.Dc;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.De;
   }

   @Override
   protected axe o_() {
      return axf.Dd;
   }

   @Override
   axe p() {
      return axf.Df;
   }

   @Override
   protected void a(ash $$0, btz $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cmi $$4 && $$4.gp()) {
         $$4.gq();
         this.a($$0, cxs.vc);
      }
   }

   @Override
   protected void a(bam $$0, btg $$1) {
      this.a(bvr.a, new cxo(cxs.pn));
   }

   @Override
   protected void a(dhy $$0, bam $$1, btg $$2) {
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      bwy $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bxn.c).a(4.0);
      this.t();
      return $$4;
   }

   @Override
   public boolean c(ash $$0, bvj $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bwf) {
            ((bwf)$$1).b(new buo(buq.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cqd a(cxo $$0, float $$1, @Nullable cxo $$2) {
      cqd $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(buo $$0) {
      return $$0.a(buq.t) ? false : super.b($$0);
   }
}
