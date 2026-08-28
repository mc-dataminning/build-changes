import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czj<T extends cyn> implements cza<T> {
   private final MapCodec<T> x;
   private final zn<xa, T> y;

   public czj(czj.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cym.e.fieldOf("category").orElse(cym.d).forGetter(cyn::d)).apply($$1, $$0::create));
      this.y = zn.a(cym.g, cyn::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public zn<xa, T> b() {
      return this.y;
   }

   @FunctionalInterface
   public interface a<T extends cyn> {
      T create(cym var1);
   }
}
