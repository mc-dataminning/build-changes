import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exx(jq<diq> b, Optional<ee> c) implements exy {
   public static final MapCodec<exx> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lz.e.r().fieldOf("block").forGetter(exx::c), ee.a.optionalFieldOf("properties").forGetter(exx::d)).apply($$0, exx::new)
      )
      .validate(exx::a);

   private static DataResult<exx> a(exx $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public exz b() {
      return eya.i;
   }

   @Override
   public Set<exg<?>> a() {
      return Set.of(exj.g);
   }

   public boolean a(eun $$0) {
      dvv $$1 = $$0.c(exj.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static exx.a a(diq $$0) {
      return new exx.a($$0);
   }

   public jq<diq> c() {
      return this.b;
   }

   public Optional<ee> d() {
      return this.c;
   }

   public static class a implements exy.a {
      private final jq<diq> a;
      private Optional<ee> b = Optional.empty();

      public a(diq $$0) {
         this.a = $$0.p();
      }

      public exx.a a(ee.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public exy build() {
         return new exx(this.a, this.b);
      }
   }
}
