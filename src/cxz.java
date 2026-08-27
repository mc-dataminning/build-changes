import com.mojang.serialization.MapCodec;

public class cxz extends ctc {
   public static final MapCodec<cxz> a = b(cxz::new);
   protected static final eia b = ctc.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<cxz> a() {
      return a;
   }

   public cxz(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   public eia b_(dfd $$0, cph $$1, gw $$2) {
      return ehx.b();
   }

   @Override
   public eia b(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return ehx.b();
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Override
   public float b(dfd $$0, cph $$1, gw $$2) {
      return 0.2F;
   }
}
