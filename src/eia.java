import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eia(ig<cvf> b, Optional<da> c) implements eib {
   public static final Codec<eia> a = asy.a(
      RecordCodecBuilder.create($$0 -> $$0.group(kc.f.r().fieldOf("block").forGetter(eia::c), asy.a(da.a, "properties").forGetter(eia::d)).apply($$0, eia::new)),
      eia::a
   );

   private static DataResult<eia> a(eia $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eic b() {
      return eid.j;
   }

   @Override
   public Set<ehk<?>> a() {
      return Set.of(ehn.g);
   }

   public boolean a(efc $$0) {
      dhn $$1 = $$0.c(ehn.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static eia.a a(cvf $$0) {
      return new eia.a($$0);
   }

   public ig<cvf> c() {
      return this.b;
   }

   public Optional<da> d() {
      return this.c;
   }

   public static class a implements eib.a {
      private final ig<cvf> a;
      private Optional<da> b = Optional.empty();

      public a(cvf $$0) {
         this.a = $$0.r();
      }

      public eia.a a(da.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public eib build() {
         return new eia(this.a, this.b);
      }
   }
}
