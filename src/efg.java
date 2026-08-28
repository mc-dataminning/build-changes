import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class efg extends efi {
   public static final MapCodec<efg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, efg::new));

   public efg(kl $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dxv $$0) {
      return $$0.v();
   }

   @Override
   public eey<?> a() {
      return eey.f;
   }
}
