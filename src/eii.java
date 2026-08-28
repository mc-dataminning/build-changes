import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eii extends eik {
   public static final MapCodec<eii> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eii::new));

   public eii(ka $$0) {
      super($$0);
   }

   @Override
   protected boolean a(eat $$0) {
      return $$0.v();
   }

   @Override
   public eia<?> a() {
      return eia.f;
   }
}
