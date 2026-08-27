import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eig(Optional<Boolean> b, Optional<Boolean> c) implements ehw {
   public static final Codec<eig> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(asu.a(Codec.BOOL, "raining").forGetter(eig::d), asu.a(Codec.BOOL, "thundering").forGetter(eig::e)).apply($$0, eig::new)
   );

   @Override
   public ehx b() {
      return ehy.p;
   }

   public boolean a(eex $$0) {
      ame $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.aa() ? false : !this.c.isPresent() || this.c.get() == $$1.Z();
   }

   public static eig.a c() {
      return new eig.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ehw.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eig.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eig.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eig a() {
         return new eig(this.a, this.b);
      }
   }
}
