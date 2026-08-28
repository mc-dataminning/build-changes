import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyx<T extends cya> implements cyo<T> {
   private final MapCodec<T> x;
   private final ys<wf, T> y;

   public cyx(cyx.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cxy.e.fieldOf("category").orElse(cxy.d).forGetter(cya::d)).apply($$1, $$0::create));
      this.y = ys.a(cxy.g, cya::d, $$0::create);
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
   public interface a<T extends cya> {
      T create(cxy var1);
   }
}
