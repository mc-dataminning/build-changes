import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eqk(in<dch> b, Optional<dc> c) implements eql {
   public static final Codec<eqk> a = awu.b(
      RecordCodecBuilder.create($$0 -> $$0.group(kt.e.r().fieldOf("block").forGetter(eqk::c), awu.a(dc.a, "properties").forGetter(eqk::d)).apply($$0, eqk::new)),
      eqk::a
   );

   private static DataResult<eqk> a(eqk $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eqm b() {
      return eqn.j;
   }

   @Override
   public Set<epu<?>> a() {
      return Set.of(epx.g);
   }

   public boolean a(enk $$0) {
      dpi $$1 = $$0.c(epx.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static eqk.a a(dch $$0) {
      return new eqk.a($$0);
   }

   public in<dch> c() {
      return this.b;
   }

   public Optional<dc> d() {
      return this.c;
   }

   public static class a implements eql.a {
      private final in<dch> a;
      private Optional<dc> b = Optional.empty();

      public a(dch $$0) {
         this.a = $$0.r();
      }

      public eqk.a a(dc.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public eql build() {
         return new eqk(this.a, this.b);
      }
   }
}
