import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmn(int b) implements fms {
   public static final MapCodec<fmn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("value").forGetter(fmn::b)).apply($$0, fmn::new));

   public fmn(int b) {
      b = axk.f(b);
      this.b = b;
   }

   @Override
   public int a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2) {
      return this.b;
   }

   @Override
   public MapCodec<fmn> a() {
      return a;
   }
}
