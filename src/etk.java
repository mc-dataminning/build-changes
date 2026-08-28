import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etk(Optional<bj> b) implements etq {
   public static final MapCodec<etk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bj.a.optionalFieldOf("predicate").forGetter(etk::c)).apply($$0, etk::new));

   @Override
   public etr b() {
      return ets.o;
   }

   @Override
   public Set<esz<?>> a() {
      return ImmutableSet.of(etc.f, etc.c);
   }

   public boolean a(eqg $$0) {
      brl $$1 = $$0.c(etc.c);
      evp $$2 = $$0.c(etc.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static etq.a a(bj.a $$0) {
      return () -> new etk(Optional.of($$0.b()));
   }

   public Optional<bj> c() {
      return this.b;
   }
}
