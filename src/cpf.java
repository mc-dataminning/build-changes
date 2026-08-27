import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cpf<T extends coi> implements cox<T> {
   private final cpf.a<T> x;
   private final Codec<T> y;

   public cpf(cpf.a<T> $$0) {
      this.x = $$0;
      this.y = RecordCodecBuilder.create($$1 -> $$1.group(coh.e.fieldOf("category").orElse(coh.d).forGetter(coi::d)).apply($$1, $$0::create));
   }

   @Override
   public Codec<T> a() {
      return this.y;
   }

   public T b(ty $$0) {
      coh $$1 = $$0.b(coh.class);
      return this.x.create($$1);
   }

   public void a(ty $$0, T $$1) {
      $$0.a($$1.d());
   }

   @FunctionalInterface
   public interface a<T extends coi> {
      T create(coh var1);
   }
}
