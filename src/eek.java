import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eek extends eel {
   public static final MapCodec<eek> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eek::new));

   public eek(km $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dwy $$0) {
      return $$0.e();
   }

   @Override
   public eeb<?> a() {
      return eeb.e;
   }
}
