import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record exc(Optional<Boolean> b, Optional<Boolean> c) implements ews {
   public static final MapCodec<exc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(exc::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(exc::e))
            .apply($$0, exc::new)
   );

   @Override
   public ewt b() {
      return ewu.o;
   }

   public boolean a(eth $$0) {
      arh $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ae() ? false : !this.c.isPresent() || this.c.get() == $$1.ad();
   }

   public static exc.a c() {
      return new exc.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ews.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public exc.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exc.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public exc a() {
         return new exc(this.a, this.b);
      }
   }
}
