import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record euc(Optional<Boolean> b, Optional<Boolean> c) implements ets {
   public static final MapCodec<euc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("raining").forGetter(euc::d), Codec.BOOL.optionalFieldOf("thundering").forGetter(euc::e))
            .apply($$0, euc::new)
   );

   @Override
   public ett b() {
      return etu.q;
   }

   public boolean a(eqi $$0) {
      arf $$1 = $$0.d();
      return this.b.isPresent() && this.b.get() != $$1.ad() ? false : !this.c.isPresent() || this.c.get() == $$1.ac();
   }

   public static euc.a c() {
      return new euc.a();
   }

   public Optional<Boolean> d() {
      return this.b;
   }

   public Optional<Boolean> e() {
      return this.c;
   }

   public static class a implements ets.a {
      private Optional<Boolean> a = Optional.empty();
      private Optional<Boolean> b = Optional.empty();

      public euc.a a(boolean $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public euc.a b(boolean $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      public euc a() {
         return new euc(this.a, this.b);
      }
   }
}
