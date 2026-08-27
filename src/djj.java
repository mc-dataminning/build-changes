import com.mojang.serialization.MapCodec;

public class djj extends dby {
   public static final MapCodec<djj> a = b(djj::new);
   protected static final est b = dby.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   public djj(doy.d $$0) {
      super($$0);
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   protected est b_(doz $$0, cyd $$1, ib $$2) {
      return esq.b();
   }

   @Override
   protected est c(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return esq.b();
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      dce.b($$1, $$2.c(), $$0);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && $$2.a(dca.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   @Override
   protected float d(doz $$0, cyd $$1, ib $$2) {
      return 0.2F;
   }
}
