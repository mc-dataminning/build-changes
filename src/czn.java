import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czn<T extends cyq> implements cze<T> {
   private final MapCodec<T> x;
   private final yx<wk, T> y;

   public czn(czn.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cyo.e.fieldOf("category").orElse(cyo.d).forGetter(cyq::d)).apply($$1, $$0::create));
      this.y = yx.a(cyo.g, cyq::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public yx<wk, T> b() {
      return this.y;
   }

   @FunctionalInterface
   public interface a<T extends cyq> {
      T create(cyo var1);
   }
}
