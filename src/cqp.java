import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cqp<T extends cpt> implements cqg<T> {
   private final cqp.a<T> x;
   private final Codec<T> y;

   public cqp(cqp.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(cps.e.fieldOf("category").orElse(cps.d).forGetter(cpt::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(ui $$0) {
      cps $$1 = $$0.b(cps.class);
      return this.x.create($$1);
   }

   public void a(ui $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends cpt> {
      T create(cps var1);
   }
}
