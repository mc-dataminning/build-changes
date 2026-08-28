import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fah(Optional<Boolean> b, Optional<Boolean> c) implements ezx {
   public static final MapCodec<fah> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fah::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fah::e))
            .apply($$0, fah::new)
   );

   @Override
   public ezy b() {
      return ezz.o;
   }

   public boolean a(ewo $$0) {
      ard $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ah() ? false : !this.c.isPresent() || this.c.get() == $$1.ag();
   }

   public static fah.a c() {
      return new fah.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ezx.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fah.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fah.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fah a() {
         return new fah(this.a, this.b);
      }
   }
}
