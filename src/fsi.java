import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsi(int b) implements fsn {
   public static final MapCodec<fsi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.i.fieldOf("value").forGetter(fsi::b)).apply($$0, fsi::new));

   public fsi(int b) {
      b = axy.f(b);
      this.b = b;
   }

   @Override
   public int a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2) {
      return this.b;
   }

   @Override
   public MapCodec<fsi> a() {
      return a;
   }
}
