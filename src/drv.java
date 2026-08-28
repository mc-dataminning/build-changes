import com.mojang.serialization.MapCodec;

public class drv extends djv implements djo {
   public static final MapCodec<drv> a = b(drv::new);
   protected static final float b = 6.0F;
   protected static final fbt c = djl.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<drv> a() {
      return a;
   }

   protected drv(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return o($$2).m().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      dlu.a($$0, o($$3).m(), $$2, 2);
   }

   private static dlu o(dww $$0) {
      return (dlu)($$0.a(djn.bB) ? djn.jg : djn.jf);
   }
}
