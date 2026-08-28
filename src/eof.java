import com.mojang.serialization.MapCodec;

public class eof extends epc {
   public static final MapCodec<eof> a = MapCodec.unit(() -> eof.b);
   public static final eof b = new eof();

   private eof() {
   }

   @Override
   public boolean a(dus $$0, azn $$1) {
      return true;
   }

   @Override
   protected epd<?> a() {
      return epd.a;
   }
}
