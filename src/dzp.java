import com.mojang.serialization.MapCodec;

class dzp implements dzd {
   public static dzp a = new dzp();
   public static final MapCodec<dzp> e = MapCodec.unit(() -> a);

   private dzp() {
   }

   public boolean a(dcv $$0, iz $$1) {
      return true;
   }

   @Override
   public dze<?> a() {
      return dze.l;
   }
}
