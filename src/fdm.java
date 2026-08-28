import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fdm(Optional<Boolean> b, Optional<Boolean> c) implements fdc {
   public static final MapCodec<fdm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fdm::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fdm::e))
            .apply($$0, fdm::new)
   );

   @Override
   public fdd b() {
      return fde.o;
   }

   public boolean a(ezt $$0) {
      arq $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ah() ? false : !this.c.isPresent() || this.c.get() == $$1.ag();
   }

   public static fdm.a c() {
      return new fdm.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements fdc.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fdm.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fdm.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fdm a() {
         return new fdm(this.a, this.b);
      }
   }
}
