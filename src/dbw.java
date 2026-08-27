import com.mojang.serialization.MapCodec;

public class dbw extends cwy {
   public static final MapCodec<dbw> a = b(dbw::new);
   protected static final emv b = cwy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dbw> a() {
      return a;
   }

   public dbw(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv b(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return b;
   }

   @Override
   public emv b_(djp $$0, ctd $$1, hx $$2) {
      return ems.b();
   }

   @Override
   public emv c(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return ems.b();
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   @Override
   public float d(djp $$0, ctd $$1, hx $$2) {
      return 0.2F;
   }
}
