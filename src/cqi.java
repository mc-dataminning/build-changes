import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqi<T extends cpm> implements cpz<T> {
   private final cqi.a<T> x;
   private final Codec<T> y;

   public cqi(cqi.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cpl.e.fieldOf("category").orElse(cpl.d).forGetter(cpm::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(ug $$0) {
      cpl $$1 = $$0.b(cpl.class);
      return this.x.create($$1);
   }

   public void a(ug $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends cpm> {
      T create(cpl var1);
   }
}
