import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class ebm extends ebo {
   public static final MapCodec<ebm> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ebm::new));

   public ebm(ki $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dua $$0) {
      return $$0.v();
   }

   @Override
   public ebe<?> a() {
      return ebe.f;
   }
}
