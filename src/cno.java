import javax.annotation.Nullable;

public class cno extends cmf {
   public cno(bvr<? extends cno> $$0, dhi $$1) {
      super($$0, $$1);
      this.a(euo.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bU.a(3, new cex<>(this, cok.class, true));
      super.B();
   }

   @Override
   protected axe u() {
      return axf.Dc;
   }

   @Override
   protected axe e(bua $$0) {
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
   protected void a(ash $$0, bua $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$1.d() instanceof cmj $$4 && $$4.gp()) {
         $$4.gq();
         this.a($$0, cxt.vc);
      }
   }

   @Override
   protected void a(bam $$0, bth $$1) {
      this.a(bvs.a, new cxp(cxt.pn));
   }

   @Override
   protected void a(dhz $$0, bam $$1, bth $$2) {
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      bwz $$4 = super.a($$0, $$1, $$2, $$3);
      this.g(bxo.c).a(4.0);
      this.t();
      return $$4;
   }

   @Override
   public boolean c(ash $$0, bvk $$1) {
      if (!super.c($$0, $$1)) {
         return false;
      } else {
         if ($$1 instanceof bwg) {
            ((bwg)$$1).b(new bup(bur.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cqe a(cxp $$0, float $$1, @Nullable cxp $$2) {
      cqe $$3 = super.a($$0, $$1, $$2);
      $$3.d(100.0F);
      return $$3;
   }

   @Override
   public boolean b(bup $$0) {
      return $$0.a(bur.t) ? false : super.b($$0);
   }
}
