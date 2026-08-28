import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyw<T extends cxz> implements cyn<T> {
   private final MapCodec<T> x;
   private final ys<wf, T> y;

   public cyw(cyw.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cxx.e.fieldOf("category").orElse(cxx.d).forGetter(cxz::d)).apply($$1, $$0::create));
      this.y = ys.a(cxx.g, cxz::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public ys<wf, T> b() {
      return this.y;
   }

   @FunctionalInterface
   public interface a<T extends cxz> {
      T create(cxx var1);
   }
}
