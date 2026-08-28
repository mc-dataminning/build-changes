import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record evg(Optional<Boolean> b, Optional<Boolean> c) implements euw {
   public static final MapCodec<evg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(evg::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(evg::e))
            .apply($$0, evg::new)
   );

   @Override
   public eux b() {
      return euy.o;
   }

   public boolean a(erl $$0) {
      aqt $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static evg.a c() {
      return new evg.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements euw.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public evg.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evg.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public evg a() {
         return new evg(this.a, this.b);
      }
   }
}
