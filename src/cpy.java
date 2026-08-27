import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cpy<T extends cpc> implements cpp<T> {
   private final cpy.a<T> x;
   private final Codec<T> y;

   public cpy(cpy.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cpb.e.fieldOf("category").orElse(cpb.d).forGetter(cpc::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(ue $$0) {
      cpb $$1 = $$0.b(cpb.class);
      return this.x.create($$1);
   }

   public void a(ue $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends cpc> {
      T create(cpb var1);
   }
}
