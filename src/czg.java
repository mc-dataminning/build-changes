import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class czg<T extends cyk> implements cyx<T> {
   private final MapCodec<T> x;
   private final zm<wz, T> y;

   public czg(czg.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cyj.e.fieldOf("category").orElse(cyj.d).forGetter(cyk::d)).apply($$1, $$0::create));
      this.y = zm.a(cyj.g, cyk::d, $$0::create);
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
   public interface a<T extends cyk> {
      T create(cyj var1);
   }
}
