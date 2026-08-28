import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eza(jr<djn> b, Optional<ef> c) implements ezb {
   public static final MapCodec<eza> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mb.e.r().fieldOf("block").forGetter(eza::c), ef.a.optionalFieldOf("properties").forGetter(eza::d)).apply($$0, eza::new)
      )
      .validate(eza::a);

   private static DataResult<eza> a(eza $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ezc b() {
      return ezd.i;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eym.g);
   }

   public boolean a(evs $$0) {
      dwy $$1 = $$0.c(eym.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static eza.a a(djn $$0) {
      return new eza.a($$0);
   }

   public jr<djn> c() {
      return this.b;
   }

   public Optional<ef> d() {
      return this.c;
   }

   public static class a implements ezb.a {
      private final jr<djn> a;
      private Optional<ef> b = Optional.empty();

      public a(djn $$0) {
         this.a = $$0.p();
      }

      public eza.a a(ef.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ezb build() {
         return new eza(this.a, this.b);
      }
   }
}
