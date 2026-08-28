import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fpz(int b) implements fqc {
   public static final MapCodec<fpz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayu.i.fieldOf("default").forGetter(fpz::b)).apply($$0, fpz::new));

   @Override
   public int a(cyy $$0, @Nullable gjr $$1, @Nullable bxc $$2) {
      return dbl.a($$0, this.b);
   }

   @Override
   public MapCodec<fpz> a() {
      return a;
   }
}
