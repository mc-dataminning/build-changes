import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fmr(int b) implements fmu {
   public static final MapCodec<fmr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fmr::b)).apply($$0, fmr::new));

   @Override
   public int a(cwq $$0, @Nullable gga $$1, @Nullable bvi $$2) {
      return cze.a($$0, this.b);
   }

   @Override
   public MapCodec<fmr> a() {
      return a;
   }
}
