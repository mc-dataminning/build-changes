import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ehv(ib<cva> b, Optional<da> c) implements ehw {
   public static final Codec<ehv> a = asu.a(
      RecordCodecBuilder.create($$0 -> $$0.group(jy.f.r().fieldOf("block").forGetter(ehv::c), asu.a(da.a, "properties").forGetter(ehv::d)).apply($$0, ehv::new)),
      ehv::a
   );

   private static DataResult<ehv> a(ehv $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ehx b() {
      return ehy.j;
   }

   @Override
   public Set<ehf<?>> a() {
      return Set.of(ehi.g);
   }

   public boolean a(eex $$0) {
      dhi $$1 = $$0.c(ehi.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ehv.a a(cva $$0) {
      return new ehv.a($$0);
   }

   public ib<cva> c() {
      return this.b;
   }

   public Optional<da> d() {
      return this.c;
   }

   public static class a implements ehw.a {
      private final ib<cva> a;
      private Optional<da> b = Optional.empty();

      public a(cva $$0) {
         this.a = $$0.r();
      }

      public ehv.a a(da.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ehw build() {
         return new ehv(this.a, this.b);
      }
   }
}
