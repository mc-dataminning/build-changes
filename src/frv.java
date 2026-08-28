import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record frv(int b) implements fsa {
   public static final MapCodec<frv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.i.fieldOf("value").forGetter(frv::b)).apply($$0, frv::new));

   public frv(int b) {
      b = ayh.f(b);
      this.b = b;
   }

   @Override
   public int a(dak $$0, @Nullable glo $$1, @Nullable byf $$2) {
      return this.b;
   }

   @Override
   public MapCodec<frv> a() {
      return a;
   }
}
