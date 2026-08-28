import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmp(int b) implements fmu {
   public static final MapCodec<fmp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("value").forGetter(fmp::b)).apply($$0, fmp::new));

   public fmp(int b) {
      b = axk.f(b);
      this.b = b;
   }

   @Override
   public int a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2) {
      return this.b;
   }

   @Override
   public MapCodec<fmp> a() {
      return a;
   }
}
