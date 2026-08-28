import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fms(float b, float c) implements fmt {
   public static final MapCodec<fms> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fms::b), ayi.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fms::c))
            .apply($$0, fms::new)
   );

   public fms() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(cwp $$0) {
      return dgg.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<fms> a() {
      return a;
   }
}
