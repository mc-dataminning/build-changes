import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record frz(float b, float c) implements fsa {
   public static final MapCodec<frz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(azg.a(0.0F, 1.0F).fieldOf("temperature").forGetter(frz::b), azg.a(0.0F, 1.0F).fieldOf("downfall").forGetter(frz::c))
            .apply($$0, frz::new)
   );

   public frz() {
      this(0.5F, 1.0F);
   }

   @Override
   public int a(dak $$0, @Nullable glo $$1, @Nullable byf $$2) {
      return dkh.a((double)this.b, (double)this.c);
   }

   @Override
   public MapCodec<frz> a() {
      return a;
   }
}
