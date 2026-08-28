import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdb(jf<dmr> b, Optional<dr> c) implements fdc {
   public static final MapCodec<fdb> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mg.e.r().fieldOf("block").forGetter(fdb::c), dr.a.optionalFieldOf("properties").forGetter(fdb::d)).apply($$0, fdb::new)
      )
      .validate(fdb::a);

   private static DataResult<fdb> a(fdb $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public fdd b() {
      return fde.i;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.g);
   }

   public boolean a(ezt $$0) {
      eat $$1 = $$0.c(fcn.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static fdb.a a(dmr $$0) {
      return new fdb.a($$0);
   }

   public jf<dmr> c() {
      return this.b;
   }

   public Optional<dr> d() {
      return this.c;
   }

   public static class a implements fdc.a {
      private final jf<dmr> a;
      private Optional<dr> b = Optional.empty();

      public a(dmr $$0) {
         this.a = $$0.p();
      }

      public fdb.a a(dr.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public fdc build() {
         return new fdb(this.a, this.b);
      }
   }
}
