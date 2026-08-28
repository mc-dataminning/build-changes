import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eyl(dcd b) implements eyn {
   public static final MapCodec<eyl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dcd.b.fieldOf("amount").forGetter(eyl::c)).apply($$0, eyl::new));

   @Override
   public float b(eug $$0) {
      int $$1 = $$0.b(exc.k);
      return this.b.a($$1);
   }

   @Override
   public eym b() {
      return eyo.g;
   }

   public static eyl a(dcd $$0) {
      return new eyl($$0);
   }

   public dcd c() {
      return this.b;
   }
}
