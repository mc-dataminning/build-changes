import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eum extends eup {
   public static final MapCodec<eum> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mf.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, eum::new)
   );
   private final dma b;
   private final float d;

   public eum(dma $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dzz $$0, azv $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected euq<?> a() {
      return euq.e;
   }
}
