import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record efu(Optional<Boolean> b, Optional<Boolean> c) implements efk {
   public static final Codec<efu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arb.a(Codec.BOOL, "raining").forGetter(efu::d), arb.a(Codec.BOOL, "thundering").forGetter(efu::e)).apply($$0, efu::new)
   );

   @Override
   public efl b() {
      return efm.p;
   }

   public boolean a(ecl $$0) {
      akn $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.Z() ? false : !this.c.isPresent() || this.c.get() == $$1.Y();
   }

   public static efu.a c() {
      return new efu.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements efk.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public efu.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public efu.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public efu a() {
         return new efu(this.a, this.b);
      }
   }
}
