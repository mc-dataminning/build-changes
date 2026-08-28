import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fpx(int b) implements fqc {
   public static final MapCodec<fpx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("value").forGetter(fpx::b)).apply($$0, fpx::new));

   public fpx(int b) {
      b = axw.f(b);
      this.b = b;
   }

   @Override
   public int a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2) {
      return this.b;
   }

   @Override
   public MapCodec<fpx> a() {
      return a;
   }
}
