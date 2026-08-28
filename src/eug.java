import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eug(jj<dfi> b, Optional<dy> c) implements euh {
   public static final MapCodec<eug> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lq.e.s().fieldOf("block").forGetter(eug::c), dy.a.optionalFieldOf("properties").forGetter(eug::d)).apply($$0, eug::new)
      )
      .validate(eug::a);

   private static DataResult<eug> a(eug $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eui b() {
      return euj.i;
   }

   @Override
   public Set<etp<?>> a() {
      return Set.of(ets.g);
   }

   public boolean a(eqw $$0) {
      dsl $$1 = $$0.c(ets.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static eug.a a(dfi $$0) {
      return new eug.a($$0);
   }

   public jj<dfi> c() {
      return this.b;
   }

   public Optional<dy> d() {
      return this.c;
   }

   public static class a implements euh.a {
      private final jj<dfi> a;
      private Optional<dy> b = Optional.empty();

      public a(dfi $$0) {
         this.a = $$0.s();
      }

      public eug.a a(dy.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public euh build() {
         return new eug(this.a, this.b);
      }
   }
}
