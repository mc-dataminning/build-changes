import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dax<T extends czz> implements dao<T> {
   private final MapCodec<T> w;
   private final zf<ws, T> x;

   public dax(dax.a<T> $$0) {
      this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(czx.e.fieldOf("category").orElse(czx.d).forGetter(czz::d)).apply($$1, $$0::create));
      this.x = zf.a(czx.g, czz::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.w;
   }

   @Override
   public zf<ws, T> b() {
      return this.x;
   }

   @FunctionalInterface
   public interface a<T extends czz> {
      T create(czx var1);
   }
}
