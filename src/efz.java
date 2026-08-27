import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record efz(Optional<Boolean> b, Optional<Boolean> c) implements efp {
   public static final Codec<efz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arf.a(Codec.BOOL, "raining").forGetter(efz::d), arf.a(Codec.BOOL, "thundering").forGetter(efz::e)).apply($$0, efz::new)
   );

   @Override
   public efq b() {
      return efr.p;
   }

   public boolean a(ecq $$0) {
      akq $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.Z() ? false : !this.c.isPresent() || this.c.get() == $$1.Y();
   }

   public static efz.a c() {
      return new efz.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements efp.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public efz.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public efz.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public efz a() {
         return new efz(this.a, this.b);
      }
   }
}
