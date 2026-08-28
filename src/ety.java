import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ety(Optional<cp> b) implements etr {
   public static final MapCodec<ety> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cp.a.optionalFieldOf("predicate").forGetter(ety::c)).apply($$0, ety::new));

   @Override
   public ets b() {
      return ett.l;
   }

   @Override
   public Set<eta<?>> a() {
      return ImmutableSet.of(etd.i);
   }

   public boolean a(eqh $$0) {
      cuo $$1 = $$0.c(etd.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static etr.a a(cp.a $$0) {
      return () -> new ety(Optional.of($$0.b()));
   }

   public Optional<cp> c() {
      return this.b;
   }
}
