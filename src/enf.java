import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enf extends enh {
   public static final MapCodec<enf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dta.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, enf::new)
   );
   private final dta b;
   private final float d;

   public enf(dta $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dta $$0, ayv $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected eni<?> a() {
      return eni.f;
   }
}
