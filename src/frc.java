import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record frc(float b, float c) implements frd {
   public static final MapCodec<frc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ayu.a(0.0F, 1.0F).fieldOf("temperature").forGetter(frc::b), ayu.a(0.0F, 1.0F).fieldOf("downfall").forGetter(frc::c))
            .apply($$0, frc::new)
   );

   public frc() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2) {
      return djk.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<frc> a() {
      return a;
   }
}
