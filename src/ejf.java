import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ejf extends ejh {
   public static final MapCodec<ejf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ejf::new));

   public ejf(kb $$0) {
      super($$0);
   }

   @Override
   protected boolean a(ebq $$0) {
      return $$0.v();
   }

   @Override
   public eix<?> a() {
      return eix.f;
   }
}
