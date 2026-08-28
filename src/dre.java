import com.mojang.serialization.MapCodec;

public class dre extends djn {
   public static final MapCodec<dre> a = b(dre::new);
   protected static final fbv b = djn.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   public dre(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   protected fbv b_(dwy $$0, dfo $$1, ji $$2) {
      return fbs.b();
   }

   @Override
   protected fbv c(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return fbs.b();
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      dju.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$4 == jn.b && $$6.a(djp.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   @Override
   protected float c(dwy $$0, dfo $$1, ji $$2) {
      return 0.2F;
   }
}
