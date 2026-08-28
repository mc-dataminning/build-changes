import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record euc(Optional<Long> b, eqj c) implements etu {
   public static final MapCodec<euc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(euc::c), eqj.a.fieldOf("value").forGetter(euc::d)).apply($$0, euc::new)
   );

   @Override
   public etv b() {
      return etw.s;
   }

   @Override
   public Set<etd<?>> a() {
      return this.c.a();
   }

   public boolean a(eqk $$0) {
      arf $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static euc.a a(eqj $$0) {
      return new euc.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eqj d() {
      return this.c;
   }

   public static class a implements etu.a {
      private Optional<Long> a = Optional.empty();
      private final eqj b;

      public a(eqj $$0) {
         this.b = $$0;
      }

      public euc.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public euc a() {
         return new euc(this.a, this.b);
      }
   }
}
