import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cmw<T extends cmb> implements cmo<T> {
   private final cmw.a<T> x;
   private final Codec<T> y;

   public cmw(cmw.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cma.e.fieldOf("category").orElse(cma.d).forGetter(cmb::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(sq $$0) {
      cma $$1 = $$0.b(cma.class);
      return this.x.create($$1);
   }

   public void a(sq $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends cmb> {
      T create(cma var1);
   }
}
