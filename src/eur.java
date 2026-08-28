import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eur(Optional<Boolean> b, Optional<Boolean> c) implements euh {
   public static final MapCodec<eur> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(eur::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(eur::e))
            .apply($$0, eur::new)
   );

   @Override
   public eui b() {
      return euj.o;
   }

   public boolean a(eqw $$0) {
      aqm $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static eur.a c() {
      return new eur.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements euh.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eur.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eur.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eur a() {
         return new eur(this.a, this.b);
      }
   }
}
