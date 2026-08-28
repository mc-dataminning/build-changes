import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czd<T extends cyh> implements cyu<T> {
   private final MapCodec<T> x;
   private final zj<ww, T> y;

   public czd(czd.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cyg.e.fieldOf("category").orElse(cyg.d).forGetter(cyh::d)).apply($$1, $$0::create));
      this.y = zj.a(cyg.g, cyh::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public zj<ww, T> b() {
      return this.y;
   }

   @FunctionalInterface
   public interface a<T extends cyh> {
      T create(cyg var1);
   }
}
