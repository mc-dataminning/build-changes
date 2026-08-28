import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record foi(int b) implements fon {
   public static final MapCodec<foi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.i.fieldOf("value").forGetter(foi::b)).apply($$0, foi::new));

   public foi(int b) {
      b = axu.f(b);
      this.b = b;
   }

   @Override
   public int a(cxy $$0, @Nullable ghz $$1, @Nullable bwr $$2) {
      return this.b;
   }

   @Override
   public MapCodec<foi> a() {
      return a;
   }
}
