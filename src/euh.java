import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record euh(Optional<Long> b, eqn c) implements etz {
   public static final MapCodec<euh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(euh::c), eqn.a.fieldOf("value").forGetter(euh::d)).apply($$0, euh::new)
   );

   @Override
   public eua b() {
      return eub.q;
   }

   @Override
   public Set<eth<?>> a() {
      return this.c.a();
   }

   public boolean a(eqo $$0) {
      aqk $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static euh.a a(eqn $$0) {
      return new euh.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eqn d() {
      return this.c;
   }

   public static class a implements etz.a {
      private Optional<Long> a = Optional.empty();
      private final eqn b;

      public a(eqn $$0) {
         this.b = $$0;
      }

      public euh.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public euh a() {
         return new euh(this.a, this.b);
      }
   }
}
