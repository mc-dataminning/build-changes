import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqt(int b) implements fqy {
   public static final MapCodec<fqt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("value").forGetter(fqt::b)).apply($$0, fqt::new));

   public fqt(int b) {
      b = axw.f(b);
      this.b = b;
   }

   @Override
   public int a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2) {
      return this.b;
   }

   @Override
   public MapCodec<fqt> a() {
      return a;
   }
}
