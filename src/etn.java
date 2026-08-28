import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etn(Optional<bj> b) implements ett {
   public static final MapCodec<etn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bj.a.optionalFieldOf("predicate").forGetter(etn::c)).apply($$0, etn::new));

   @Override
   public etu b() {
      return etv.o;
   }

   @Override
   public Set<etc<?>> a() {
      return ImmutableSet.of(etf.f, etf.c);
   }

   public boolean a(eqj $$0) {
      bro $$1 = $$0.c(etf.c);
      evs $$2 = $$0.c(etf.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ett.a a(bj.a $$0) {
      return () -> new etn(Optional.of($$0.b()));
   }

   public Optional<bj> c() {
      return this.b;
   }
}
