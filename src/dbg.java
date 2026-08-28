import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dbg<T extends daj> implements day<T> {
   private final MapCodec<T> w;
   private final zj<ww, T> x;

   public dbg(dbg.a<T> $$0) {
      this.w = RecordCodecBuilder.mapCodec($$1 -> $$1.group(dah.e.fieldOf("category").orElse(dah.d).forGetter(daj::d)).apply($$1, $$0::create));
      this.x = zj.a(dah.g, daj::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.w;
   }

   @Override
   public zj<ww, T> b() {
      return this.x;
   }

   @FunctionalInterface
   public interface a<T extends daj> {
      T create(dah var1);
   }
}
