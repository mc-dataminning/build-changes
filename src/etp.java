import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etp(ji<dex> b, Optional<dx> c) implements etq {
   public static final MapCodec<etp> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lp.e.r().fieldOf("block").forGetter(etp::c), dx.a.optionalFieldOf("properties").forGetter(etp::d)).apply($$0, etp::new)
      )
      .validate(etp::a);

   private static DataResult<etp> a(etp $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public etr b() {
      return ets.k;
   }

   @Override
   public Set<esz<?>> a() {
      return Set.of(etc.g);
   }

   public boolean a(eqg $$0) {
      dsa $$1 = $$0.c(etc.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static etp.a a(dex $$0) {
      return new etp.a($$0);
   }

   public ji<dex> c() {
      return this.b;
   }

   public Optional<dx> d() {
      return this.c;
   }

   public static class a implements etq.a {
      private final ji<dex> a;
      private Optional<dx> b = Optional.empty();

      public a(dex $$0) {
         this.a = $$0.s();
      }

      public etp.a a(dx.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public etq build() {
         return new etp(this.a, this.b);
      }
   }
}
