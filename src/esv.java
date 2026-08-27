import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record esv(Optional<Boolean> b, Optional<Boolean> c) implements esl {
   public static final MapCodec<esv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(esv::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(esv::e))
            .apply($$0, esv::new)
   );

   @Override
   public esm b() {
      return esn.q;
   }

   public boolean a(epf $$0) {
      aqm $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ac() ? false : !this.c.isPresent() || this.c.get() == $$1.ab();
   }

   public static esv.a c() {
      return new esv.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements esl.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public esv.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public esv.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public esv a() {
         return new esv(this.a, this.b);
      }
   }
}
