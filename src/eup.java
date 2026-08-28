import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eup(Optional<Long> b, eqv c) implements euh {
   public static final MapCodec<eup> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(eup::c), eqv.a.fieldOf("value").forGetter(eup::d)).apply($$0, eup::new)
   );

   @Override
   public eui b() {
      return euj.q;
   }

   @Override
   public Set<etp<?>> a() {
      return this.c.a();
   }

   public boolean a(eqw $$0) {
      aqm $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static eup.a a(eqv $$0) {
      return new eup.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eqv d() {
      return this.c;
   }

   public static class a implements euh.a {
      private Optional<Long> a = Optional.empty();
      private final eqv b;

      public a(eqv $$0) {
         this.b = $$0;
      }

      public eup.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eup a() {
         return new eup(this.a, this.b);
      }
   }
}
