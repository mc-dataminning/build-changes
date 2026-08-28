import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eue(Optional<Boolean> b, Optional<Boolean> c) implements etu {
   public static final MapCodec<eue> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(eue::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(eue::e))
            .apply($$0, eue::new)
   );

   @Override
   public etv b() {
      return etw.q;
   }

   public boolean a(eqk $$0) {
      arf $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static eue.a c() {
      return new eue.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements etu.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eue.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eue.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eue a() {
         return new eue(this.a, this.b);
      }
   }
}
