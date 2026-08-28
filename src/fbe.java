import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fbe(Optional<Boolean> b, Optional<Boolean> c) implements fau {
   public static final MapCodec<fbe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fbe::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fbe::e))
            .apply($$0, fbe::new)
   );

   @Override
   public fav b() {
      return faw.o;
   }

   public boolean a(exl $$0) {
      arn $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ah() ? false : !this.c.isPresent() || this.c.get() == $$1.ag();
   }

   public static fbe.a c() {
      return new fbe.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements fau.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fbe.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fbe.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fbe a() {
         return new fbe(this.a, this.b);
      }
   }
}
