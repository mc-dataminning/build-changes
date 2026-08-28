import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fpl(int b) implements fpq {
   public static final MapCodec<fpl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ays.i.fieldOf("value").forGetter(fpl::b)).apply($$0, fpl::new));

   public fpl(int b) {
      b = axu.f(b);
      this.b = b;
   }

   @Override
   public int a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2) {
      return this.b;
   }

   @Override
   public MapCodec<fpl> a() {
      return a;
   }
}
