import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eub(Optional<cp> b) implements etu {
   public static final MapCodec<eub> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cp.a.optionalFieldOf("predicate").forGetter(eub::c)).apply($$0, eub::new));

   @Override
   public etv b() {
      return etw.l;
   }

   @Override
   public Set<etd<?>> a() {
      return ImmutableSet.of(etg.i);
   }

   public boolean a(eqk $$0) {
      cur $$1 = $$0.c(etg.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static etu.a a(cp.a $$0) {
      return () -> new eub(Optional.of($$0.b()));
   }

   public Optional<cp> c() {
      return this.b;
   }
}
