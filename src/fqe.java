import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fqe(int b) implements fqj {
   public static final MapCodec<fqe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("value").forGetter(fqe::b)).apply($$0, fqe::new));

   public fqe(int b) {
      b = axw.f(b);
      this.b = b;
   }

   @Override
   public int a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2) {
      return this.b;
   }

   @Override
   public MapCodec<fqe> a() {
      return a;
   }
}
