import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsk(int b) implements fsn {
   public static final MapCodec<fsk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayw.i.fieldOf("default").forGetter(fsk::b)).apply($$0, fsk::new));

   @Override
   public int a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2) {
      return dcl.a($$0, this.b);
   }

   @Override
   public MapCodec<fsk> a() {
      return a;
   }
}
