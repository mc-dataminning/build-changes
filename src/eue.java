import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eue(jj<dfh> b, Optional<dy> c) implements euf {
   public static final MapCodec<eue> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lq.e.s().fieldOf("block").forGetter(eue::c), dy.a.optionalFieldOf("properties").forGetter(eue::d)).apply($$0, eue::new)
      )
      .validate(eue::a);

   private static DataResult<eue> a(eue $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eug b() {
      return euh.i;
   }

   @Override
   public Set<etn<?>> a() {
      return Set.of(etq.g);
   }

   public boolean a(equ $$0) {
      dsk $$1 = $$0.c(etq.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static eue.a a(dfh $$0) {
      return new eue.a($$0);
   }

   public jj<dfh> c() {
      return this.b;
   }

   public Optional<dy> d() {
      return this.c;
   }

   public static class a implements euf.a {
      private final jj<dfh> a;
      private Optional<dy> b = Optional.empty();

      public a(dfh $$0) {
         this.a = $$0.s();
      }

      public eue.a a(dy.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public euf build() {
         return new eue(this.a, this.b);
      }
   }
}
