import com.mojang.serialization.MapCodec;

public abstract class dmk extends djn implements dmj {
   public dmk(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmk> a();

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      $$2.a($$3, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.L_()) {
         clc $$4 = clc.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(clc $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dwy $$0) {
      return $$0.l() || $$0.a(awp.aN) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$3.a(16) == 0) {
         ji $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azd.a($$1, $$2, $$3, new ll(lt.C, $$0));
         }
      }
   }

   public int b(dwy $$0, dfo $$1, ji $$2) {
      return -16777216;
   }
}
