import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eej extends eek {
   public static final MapCodec<eej> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eej::new));

   public eej(km $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dwx $$0) {
      return $$0.e();
   }

   @Override
   public eea<?> a() {
      return eea.e;
   }
}
