import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmo(int b) implements fmt {
   public static final MapCodec<fmo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("value").forGetter(fmo::b)).apply($$0, fmo::new));

   public fmo(int b) {
      b = axk.f(b);
      this.b = b;
   }

   @Override
   public int a(cwp $$0, @Nullable gfz $$1, @Nullable bvh $$2) {
      return this.b;
   }

   @Override
   public MapCodec<fmo> a() {
      return a;
   }
}
