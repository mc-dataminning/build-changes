import com.mojang.serialization.MapCodec;

public class dke extends dff {
   public static final MapCodec<dke> a = b(dke::new);
   protected static final ews b = dff.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   public dke(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ews b(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected ews b_(dsh $$0, dbj $$1, ja $$2) {
      return ewp.b();
   }

   @Override
   protected ews c(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return ewp.b();
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   @Override
   protected float d(dsh $$0, dbj $$1, ja $$2) {
      return 0.2F;
   }
}
