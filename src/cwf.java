import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cwf<T extends cvj> implements cvw<T> {
   private final cwf.a<T> x;
   private final Codec<T> y;
   private final yg<vt, T> z;

   public cwf(cwf.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cvi.e.fieldOf("category").orElse(cvi.d).forGetter(cvj::d)).apply($$1, $$0::create));
      this.z = yg.a(cvi.g, cvj::d, $$0::create);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public yg<vt, T> b() {
      return this.z;
   }

   @FunctionalInterface
   public interface a<T extends cvj> {
      T create(cvi var1);
   }
}
