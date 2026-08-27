import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cso<T extends crs> implements csf<T> {
   private final cso.a<T> x;
   private final Codec<T> y;
   private final xo<vb, T> z;

   public cso(cso.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(crr.e.fieldOf("category").orElse(crr.d).forGetter(crs::d)).apply($$1, $$0::create));
      this.z = xo.a(crr.g, crs::d, $$0::create);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public xo<vb, T> b() {
      return this.z;
   }

   @FunctionalInterface
   public interface a<T extends crs> {
      T create(crr var1);
   }
}
