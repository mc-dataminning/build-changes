import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwt<T extends cvx> implements cwk<T> {
   private final cwt.a<T> x;
   private final Codec<T> y;
   private final yq<wd, T> z;

   public cwt(cwt.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cvw.e.fieldOf("category").orElse(cvw.d).forGetter(cvx::d)).apply($$1, $$0::create));
      this.z = yq.a(cvw.g, cvx::d, $$0::create);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public yq<wd, T> b() {
      return this.z;
   }

   @FunctionalInterface
   public interface a<T extends cvx> {
      T create(cvw var1);
   }
}
