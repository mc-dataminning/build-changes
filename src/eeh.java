import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eeh extends eej {
   public static final MapCodec<eeh> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eeh::new));

   public eeh(km $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dww $$0) {
      return $$0.v();
   }

   @Override
   public edz<?> a() {
      return edz.f;
   }
}
