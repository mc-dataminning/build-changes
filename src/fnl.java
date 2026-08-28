import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public record fnl(int b) implements fnq {
   public static final MapCodec<fnl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ayi.i.fieldOf("value").forGetter(fnl::b)).apply($$0, fnl::new));

   public fnl(int b) {
      b = axk.f(b);
      this.b = b;
   }

   @Override
   public int a(cxh $$0, @Nullable ggy $$1, @Nullable bvy $$2) {
      return this.b;
   }

   @Override
   public MapCodec<fnl> a() {
      return a;
   }
}
