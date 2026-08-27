import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record efp(Optional<Boolean> b, Optional<Boolean> c) implements eff {
   public static final Codec<efp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.a(Codec.BOOL, "raining").forGetter(efp::d), aqy.a(Codec.BOOL, "thundering").forGetter(efp::e)).apply($$0, efp::new)
   );

   @Override
   public efg b() {
      return efh.p;
   }

   public boolean a(ecg $$0) {
      akk $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.Z() ? false : !this.c.isPresent() || this.c.get() == $$1.Y();
   }

   public static efp.a c() {
      return new efp.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements eff.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public efp.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public efp.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public efp a() {
         return new efp(this.a, this.b);
      }
   }
}
