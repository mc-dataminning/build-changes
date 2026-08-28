import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ezk(Optional<Boolean> b, Optional<Boolean> c) implements eza {
   public static final MapCodec<ezk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(ezk::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(ezk::e))
            .apply($$0, ezk::new)
   );

   @Override
   public ezb b() {
      return ezc.o;
   }

   public boolean a(evr $$0) {
      ard $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ag() ? false : !this.c.isPresent() || this.c.get() == $$1.af();
   }

   public static ezk.a c() {
      return new ezk.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements eza.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public ezk.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ezk.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ezk a() {
         return new ezk(this.a, this.b);
      }
   }
}
