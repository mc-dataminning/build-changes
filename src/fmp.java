import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmp(int b) implements fms {
   public static final MapCodec<fmp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmp::b)).apply($$0, fmp::new));

   @Override
   public int a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2) {
      return czc.a($$0, this.b);
   }

   @Override
   public MapCodec<fmp> a() {
      return a;
   }
}
