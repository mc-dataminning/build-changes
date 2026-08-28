import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record evk(Optional<Long> b, erq c) implements evc {
   public static final MapCodec<evk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(evk::c), erq.a.fieldOf("value").forGetter(evk::d)).apply($$0, evk::new)
   );

   @Override
   public evd b() {
      return eve.q;
   }

   @Override
   public Set<euk<?>> a() {
      return this.c.a();
   }

   public boolean a(err $$0) {
      aqu $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static evk.a a(erq $$0) {
      return new evk.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public erq d() {
      return this.c;
   }

   public static class a implements evc.a {
      private Optional<Long> a = Optional.empty();
      private final erq b;

      public a(erq $$0) {
         this.b = $$0;
      }

      public evk.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evk a() {
         return new evk(this.a, this.b);
      }
   }
}
