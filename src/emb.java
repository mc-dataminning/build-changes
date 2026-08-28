import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emb extends emd {
   public static final MapCodec<emb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsb.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, emb::new)
   );
   private final dsb b;
   private final float d;

   public emb(dsb $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dsb $$0, azg $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected eme<?> a() {
      return eme.f;
   }
}
