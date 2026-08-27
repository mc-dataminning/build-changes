import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ema(ij<cys> b, Optional<db> c) implements emb {
   public static final Codec<ema> a = avq.a(
      RecordCodecBuilder.create($$0 -> $$0.group(kf.e.r().fieldOf("block").forGetter(ema::c), avq.a(db.a, "properties").forGetter(ema::d)).apply($$0, ema::new)),
      ema::a
   );

   private static DataResult<ema> a(ema $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public emc b() {
      return emd.j;
   }

   @Override
   public Set<elk<?>> a() {
      return Set.of(eln.g);
   }

   public boolean a(ejc $$0) {
      dlj $$1 = $$0.c(eln.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ema.a a(cys $$0) {
      return new ema.a($$0);
   }

   public ij<cys> c() {
      return this.b;
   }

   public Optional<db> d() {
      return this.c;
   }

   public static class a implements emb.a {
      private final ij<cys> a;
      private Optional<db> b = Optional.empty();

      public a(cys $$0) {
         this.a = $$0.r();
      }

      public ema.a a(db.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public emb build() {
         return new ema(this.a, this.b);
      }
   }
}
