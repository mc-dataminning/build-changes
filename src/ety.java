import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ety(Optional<Long> b, eqf c) implements etq {
   public static final MapCodec<ety> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.LONG.optionalFieldOf("period").forGetter(ety::c), eqf.a.fieldOf("value").forGetter(ety::d)).apply($$0, ety::new)
   );

   @Override
   public etr b() {
      return ets.s;
   }

   @Override
   public Set<esz<?>> a() {
      return this.c.a();
   }

   public boolean a(eqg $$0) {
      are $$1 = $$0.d();
      long $$2 = $$1.aa();
      if (this.b.isPresent()) {
         $$2 %= this.b.get();
      }

      return this.c.b($$0, (int)$$2);
   }

   public static ety.a a(eqf $$0) {
      return new ety.a($$0);
   }

   public Optional<Long> c() {
      return this.b;
   }

   public eqf d() {
      return this.c;
   }

   public static class a implements etq.a {
      private Optional<Long> a = Optional.empty();
      private final eqf b;

      public a(eqf $$0) {
         this.b = $$0;
      }

      public ety.a a(long $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ety a() {
         return new ety(this.a, this.b);
      }
   }
}
