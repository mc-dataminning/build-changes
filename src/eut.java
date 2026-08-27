import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eut(ja<dfc> b, Optional<dn> c) implements euu {
   public static final Codec<eut> a = axu.b(
      RecordCodecBuilder.create($$0 -> $$0.group(lh.e.r().fieldOf("block").forGetter(eut::c), axu.a(dn.a, "properties").forGetter(eut::d)).apply($$0, eut::new)),
      eut::a
   );

   private static DataResult<eut> a(eut $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public euv b() {
      return euw.k;
   }

   @Override
   public Set<eud<?>> a() {
      return Set.of(eug.g);
   }

   public boolean a(erp $$0) {
      dtc $$1 = $$0.c(eug.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static eut.a a(dfc $$0) {
      return new eut.a($$0);
   }

   public ja<dfc> c() {
      return this.b;
   }

   public Optional<dn> d() {
      return this.c;
   }

   public static class a implements euu.a {
      private final ja<dfc> a;
      private Optional<dn> b = Optional.empty();

      public a(dfc $$0) {
         this.a = $$0.r();
      }

      public eut.a a(dn.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public euu build() {
         return new eut(this.a, this.b);
      }
   }
}
