import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqo<T extends cps> implements cqf<T> {
   private final cqo.a<T> x;
   private final Codec<T> y;

   public cqo(cqo.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cpr.e.fieldOf("category").orElse(cpr.d).forGetter(cps::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(ui $$0) {
      cpr $$1 = $$0.b(cpr.class);
      return this.x.create($$1);
   }

   public void a(ui $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends cps> {
      T create(cpr var1);
   }
}
