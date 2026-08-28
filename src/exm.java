import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exm(jq<die> b, Optional<ee> c) implements exn {
   public static final MapCodec<exm> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ly.e.r().fieldOf("block").forGetter(exm::c), ee.a.optionalFieldOf("properties").forGetter(exm::d)).apply($$0, exm::new)
      )
      .validate(exm::a);

   private static DataResult<exm> a(exm $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public exo b() {
      return exp.i;
   }

   @Override
   public Set<ewv<?>> a() {
      return Set.of(ewy.g);
   }

   public boolean a(euc $$0) {
      dvj $$1 = $$0.c(ewy.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static exm.a a(die $$0) {
      return new exm.a($$0);
   }

   public jq<die> c() {
      return this.b;
   }

   public Optional<ee> d() {
      return this.c;
   }

   public static class a implements exn.a {
      private final jq<die> a;
      private Optional<ee> b = Optional.empty();

      public a(die $$0) {
         this.a = $$0.p();
      }

      public exm.a a(ee.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public exn build() {
         return new exm(this.a, this.b);
      }
   }
}
