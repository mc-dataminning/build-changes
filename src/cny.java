import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cny<T extends cnd> implements cnq<T> {
   private final cny.a<T> x;
   private final Codec<T> y;

   public cny(cny.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cnc.e.fieldOf("category").orElse(cnc.d).forGetter(cnd::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(tl $$0) {
      cnc $$1 = $$0.b(cnc.class);
      return this.x.create($$1);
   }

   public void a(tl $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends cnd> {
      T create(cnc var1);
   }
}
