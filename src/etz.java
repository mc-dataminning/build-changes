import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etz(Optional<cp> b) implements ets {
   public static final MapCodec<etz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cp.a.optionalFieldOf("predicate").forGetter(etz::c)).apply($$0, etz::new));

   @Override
   public ett b() {
      return etu.l;
   }

   @Override
   public Set<etb<?>> a() {
      return ImmutableSet.of(ete.i);
   }

   public boolean a(eqi $$0) {
      cup $$1 = $$0.c(ete.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ets.a a(cp.a $$0) {
      return () -> new etz(Optional.of($$0.b()));
   }

   public Optional<cp> c() {
      return this.b;
   }
}
