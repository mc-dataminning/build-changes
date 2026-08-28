import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etm(ji<deu> b, Optional<dx> c) implements etn {
   public static final MapCodec<etm> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lp.e.r().fieldOf("block").forGetter(etm::c), dx.a.optionalFieldOf("properties").forGetter(etm::d)).apply($$0, etm::new)
      )
      .validate(etm::a);

   private static DataResult<etm> a(etm $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eto b() {
      return etp.k;
   }

   @Override
   public Set<esw<?>> a() {
      return Set.of(esz.g);
   }

   public boolean a(eqd $$0) {
      drx $$1 = $$0.c(esz.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static etm.a a(deu $$0) {
      return new etm.a($$0);
   }

   public ji<deu> c() {
      return this.b;
   }

   public Optional<dx> d() {
      return this.c;
   }

   public static class a implements etn.a {
      private final ji<deu> a;
      private Optional<dx> b = Optional.empty();

      public a(deu $$0) {
         this.a = $$0.q();
      }

      public etm.a a(dx.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public etn build() {
         return new etm(this.a, this.b);
      }
   }
}
