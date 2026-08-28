import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fsk(int b) implements fsp {
   public static final MapCodec<fsk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayy.i.fieldOf("value").forGetter(fsk::b)).apply($$0, fsk::new));

   public fsk(int b) {
      b = aya.f(b);
      this.b = b;
   }

   @Override
   public int a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2) {
      return this.b;
   }

   @Override
   public MapCodec<fsk> a() {
      return a;
   }
}
