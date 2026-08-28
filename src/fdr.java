import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fdr(jg<dne> b, Optional<ds> c) implements fds {
   public static final MapCodec<fdr> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mh.e.r().fieldOf("block").forGetter(fdr::c), ds.a.optionalFieldOf("properties").forGetter(fdr::d)).apply($$0, fdr::new)
      )
      .validate(fdr::a);

   private static DataResult<fdr> a(fdr $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public fdt b() {
      return fdu.i;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(fdd.g);
   }

   public boolean a(faj $$0) {
      ebg $$1 = $$0.c(fdd.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static fdr.a a(dne $$0) {
      return new fdr.a($$0);
   }

   public jg<dne> c() {
      return this.b;
   }

   public Optional<ds> d() {
      return this.c;
   }

   public static class a implements fds.a {
      private final jg<dne> a;
      private Optional<ds> b = Optional.empty();

      public a(dne $$0) {
         this.a = $$0.p();
      }

      public fdr.a a(ds.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public fds build() {
         return new fdr(this.a, this.b);
      }
   }
}
