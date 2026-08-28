import com.mojang.serialization.MapCodec;

public class drc extends djl {
   public static final MapCodec<drc> a = b(drc::new);
   protected static final fbt b = djl.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<drc> a() {
      return a;
   }

   public drc(dwv.d $$0) {
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
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      djs.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4 == jn.b && $$6.a(djn.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      $$1.a($$2, this, 20);
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
