import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etr(ji<dez> b, Optional<dx> c) implements ets {
   public static final MapCodec<etr> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lp.e.r().fieldOf("block").forGetter(etr::c), dx.a.optionalFieldOf("properties").forGetter(etr::d)).apply($$0, etr::new)
      )
      .validate(etr::a);

   private static DataResult<etr> a(etr $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ett b() {
      return etu.k;
   }

   @Override
   public Set<etb<?>> a() {
      return Set.of(ete.g);
   }

   public boolean a(eqi $$0) {
      dsc $$1 = $$0.c(ete.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static etr.a a(dez $$0) {
      return new etr.a($$0);
   }

   public ji<dez> c() {
      return this.b;
   }

   public Optional<dx> d() {
      return this.c;
   }

   public static class a implements ets.a {
      private final ji<dez> a;
      private Optional<dx> b = Optional.empty();

      public a(dez $$0) {
         this.a = $$0.s();
      }

      public etr.a a(dx.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ets build() {
         return new etr(this.a, this.b);
      }
   }
}
