import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cmp<T extends clu> implements cmh<T> {
   private final cmp.a<T> x;
   private final Codec<T> y;

   public cmp(cmp.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(clt.e.fieldOf("category").orElse(clt.d).forGetter(clu::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(sl $$0) {
      clt $$1 = $$0.b(clt.class);
      return this.x.create($$1);
   }

   public void a(sl $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends clu> {
      T create(clt var1);
   }
}
