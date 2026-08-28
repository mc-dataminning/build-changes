import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record fai(Optional<Boolean> b, Optional<Boolean> c) implements ezy {
   public static final MapCodec<fai> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(fai::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(fai::e))
            .apply($$0, fai::new)
   );

   @Override
   public ezz b() {
      return faa.o;
   }

   public boolean a(ewp $$0) {
      ash $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.af() ? false : !this.c.isPresent() || this.c.get() == $$1.ae();
   }

   public static fai.a c() {
      return new fai.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ezy.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public fai.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fai.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public fai a() {
         return new fai(this.a, this.b);
      }
   }
}
