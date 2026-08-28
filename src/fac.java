import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fac(Optional<Boolean> b, Optional<Boolean> c) implements ezs {
   public static final MapCodec<fac> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fac::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fac::e))
            .apply($$0, fac::new)
   );

   @Override
   public ezt b() {
      return ezu.o;
   }

   public boolean a(ewh $$0) {
      ash $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.af() ? false : !this.c.isPresent() || this.c.get() == $$1.ae();
   }

   public static fac.a c() {
      return new fac.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ezs.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fac.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fac.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fac a() {
         return new fac(this.a, this.b);
      }
   }
}
