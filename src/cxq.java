import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cxq<T extends cwu> implements cxh<T> {
   private final cxq.a<T> x;
   private final Codec<T> y;
   private final ys<wf, T> z;

   public cxq(cxq.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cwt.e.fieldOf("category").orElse(cwt.d).forGetter(cwu::d)).apply($$1, $$0::create));
      this.z = ys.a(cwt.g, cwu::d, $$0::create);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public ys<wf, T> b() {
      return this.z;
   }

   @FunctionalInterface
   public interface a<T extends cwu> {
      T create(cwt var1);
   }
}
