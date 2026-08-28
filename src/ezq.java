import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ezq(jq<dkd> b, Optional<ee> c) implements ezr {
   public static final MapCodec<ezq> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(ma.e.r().fieldOf("block").forGetter(ezq::c), ee.a.optionalFieldOf("properties").forGetter(ezq::d)).apply($$0, ezq::new)
      )
      .validate(ezq::a);

   private static DataResult<ezq> a(ezq $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ezs b() {
      return ezt.i;
   }

   @Override
   public Set<bbd<?>> a() {
      return Set.of(ezc.g);
   }

   public boolean a(ewi $$0) {
      dxo $$1 = $$0.c(ezc.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ezq.a a(dkd $$0) {
      return new ezq.a($$0);
   }

   public jq<dkd> c() {
      return this.b;
   }

   public Optional<ee> d() {
      return this.c;
   }

   public static class a implements ezr.a {
      private final jq<dkd> a;
      private Optional<ee> b = Optional.empty();

      public a(dkd $$0) {
         this.a = $$0.p();
      }

      public ezq.a a(ee.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ezr build() {
         return new ezq(this.a, this.b);
      }
   }
}
