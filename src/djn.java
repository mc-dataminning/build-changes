import com.mojang.serialization.MapCodec;

public abstract class djn extends dfh {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final eui h = dde.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eui i = dde.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eui j = dde.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected djn(dqg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends djn> a();

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      switch ($$0.c(a).o()) {
         case a:
         default:
            return j;
         case c:
            return i;
         case b:
            return h;
      }
   }

   @Override
   protected dqh a(dqh $$0, djr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dqh a(dqh $$0, dib $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
