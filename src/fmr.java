import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmr(float b, float c) implements fms {
   public static final MapCodec<fmr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fmr::b), ayi.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fmr::c))
            .apply($$0, fmr::new)
   );

   public fmr() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2) {
      return dgf.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<fmr> a() {
      return a;
   }
}
