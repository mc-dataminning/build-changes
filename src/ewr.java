import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewr(jn<dhj> b, Optional<eb> c) implements ews {
   public static final MapCodec<ewr> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lu.e.r().fieldOf("block").forGetter(ewr::c), eb.a.optionalFieldOf("properties").forGetter(ewr::d)).apply($$0, ewr::new)
      )
      .validate(ewr::a);

   private static DataResult<ewr> a(ewr $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ewt b() {
      return ewu.i;
   }

   @Override
   public Set<ewa<?>> a() {
      return Set.of(ewd.g);
   }

   public boolean a(eth $$0) {
      duo $$1 = $$0.c(ewd.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ewr.a a(dhj $$0) {
      return new ewr.a($$0);
   }

   public jn<dhj> c() {
      return this.b;
   }

   public Optional<eb> d() {
      return this.c;
   }

   public static class a implements ews.a {
      private final jn<dhj> a;
      private Optional<eb> b = Optional.empty();

      public a(dhj $$0) {
         this.a = $$0.s();
      }

      public ewr.a a(eb.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ews build() {
         return new ewr(this.a, this.b);
      }
   }
}
