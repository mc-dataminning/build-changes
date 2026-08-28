import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class esz extends etc {
   public static final MapCodec<esz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(md.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, esz::new)
   );
   private final dku b;
   private final float d;

   public esz(dku $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dym $$0, azs $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected etd<?> a() {
      return etd.e;
   }
}
