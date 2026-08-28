import com.mojang.serialization.MapCodec;

public class dmw extends die {
   public static final MapCodec<dmw> a = b(dmw::new);
   private static final int b = 20;

   @Override
   public MapCodec<dmw> a() {
      return a;
   }

   public dmw(dvi.d $$0) {
      super($$0);
   }

   @Override
   public void a(dfb $$0, jh $$1, dvj $$2, bue $$3) {
      if (!$$3.cf() && $$3 instanceof bva) {
         $$3.a($$0.ai().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      dik.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1 == jm.b && $$2.a(dig.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
