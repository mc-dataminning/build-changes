import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ets(ji<dfa> b, Optional<dx> c) implements ett {
   public static final MapCodec<ets> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lp.e.r().fieldOf("block").forGetter(ets::c), dx.a.optionalFieldOf("properties").forGetter(ets::d)).apply($$0, ets::new)
      )
      .validate(ets::a);

   private static DataResult<ets> a(ets $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public etu b() {
      return etv.k;
   }

   @Override
   public Set<etc<?>> a() {
      return Set.of(etf.g);
   }

   public boolean a(eqj $$0) {
      dsd $$1 = $$0.c(etf.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ets.a a(dfa $$0) {
      return new ets.a($$0);
   }

   public ji<dfa> c() {
      return this.b;
   }

   public Optional<dx> d() {
      return this.c;
   }

   public static class a implements ett.a {
      private final ji<dfa> a;
      private Optional<dx> b = Optional.empty();

      public a(dfa $$0) {
         this.a = $$0.s();
      }

      public ets.a a(dx.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ett build() {
         return new ets(this.a, this.b);
      }
   }
}
