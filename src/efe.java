import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efe(he<csl> b, Optional<cy> c) implements eff {
   public static final Codec<efe> a = aqy.a(
      RecordCodecBuilder.create($$0 -> $$0.group(jb.f.r().fieldOf("block").forGetter(efe::c), aqy.a(cy.a, "properties").forGetter(efe::d)).apply($$0, efe::new)),
      efe::a
   );

   private static DataResult<efe> a(efe $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public efg b() {
      return efh.j;
   }

   @Override
   public Set<eeo<?>> a() {
      return Set.of(eer.g);
   }

   public boolean a(ecg $$0) {
      dez $$1 = $$0.c(eer.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static efe.a a(csl $$0) {
      return new efe.a($$0);
   }

   public he<csl> c() {
      return this.b;
   }

   public Optional<cy> d() {
      return this.c;
   }

   public static class a implements eff.a {
      private final he<csl> a;
      private Optional<cy> b = Optional.empty();

      public a(csl $$0) {
         this.a = $$0.q();
      }

      public efe.a a(cy.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public eff build() {
         return new efe(this.a, this.b);
      }
   }
}
