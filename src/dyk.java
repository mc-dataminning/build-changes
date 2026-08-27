import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

@Deprecated
public class dyk extends dyl {
   public static final MapCodec<dyk> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dyk::new));

   public dyk(js $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drb $$0) {
      return $$0.e();
   }

   @Override
   public dyb<?> a() {
      return dyb.e;
   }
}
