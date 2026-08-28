import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fnp(float b, float c) implements fnq {
   public static final MapCodec<fnp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayi.a(0.0F, 1.0F).fieldOf("temperature").forGetter(fnp::b), ayi.a(0.0F, 1.0F).fieldOf("downfall").forGetter(fnp::c))
            .apply($$0, fnp::new)
   );

   public fnp() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2) {
      return dgx.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<fnp> a() {
      return a;
   }
}
