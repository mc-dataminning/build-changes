import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efq(Optional<cb> b) implements efj {
   public static final Codec<efq> a = RecordCodecBuilder.create($$0 -> $$0.group(arj.a(cb.a, "predicate").forGetter(efq::c)).apply($$0, efq::new));

   @Override
   public efk b() {
      return efl.k;
   }

   @Override
   public Set<ees<?>> a() {
      return ImmutableSet.of(eev.i);
   }

   public boolean a(eck $$0) {
      cjl $$1 = $$0.c(eev.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static efj.a a(cb.a $$0) {
      return () -> new efq(Optional.of($$0.b()));
   }

   public Optional<cb> c() {
      return this.b;
   }
}
