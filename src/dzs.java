import com.mojang.serialization.MapCodec;

class dzs implements dzg {
   public static dzs a = new dzs();
   public static final MapCodec<dzs> e = MapCodec.unit(() -> a);

   private dzs() {
   }

   public boolean a(dcz $$0, ja $$1) {
      return true;
   }

   @Override
   public dzh<?> a() {
      return dzh.l;
   }
}
