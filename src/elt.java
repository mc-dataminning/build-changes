import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record elt(ij<cyo> b, Optional<db> c) implements elu {
   public static final Codec<elt> a = avp.a(
      RecordCodecBuilder.create($$0 -> $$0.group(kf.e.r().fieldOf("block").forGetter(elt::c), avp.a(db.a, "properties").forGetter(elt::d)).apply($$0, elt::new)),
      elt::a
   );

   private static DataResult<elt> a(elt $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public elv b() {
      return elw.j;
   }

   @Override
   public Set<eld<?>> a() {
      return Set.of(elg.g);
   }

   public boolean a(eiv $$0) {
      dlf $$1 = $$0.c(elg.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static elt.a a(cyo $$0) {
      return new elt.a($$0);
   }

   public ij<cyo> c() {
      return this.b;
   }

   public Optional<db> d() {
      return this.c;
   }

   public static class a implements elu.a {
      private final ij<cyo> a;
      private Optional<db> b = Optional.empty();

      public a(cyo $$0) {
         this.a = $$0.r();
      }

      public elt.a a(db.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public elu build() {
         return new elt(this.a, this.b);
      }
   }
}
