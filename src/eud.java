import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eud(Optional<Boolean> b, Optional<Boolean> c) implements ett {
   public static final MapCodec<eud> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(eud::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(eud::e))
            .apply($$0, eud::new)
   );

   @Override
   public etu b() {
      return etv.q;
   }

   public boolean a(eqj $$0) {
      arf $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static eud.a c() {
      return new eud.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ett.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eud.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eud.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eud a() {
         return new eud(this.a, this.b);
      }
   }
}
