import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efo(hg<csv> b, Optional<da> c) implements efp {
   public static final Codec<efo> a = arg.a(
      RecordCodecBuilder.create($$0 -> $$0.group(jd.f.r().fieldOf("block").forGetter(efo::c), arg.a(da.a, "properties").forGetter(efo::d)).apply($$0, efo::new)),
      efo::a
   );

   private static DataResult<efo> a(efo $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public efq b() {
      return efr.j;
   }

   @Override
   public Set<eey<?>> a() {
      return Set.of(efb.g);
   }

   public boolean a(ecq $$0) {
      dfj $$1 = $$0.c(efb.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static efo.a a(csv $$0) {
      return new efo.a($$0);
   }

   public hg<csv> c() {
      return this.b;
   }

   public Optional<da> d() {
      return this.c;
   }

   public static class a implements efp.a {
      private final hg<csv> a;
      private Optional<da> b = Optional.empty();

      public a(csv $$0) {
         this.a = $$0.q();
      }

      public efo.a a(da.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public efp build() {
         return new efo(this.a, this.b);
      }
   }
}
