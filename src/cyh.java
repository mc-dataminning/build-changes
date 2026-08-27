import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cyh<T extends cxl> implements cxy<T> {
   private final MapCodec<T> x;
   private final yv<wi, T> y;

   public cyh(cyh.a<T> $$0) {
      this.x = RecordCodecBuilder.mapCodec($$1 -> $$1.group(cxk.e.fieldOf("category").orElse(cxk.d).forGetter(cxl::d)).apply($$1, $$0::create));
      this.y = yv.a(cxk.g, cxl::d, $$0::create);
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
   public interface a<T extends cxl> {
      T create(cxk var1);
   }
}
