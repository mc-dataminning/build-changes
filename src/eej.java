import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eej extends eel {
   public static final MapCodec<eej> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eej::new));

   public eej(km $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dwy $$0) {
      return $$0.v();
   }

   @Override
   public eeb<?> a() {
      return eeb.f;
   }
}
