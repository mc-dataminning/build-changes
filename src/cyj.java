import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyj<T extends cxn> implements cya<T> {
   private final MapCodec<T> x;
   private final yv<wi, T> y;

   public cyj(cyj.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cxm.e.fieldOf("category").orElse(cxm.d).forGetter(cxn::d)).apply($$1, $$0::create));
      this.y = yv.a(cxm.g, cxn::d, $$0::create);
   }

   @Override
   public MapCodec<T> a() {
      return this.x;
   }

   @Override
   public yv<wi, T> b() {
      return this.y;
   }

   @FunctionalInterface
   public interface a<T extends cxn> {
      T create(cxm var1);
   }
}
