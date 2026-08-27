import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cmu<T extends clz> implements cmm<T> {
   private final cmu.a<T> x;
   private final Codec<T> y;

   public cmu(cmu.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cly.e.fieldOf("category").orElse(cly.d).forGetter(clz::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(so $$0) {
      cly $$1 = $$0.b(cly.class);
      return this.x.create($$1);
   }

   public void a(so $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends clz> {
      T create(cly var1);
   }
}
