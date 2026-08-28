import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ety(jj<dff> b, Optional<dy> c) implements etz {
   public static final MapCodec<ety> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lq.e.s().fieldOf("block").forGetter(ety::c), dy.a.optionalFieldOf("properties").forGetter(ety::d)).apply($$0, ety::new)
      )
      .validate(ety::a);

   private static DataResult<ety> a(ety $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eua b() {
      return eub.i;
   }

   @Override
   public Set<eth<?>> a() {
      return Set.of(etk.g);
   }

   public boolean a(eqo $$0) {
      dsh $$1 = $$0.c(etk.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ety.a a(dff $$0) {
      return new ety.a($$0);
   }

   public jj<dff> c() {
      return this.b;
   }

   public Optional<dy> d() {
      return this.c;
   }

   public static class a implements etz.a {
      private final jj<dff> a;
      private Optional<dy> b = Optional.empty();

      public a(dff $$0) {
         this.a = $$0.s();
      }

      public ety.a a(dy.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public etz build() {
         return new ety(this.a, this.b);
      }
   }
}
