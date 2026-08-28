import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eiv extends eix {
   public static final MapCodec<eiv> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eiv::new));

   public eiv(kb $$0) {
      super($$0);
   }

   @Override
   protected boolean a(ebg $$0) {
      return $$0.v();
   }

   @Override
   public ein<?> a() {
      return ein.f;
   }
}
