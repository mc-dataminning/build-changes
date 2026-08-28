import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fmo(int b) implements fmr {
   public static final MapCodec<fmo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayh.i.fieldOf("default").forGetter(fmo::b)).apply($$0, fmo::new));

   @Override
   public int a(cwn $$0) {
      return czb.a($$0, this.b);
   }

   @Override
   public MapCodec<fmo> a() {
      return a;
   }
}
