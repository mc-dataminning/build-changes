import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epu extends epx {
   public static final MapCodec<epu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lz.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, epu::new)
   );
   private final dij b;
   private final float d;

   public epu(dij $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dvo $$0, azv $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected epy<?> a() {
      return epy.e;
   }
}
