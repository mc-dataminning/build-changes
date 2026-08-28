import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etq(ji<dey> b, Optional<dx> c) implements etr {
   public static final MapCodec<etq> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lp.e.r().fieldOf("block").forGetter(etq::c), dx.a.optionalFieldOf("properties").forGetter(etq::d)).apply($$0, etq::new)
      )
      .validate(etq::a);

   private static DataResult<etq> a(etq $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ets b() {
      return ett.k;
   }

   @Override
   public Set<eta<?>> a() {
      return Set.of(etd.g);
   }

   public boolean a(eqh $$0) {
      dsb $$1 = $$0.c(etd.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static etq.a a(dey $$0) {
      return new etq.a($$0);
   }

   public ji<dey> c() {
      return this.b;
   }

   public Optional<dx> d() {
      return this.c;
   }

   public static class a implements etr.a {
      private final ji<dey> a;
      private Optional<dx> b = Optional.empty();

      public a(dey $$0) {
         this.a = $$0.s();
      }

      public etq.a a(dx.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public etr build() {
         return new etq(this.a, this.b);
      }
   }
}
