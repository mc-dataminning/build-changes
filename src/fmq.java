import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fmq(float b, float c) implements fmr {
   public static final MapCodec<fmq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayh.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fmq::b), ayh.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fmq::c))
            .apply($$0, fmq::new)
   );

   public fmq() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(cwn $$0) {
      return dge.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<fmq> a() {
      return a;
   }
}
