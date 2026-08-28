import com.mojang.serialization.MapCodec;

public class dom extends djl {
   public static final MapCodec<dom> a = b(dom::new);
   protected static final fbt b = djl.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dom> a() {
      return a;
   }

   public dom(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   protected fbt b_(dww $$0, dfm $$1, ji $$2) {
      return fbq.b();
   }

   @Override
   protected fbt c(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return fbq.b();
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   @Override
   protected float c(dww $$0, dfm $$1, ji $$2) {
      return 0.2F;
   }
}
