import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eqs(Optional<cc> b) implements eql {
   public static final Codec<eqs> a = RecordCodecBuilder.create($$0 -> $$0.group(awu.a(cc.a, "predicate").forGetter(eqs::c)).apply($$0, eqs::new));

   @Override
   public eqm b() {
      return eqn.k;
   }

   @Override
   public Set<epu<?>> a() {
      return ImmutableSet.of(epx.i);
   }

   public boolean a(enk $$0) {
      crs $$1 = $$0.c(epx.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static eql.a a(cc.a $$0) {
      return () -> new eqs(Optional.of($$0.b()));
   }

   public Optional<cc> c() {
      return this.b;
   }
}
