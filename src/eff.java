import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eff(he<csm> b, Optional<cy> c) implements efg {
   public static final Codec<eff> a = aqy.a(
      RecordCodecBuilder.create($$0 -> $$0.group(jb.f.r().fieldOf("block").forGetter(eff::c), aqy.a(cy.a, "properties").forGetter(eff::d)).apply($$0, eff::new)),
      eff::a
   );

   private static DataResult<eff> a(eff $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public efh b() {
      return efi.j;
   }

   @Override
   public Set<eep<?>> a() {
      return Set.of(ees.g);
   }

   public boolean a(ech $$0) {
      dfa $$1 = $$0.c(ees.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static eff.a a(csm $$0) {
      return new eff.a($$0);
   }

   public he<csm> c() {
      return this.b;
   }

   public Optional<cy> d() {
      return this.c;
   }

   public static class a implements efg.a {
      private final he<csm> a;
      private Optional<cy> b = Optional.empty();

      public a(csm $$0) {
         this.a = $$0.q();
      }

      public eff.a a(cy.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public efg build() {
         return new eff(this.a, this.b);
      }
   }
}
