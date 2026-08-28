import com.mojang.serialization.MapCodec;

class dzm implements dza {
   public static dzm a = new dzm();
   public static final MapCodec<dzm> e = MapCodec.unit(() -> a);

   private dzm() {
   }

   public boolean a(dcs $$0, iz $$1) {
      return true;
   }

   @Override
   public dzb<?> a() {
      return dzb.l;
   }
}
