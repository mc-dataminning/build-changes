import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record esm(ix<dea> b, Optional<dl> c) implements esn {
   public static final MapCodec<esm> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(le.e.r().fieldOf("block").forGetter(esm::c), dl.a.optionalFieldOf("properties").forGetter(esm::d)).apply($$0, esm::new)
      )
      .validate(esm::a);

   private static DataResult<esm> a(esm $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eso b() {
      return esp.k;
   }

   @Override
   public Set<erw<?>> a() {
      return Set.of(erz.g);
   }

   public boolean a(eph $$0) {
      drd $$1 = $$0.c(erz.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static esm.a a(dea $$0) {
      return new esm.a($$0);
   }

   public ix<dea> c() {
      return this.b;
   }

   public Optional<dl> d() {
      return this.c;
   }

   public static class a implements esn.a {
      private final ix<dea> a;
      private Optional<dl> b = Optional.empty();

      public a(dea $$0) {
         this.a = $$0.q();
      }

      public esm.a a(dl.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public esn build() {
         return new esm(this.a, this.b);
      }
   }
}
