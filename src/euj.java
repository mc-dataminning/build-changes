import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record euj(Optional<Boolean> b, Optional<Boolean> c) implements etz {
   public static final MapCodec<euj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(euj::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(euj::e))
            .apply($$0, euj::new)
   );

   @Override
   public eua b() {
      return eub.o;
   }

   public boolean a(eqo $$0) {
      aqk $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static euj.a c() {
      return new euj.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements etz.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public euj.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public euj.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public euj a() {
         return new euj(this.a, this.b);
      }
   }
}
