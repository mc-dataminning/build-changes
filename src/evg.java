import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class evg extends evj {
   public static final MapCodec<evg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, evg::new)
   );
   private final dmr b;
   private final float d;

   public evg(dmr $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(eat $$0, azv $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected evk<?> a() {
      return evk.e;
   }
}
