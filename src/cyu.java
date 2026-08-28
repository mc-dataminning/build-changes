import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyu<T extends cxx> implements cyl<T> {
   private final MapCodec<T> x;
   private final ys<wf, T> y;

   public cyu(cyu.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cxv.e.fieldOf("category").orElse(cxv.d).forGetter(cxx::d)).apply($$1, $$0::create));
      this.y = ys.a(cxv.g, cxx::d, $$0::create);
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
   public interface a<T extends cxx> {
      T create(cxv var1);
   }
}
