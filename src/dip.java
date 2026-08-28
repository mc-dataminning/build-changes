import com.mojang.serialization.MapCodec;

public class dip extends djx implements djq {
   public static final MapCodec<dip> a = b(dip::new);
   private static final fbv b = fbs.a(djn.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), djn.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   protected dip(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a(djp.ee) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return $$0.b_($$1.d()).c();
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return (double)$$0.A.i() < 0.45;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      dwn.e.a($$0, $$0.m().g(), $$2, $$3, $$1);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
