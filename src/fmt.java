import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmt(float b, float c) implements fmu {
   public static final MapCodec<fmt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fmt::b), ayi.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fmt::c))
            .apply($$0, fmt::new)
   );

   public fmt() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2) {
      return dgh.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<fmt> a() {
      return a;
   }
}
