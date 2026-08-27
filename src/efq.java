import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record efq(Optional<Boolean> b, Optional<Boolean> c) implements efg {
   public static final Codec<efq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.a(Codec.BOOL, "raining").forGetter(efq::d), aqy.a(Codec.BOOL, "thundering").forGetter(efq::e)).apply($$0, efq::new)
   );

   @Override
   public efh b() {
      return efi.p;
   }

   public boolean a(ech $$0) {
      akk $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.Z() ? false : !this.c.isPresent() || this.c.get() == $$1.Y();
   }

   public static efq.a c() {
      return new efq.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements efg.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public efq.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public efq.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public efq a() {
         return new efq(this.a, this.b);
      }
   }
}
