import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czh<T extends cyl> implements cyy<T> {
   private final MapCodec<T> x;
   private final zm<wz, T> y;

   public czh(czh.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cyk.e.fieldOf("category").orElse(cyk.d).forGetter(cyl::d)).apply($$1, $$0::create));
      this.y = zm.a(cyk.g, cyl::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public zm<wz, T> b() {
      return this.y;
   }

   @FunctionalInterface
   public interface a<T extends cyl> {
      T create(cyk var1);
   }
}
