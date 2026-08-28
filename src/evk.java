import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record evk(Optional<Boolean> b, Optional<Boolean> c) implements eva {
   public static final MapCodec<evk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(evk::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(evk::e))
            .apply($$0, evk::new)
   );

   @Override
   public evb b() {
      return evc.o;
   }

   public boolean a(erp $$0) {
      aqu $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static evk.a c() {
      return new evk.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements eva.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public evk.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evk.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public evk a() {
         return new evk(this.a, this.b);
      }
   }
}
