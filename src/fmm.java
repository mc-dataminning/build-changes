import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fmm(int b) implements fmr {
   public static final MapCodec<fmm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayh.i.fieldOf("value").forGetter(fmm::b)).apply($$0, fmm::new));

   public fmm(int b) {
      b = axj.f(b);
      this.b = b;
   }

   @Override
   public int a(cwn $$0) {
      return this.b;
   }

   @Override
   public MapCodec<fmm> a() {
      return a;
   }
}
