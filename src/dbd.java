import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbd<T extends daf> implements dau<T> {
   private final MapCodec<T> w;
   private final zg<wt, T> x;

   public dbd(dbd.a<T> $$0) {
      this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dad.e.fieldOf("category").orElse(dad.d).forGetter(daf::d)).apply($$1, $$0::create));
      this.x = zg.a(dad.g, daf::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.w;
   }

   @Override
   public zg<wt, T> b() {
      return this.x;
   }

   @FunctionalInterface
   public interface a<T extends daf> {
      T create(dad var1);
   }
}
