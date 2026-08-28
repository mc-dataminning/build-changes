import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eey extends efa {
   public static final MapCodec<eey> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eey::new));

   public eey(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dxn $$0) {
      return $$0.v();
   }

   @Override
   public eeq<?> a() {
      return eeq.f;
   }
}
