import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class eeh extends eei {
   public static final MapCodec<eeh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eeh::new));

   public eeh(km $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dwv $$0) {
      return $$0.e();
   }

   @Override
   public edy<?> a() {
      return edy.e;
   }
}
