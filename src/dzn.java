import com.mojang.serialization.MapCodec;

class dzn implements dzb {
   public static dzn a = new dzn();
   public static final MapCodec<dzn> e = MapCodec.unit(() -> a);

   private dzn() {
   }

   public boolean a(dct $$0, iz $$1) {
      return true;
   }

   @Override
   public dzc<?> a() {
      return dzc.l;
   }
}
