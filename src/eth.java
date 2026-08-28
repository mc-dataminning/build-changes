import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eth(Optional<bj> b) implements etn {
   public static final MapCodec<eth> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bj.a.optionalFieldOf("predicate").forGetter(eth::c)).apply($$0, eth::new));

   @Override
   public eto b() {
      return etp.o;
   }

   @Override
   public Set<esw<?>> a() {
      return ImmutableSet.of(esz.f, esz.c);
   }

   public boolean a(eqd $$0) {
      bri $$1 = $$0.c(esz.c);
      evm $$2 = $$0.c(esz.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static etn.a a(bj.a $$0) {
      return () -> new eth(Optional.of($$0.b()));
   }

   public Optional<bj> c() {
      return this.b;
   }
}
