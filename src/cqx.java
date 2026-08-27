import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqx<T extends cqb> implements cqo<T> {
   private final cqx.a<T> x;
   private final Codec<T> y;

   public cqx(cqx.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cqa.e.fieldOf("category").orElse(cqa.d).forGetter(cqb::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(uj $$0) {
      cqa $$1 = $$0.b(cqa.class);
      return this.x.create($$1);
   }

   public void a(uj $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends cqb> {
      T create(cqa var1);
   }
}
