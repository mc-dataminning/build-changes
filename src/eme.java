import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eme(Optional<Boolean> b, Optional<Boolean> c) implements elu {
   public static final Codec<eme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(avp.a(Codec.BOOL, "raining").forGetter(eme::d), avp.a(Codec.BOOL, "thundering").forGetter(eme::e)).apply($$0, eme::new)
   );

   @Override
   public elv b() {
      return elw.p;
   }

   public boolean a(eiv $$0) {
      aov $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ab() ? false : !this.c.isPresent() || this.c.get() == $$1.aa();
   }

   public static eme.a c() {
      return new eme.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements elu.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eme.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eme.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eme a() {
         return new eme(this.a, this.b);
      }
   }
}
