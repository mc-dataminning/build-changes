import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqy(int b) implements frd {
   public static final MapCodec<fqy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("value").forGetter(fqy::b)).apply($$0, fqy::new));

   public fqy(int b) {
      b = axw.f(b);
      this.b = b;
   }

   @Override
   public int a(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2) {
      return this.b;
   }

   @Override
   public MapCodec<fqy> a() {
      return a;
   }
}
