import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dyj extends dyl {
   public static final MapCodec<dyj> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, dyj::new));

   public dyj(js $$0) {
      super($$0);
   }

   @Override
   protected boolean a(drb $$0) {
      return $$0.r();
   }

   @Override
   public dyb<?> a() {
      return dyb.f;
   }
}
