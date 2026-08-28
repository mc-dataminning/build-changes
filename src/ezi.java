import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ezi(Optional<Boolean> b, Optional<Boolean> c) implements eyy {
   public static final MapCodec<ezi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(ezi::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(ezi::e))
            .apply($$0, ezi::new)
   );

   @Override
   public eyz b() {
      return eza.o;
   }

   public boolean a(evp $$0) {
      arc $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ag() ? false : !this.c.isPresent() || this.c.get() == $$1.af();
   }

   public static ezi.a c() {
      return new ezi.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements eyy.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public ezi.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ezi.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public ezi a() {
         return new ezi(this.a, this.b);
      }
   }
}
