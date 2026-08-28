import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezw(jq<dkl> b, Optional<ee> c) implements ezx {
   public static final MapCodec<ezw> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ma.e.r().fieldOf("block").forGetter(ezw::c), ee.a.optionalFieldOf("properties").forGetter(ezw::d)).apply($$0, ezw::new)
      )
      .validate(ezw::a);

   private static DataResult<ezw> a(ezw $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ezy b() {
      return ezz.i;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezi.g);
   }

   public boolean a(ewo $$0) {
      dxu $$1 = $$0.c(ezi.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ezw.a a(dkl $$0) {
      return new ezw.a($$0);
   }

   public jq<dkl> c() {
      return this.b;
   }

   public Optional<ee> d() {
      return this.c;
   }

   public static class a implements ezx.a {
      private final jq<dkl> a;
      private Optional<ee> b = Optional.empty();

      public a(dkl $$0) {
         this.a = $$0.p();
      }

      public ezw.a a(ee.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ezx build() {
         return new ezw(this.a, this.b);
      }
   }
}
