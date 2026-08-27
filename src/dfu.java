import com.mojang.serialization.MapCodec;

public class dfu extends daa {
   public static final MapCodec<dfu> a = b(dfu::new);

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   public dfu(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean f_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwf $$1, ib $$2, ih $$3) {
      return 15;
   }
}
