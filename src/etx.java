import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etx(Optional<cp> b) implements etq {
   public static final MapCodec<etx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cp.a.optionalFieldOf("predicate").forGetter(etx::c)).apply($$0, etx::new));

   @Override
   public etr b() {
      return ets.l;
   }

   @Override
   public Set<esz<?>> a() {
      return ImmutableSet.of(etc.i);
   }

   public boolean a(eqg $$0) {
      cun $$1 = $$0.c(etc.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static etq.a a(cp.a $$0) {
      return () -> new etx(Optional.of($$0.b()));
   }

   public Optional<cp> c() {
      return this.b;
   }
}
