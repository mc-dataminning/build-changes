import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eyx(jr<djk> b, Optional<ef> c) implements eyy {
   public static final MapCodec<eyx> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mb.e.r().fieldOf("block").forGetter(eyx::c), ef.a.optionalFieldOf("properties").forGetter(eyx::d)).apply($$0, eyx::new)
      )
      .validate(eyx::a);

   private static DataResult<eyx> a(eyx $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eyz b() {
      return eza.i;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(eyj.g);
   }

   public boolean a(evp $$0) {
      dwv $$1 = $$0.c(eyj.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static eyx.a a(djk $$0) {
      return new eyx.a($$0);
   }

   public jr<djk> c() {
      return this.b;
   }

   public Optional<ef> d() {
      return this.c;
   }

   public static class a implements eyy.a {
      private final jr<djk> a;
      private Optional<ef> b = Optional.empty();

      public a(djk $$0) {
         this.a = $$0.p();
      }

      public eyx.a a(ef.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public eyy build() {
         return new eyx(this.a, this.b);
      }
   }
}
