import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record frx(int b) implements fsa {
   public static final MapCodec<frx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(azg.i.fieldOf("default").forGetter(frx::b)).apply($$0, frx::new));

   @Override
   public int a(dak $$0, @Nullable glo $$1, @Nullable byf $$2) {
      return dcx.a($$0, this.b);
   }

   @Override
   public MapCodec<frx> a() {
      return a;
   }
}
