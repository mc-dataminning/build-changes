import com.mojang.serialization.MapCodec;

class ebp implements ebd {
   public static ebp a = new ebp();
   public static final MapCodec<ebp> e = MapCodec.unit(() -> a);

   private ebp() {
   }

   public boolean a(dep $$0, je $$1) {
      return true;
   }

   @Override
   public ebe<?> a() {
      return ebe.l;
   }
}
