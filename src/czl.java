import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czl<T extends cyo> implements czc<T> {
   private final MapCodec<T> x;
   private final yw<wj, T> y;

   public czl(czl.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cym.e.fieldOf("category").orElse(cym.d).forGetter(cyo::d)).apply($$1, $$0::create));
      this.y = yw.a(cym.g, cyo::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public yw<wj, T> b() {
      return this.y;
   }

   @FunctionalInterface
   public interface a<T extends cyo> {
      T create(cym var1);
   }
}
