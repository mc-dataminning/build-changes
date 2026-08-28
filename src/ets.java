import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ets(Optional<bj> b) implements etz {
   public static final MapCodec<ets> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bj.a.optionalFieldOf("predicate").forGetter(ets::c)).apply($$0, ets::new));

   @Override
   public eua b() {
      return eub.m;
   }

   @Override
   public Set<eth<?>> a() {
      return ImmutableSet.of(etk.f, etk.c);
   }

   public boolean a(eqo $$0) {
      bqw $$1 = $$0.c(etk.c);
      evz $$2 = $$0.c(etk.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static etz.a a(bj.a $$0) {
      return () -> new ets(Optional.of($$0.b()));
   }

   public Optional<bj> c() {
      return this.b;
   }
}
