import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class css<T extends crw> implements csj<T> {
   private final css.a<T> x;
   private final Codec<T> y;
   private final xo<vb, T> z;

   public css(css.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(crv.e.fieldOf("category").orElse(crv.d).forGetter(crw::d)).apply($$1, $$0::create));
      this.z = xo.a(crv.g, crw::d, $$0::create);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public xo<vb, T> b() {
      return this.z;
   }

   @FunctionalInterface
   public interface a<T extends crw> {
      T create(crv var1);
   }
}
