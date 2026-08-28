import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eca extends ecc {
   public static final MapCodec<eca> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eca::new));

   public eca(ki $$0) {
      super($$0);
   }

   @Override
   protected boolean a(duo $$0) {
      return $$0.v();
   }

   @Override
   public ebs<?> a() {
      return ebs.f;
   }
}
