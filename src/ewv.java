import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewv(jo<dhm> b, Optional<ec> c) implements eww {
   public static final MapCodec<ewv> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lv.e.r().fieldOf("block").forGetter(ewv::c), ec.a.optionalFieldOf("properties").forGetter(ewv::d)).apply($$0, ewv::new)
      )
      .validate(ewv::a);

   private static DataResult<ewv> a(ewv $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().k()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ewx b() {
      return ewy.i;
   }

   @Override
   public Set<ewe<?>> a() {
      return Set.of(ewh.g);
   }

   public boolean a(etl $$0) {
      dus $$1 = $$0.c(ewh.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ewv.a a(dhm $$0) {
      return new ewv.a($$0);
   }

   public jo<dhm> c() {
      return this.b;
   }

   public Optional<ec> d() {
      return this.c;
   }

   public static class a implements eww.a {
      private final jo<dhm> a;
      private Optional<ec> b = Optional.empty();

      public a(dhm $$0) {
         this.a = $$0.r();
      }

      public ewv.a a(ec.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public eww build() {
         return new ewv(this.a, this.b);
      }
   }
}
