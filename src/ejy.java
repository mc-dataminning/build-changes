import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ejy(Optional<Boolean> b, Optional<Boolean> c) implements ejo {
   public static final Codec<ejy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atq.a(Codec.BOOL, "raining").forGetter(ejy::d), atq.a(Codec.BOOL, "thundering").forGetter(ejy::e)).apply($$0, ejy::new)
   );

   @Override
   public ejp b() {
      return ejq.p;
   }

   public boolean a(egp $$0) {
      amz $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ab() ? false : !this.c.isPresent() || this.c.get() == $$1.aa();
   }

   public static ejy.a c() {
      return new ejy.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ejo.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public ejy.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ejy.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ejy a() {
         return new ejy(this.a, this.b);
      }
   }
}
