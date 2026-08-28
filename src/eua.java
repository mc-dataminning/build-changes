import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eua(Optional<bj> b) implements euh {
   public static final MapCodec<eua> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bj.a.optionalFieldOf("predicate").forGetter(eua::c)).apply($$0, eua::new));

   @Override
   public eui b() {
      return euj.m;
   }

   @Override
   public Set<etp<?>> a() {
      return ImmutableSet.of(ets.f, ets.c);
   }

   public boolean a(eqw $$0) {
      bra $$1 = $$0.c(ets.c);
      ewh $$2 = $$0.c(ets.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static euh.a a(bj.a $$0) {
      return () -> new eua(Optional.of($$0.b()));
   }

   public Optional<bj> c() {
      return this.b;
   }
}
