import com.mojang.serialization.MapCodec;

public abstract class dkz extends die implements dky {
   public dkz(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dkz> a();

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (n($$1.a_($$2.e())) && $$2.v() >= $$1.I_()) {
         cku $$4 = cku.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cku $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean n(dvj $$0) {
      return $$0.l() || $$0.a(axa.aL) || $$0.n() || $$0.v();
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      if ($$3.a(16) == 0) {
         jh $$4 = $$2.e();
         if (n($$1.a_($$4))) {
            azo.a($$1, $$2, $$3, new lj(lr.C, $$0));
         }
      }
   }

   public int b(dvj $$0, deg $$1, jh $$2) {
      return -16777216;
   }
}
