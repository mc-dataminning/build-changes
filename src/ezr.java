import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezr(jq<dke> b, Optional<ee> c) implements ezs {
   public static final MapCodec<ezr> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ma.e.r().fieldOf("block").forGetter(ezr::c), ee.a.optionalFieldOf("properties").forGetter(ezr::d)).apply($$0, ezr::new)
      )
      .validate(ezr::a);

   private static DataResult<ezr> a(ezr $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ezt b() {
      return ezu.i;
   }

   @Override
   public Set<eza<?>> a() {
      return Set.of(ezd.g);
   }

   public boolean a(ewh $$0) {
      dxn $$1 = $$0.c(ezd.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ezr.a a(dke $$0) {
      return new ezr.a($$0);
   }

   public jq<dke> c() {
      return this.b;
   }

   public Optional<ee> d() {
      return this.c;
   }

   public static class a implements ezs.a {
      private final jq<dke> a;
      private Optional<ee> b = Optional.empty();

      public a(dke $$0) {
         this.a = $$0.p();
      }

      public ezr.a a(ee.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ezs build() {
         return new ezr(this.a, this.b);
      }
   }
}
