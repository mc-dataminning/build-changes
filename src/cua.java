import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cua<T extends cte> implements ctr<T> {
   private final cua.a<T> x;
   private final Codec<T> y;
   private final xs<vf, T> z;

   public cua(cua.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(ctd.e.fieldOf("category").orElse(ctd.d).forGetter(cte::d)).apply($$1, $$0::create));
      this.z = xs.a(ctd.g, cte::d, $$0::create);
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   @Override
   public xs<vf, T> b() {
      return this.z;
   }

   @FunctionalInterface
   public interface a<T extends cte> {
      T create(ctd var1);
   }
}
