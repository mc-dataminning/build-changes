import com.mojang.serialization.MapCodec;

class dzo implements dzc {
   public static dzo a = new dzo();
   public static final MapCodec<dzo> e = MapCodec.unit(() -> a);

   private dzo() {
   }

   public boolean a(dcu $$0, iz $$1) {
      return true;
   }

   @Override
   public dzd<?> a() {
      return dzd.l;
   }
}
