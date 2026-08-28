import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exq(jq<dij> b, Optional<ee> c) implements exr {
   public static final MapCodec<exq> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lz.e.r().fieldOf("block").forGetter(exq::c), ee.a.optionalFieldOf("properties").forGetter(exq::d)).apply($$0, exq::new)
      )
      .validate(exq::a);

   private static DataResult<exq> a(exq $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public exs b() {
      return ext.i;
   }

   @Override
   public Set<ewz<?>> a() {
      return Set.of(exc.g);
   }

   public boolean a(eug $$0) {
      dvo $$1 = $$0.c(exc.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static exq.a a(dij $$0) {
      return new exq.a($$0);
   }

   public jq<dij> c() {
      return this.b;
   }

   public Optional<ee> d() {
      return this.c;
   }

   public static class a implements exr.a {
      private final jq<dij> a;
      private Optional<ee> b = Optional.empty();

      public a(dij $$0) {
         this.a = $$0.p();
      }

      public exq.a a(ee.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public exr build() {
         return new exq(this.a, this.b);
      }
   }
}
