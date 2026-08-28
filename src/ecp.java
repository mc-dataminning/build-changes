import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ecp extends ecr {
   public static final MapCodec<ecp> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ecp::new));

   public ecp(kk $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dvd $$0) {
      return $$0.v();
   }

   @Override
   public ech<?> a() {
      return ech.f;
   }
}
