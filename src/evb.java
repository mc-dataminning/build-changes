import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class evb extends eve {
   public static final MapCodec<evb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mg.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, evb::new)
   );
   private final dmm b;
   private final float d;

   public evb(dmm $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(eao $$0, azv $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected evf<?> a() {
      return evf.e;
   }
}
