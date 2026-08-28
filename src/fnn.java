import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fnn(int b) implements fnq {
   public static final MapCodec<fnn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("default").forGetter(fnn::b)).apply($$0, fnn::new));

   @Override
   public int a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2) {
      return czt.a($$0, this.b);
   }

   @Override
   public MapCodec<fnn> a() {
      return a;
   }
}
