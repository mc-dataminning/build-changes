import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fpp(float b, float c) implements fpq {
   public static final MapCodec<fpp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ays.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fpp::b), ays.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fpp::c))
            .apply($$0, fpp::new)
   );

   public fpp() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2) {
      return din.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<fpp> a() {
      return a;
   }
}
