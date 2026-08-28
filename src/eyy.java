import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eyy(jr<djl> b, Optional<ef> c) implements eyz {
   public static final MapCodec<eyy> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mb.e.r().fieldOf("block").forGetter(eyy::c), ef.a.optionalFieldOf("properties").forGetter(eyy::d)).apply($$0, eyy::new)
      )
      .validate(eyy::a);

   private static DataResult<eyy> a(eyy $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eza b() {
      return ezb.i;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyk.g);
   }

   public boolean a(evq $$0) {
      dww $$1 = $$0.c(eyk.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static eyy.a a(djl $$0) {
      return new eyy.a($$0);
   }

   public jr<djl> c() {
      return this.b;
   }

   public Optional<ef> d() {
      return this.c;
   }

   public static class a implements eyz.a {
      private final jr<djl> a;
      private Optional<ef> b = Optional.empty();

      public a(djl $$0) {
         this.a = $$0.p();
      }

      public eyy.a a(ef.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public eyz build() {
         return new eyy(this.a, this.b);
      }
   }
}
