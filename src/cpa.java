import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cpa<T extends cod> implements cos<T> {
   private final cpa.a<T> x;
   private final Codec<T> y;

   public cpa(cpa.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(coc.e.fieldOf("category").orElse(coc.d).forGetter(cod::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(tu $$0) {
      coc $$1 = $$0.b(coc.class);
      return this.x.create($$1);
   }

   public void a(tu $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends cod> {
      T create(coc var1);
   }
}
