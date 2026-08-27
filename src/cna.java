import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cna<T extends cmf> implements cms<T> {
   private final cna.a<T> x;
   private final Codec<T> y;

   public cna(cna.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cme.e.fieldOf("category").orElse(cme.d).forGetter(cmf::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(so $$0) {
      cme $$1 = $$0.b(cme.class);
      return this.x.create($$1);
   }

   public void a(so $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends cmf> {
      T create(cme var1);
   }
}
