import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cos<T extends cnv> implements coj<T> {
   private final cos.a<T> x;
   private final Codec<T> y;

   public cos(cos.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cnu.e.fieldOf("category").orElse(cnu.d).forGetter(cnv::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(tu $$0) {
      cnu $$1 = $$0.b(cnu.class);
      return this.x.create($$1);
   }

   public void a(tu $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends cnv> {
      T create(cnu var1);
   }
}
