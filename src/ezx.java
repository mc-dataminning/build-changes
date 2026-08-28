import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezx(jq<dkm> b, Optional<ee> c) implements ezy {
   public static final MapCodec<ezx> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ma.e.r().fieldOf("block").forGetter(ezx::c), ee.a.optionalFieldOf("properties").forGetter(ezx::d)).apply($$0, ezx::new)
      )
      .validate(ezx::a);

   private static DataResult<ezx> a(ezx $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ezz b() {
      return faa.i;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezj.g);
   }

   public boolean a(ewp $$0) {
      dxv $$1 = $$0.c(ezj.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ezx.a a(dkm $$0) {
      return new ezx.a($$0);
   }

   public jq<dkm> c() {
      return this.b;
   }

   public Optional<ee> d() {
      return this.c;
   }

   public static class a implements ezy.a {
      private final jq<dkm> a;
      private Optional<ee> b = Optional.empty();

      public a(dkm $$0) {
         this.a = $$0.p();
      }

      public ezx.a a(ee.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ezy build() {
         return new ezx(this.a, this.b);
      }
   }
}
