import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqx(float b, float c) implements fqy {
   public static final MapCodec<fqx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fqx::b), ayu.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fqx::c))
            .apply($$0, fqx::new)
   );

   public fqx() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2) {
      return djf.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<fqx> a() {
      return a;
   }
}
