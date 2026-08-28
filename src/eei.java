import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eei extends eek {
   public static final MapCodec<eei> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eei::new));

   public eei(km $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dwx $$0) {
      return $$0.v();
   }

   @Override
   public eea<?> a() {
      return eea.f;
   }
}
