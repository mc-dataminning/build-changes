import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record eua(Optional<Boolean> b, Optional<Boolean> c) implements etq {
   public static final MapCodec<eua> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(eua::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(eua::e))
            .apply($$0, eua::new)
   );

   @Override
   public etr b() {
      return ets.q;
   }

   public boolean a(eqg $$0) {
      are $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static eua.a c() {
      return new eua.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements etq.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public eua.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eua.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public eua a() {
         return new eua(this.a, this.b);
      }
   }
}
