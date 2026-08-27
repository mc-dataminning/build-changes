import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eqv(Optional<Boolean> b, Optional<Boolean> c) implements eql {
   public static final Codec<eqv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awu.a(Codec.BOOL, "raining").forGetter(eqv::d), awu.a(Codec.BOOL, "thundering").forGetter(eqv::e)).apply($$0, eqv::new)
   );

   @Override
   public eqm b() {
      return eqn.p;
   }

   public boolean a(enk $$0) {
      apu $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ac() ? false : !this.c.isPresent() || this.c.get() == $$1.ab();
   }

   public static eqv.a c() {
      return new eqv.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements eql.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eqv.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eqv.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eqv a() {
         return new eqv(this.a, this.b);
      }
   }
}
