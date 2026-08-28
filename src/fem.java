import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fem(Optional<Boolean> b, Optional<Boolean> c) implements fec {
   public static final MapCodec<fem> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fem::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fem::e))
            .apply($$0, fem::new)
   );

   @Override
   public fed b() {
      return fee.o;
   }

   public boolean a(fat $$0) {
      asb $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ah() ? false : !this.c.isPresent() || this.c.get() == $$1.ag();
   }

   public static fem.a c() {
      return new fem.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements fec.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fem.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fem.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fem a() {
         return new fem(this.a, this.b);
      }
   }
}
