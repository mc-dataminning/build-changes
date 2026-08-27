import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ctf<T extends csj> implements csw<T> {
   private final ctf.a<T> x;
   private final Codec<T> y;
   private final xq<vd, T> z;

   public ctf(ctf.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(csi.e.fieldOf("category").orElse(csi.d).forGetter(csj::d)).apply($$1, $$0::create));
      this.z = xq.a(csi.g, csj::d, $$0::create);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public xq<vd, T> b() {
      return this.z;
   }

   @FunctionalInterface
   public interface a<T extends csj> {
      T create(csi var1);
   }
}
