import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etm(Optional<bj> b) implements ets {
   public static final MapCodec<etm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bj.a.optionalFieldOf("predicate").forGetter(etm::c)).apply($$0, etm::new));

   @Override
   public ett b() {
      return etu.o;
   }

   @Override
   public Set<etb<?>> a() {
      return ImmutableSet.of(ete.f, ete.c);
   }

   public boolean a(eqi $$0) {
      brn $$1 = $$0.c(ete.c);
      evr $$2 = $$0.c(ete.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ets.a a(bj.a $$0) {
      return () -> new etm(Optional.of($$0.b()));
   }

   public Optional<bj> c() {
      return this.b;
   }
}
