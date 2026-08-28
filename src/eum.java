import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eum(Optional<cp> b) implements euf {
   public static final MapCodec<eum> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cp.a.optionalFieldOf("predicate").forGetter(eum::c)).apply($$0, eum::new));

   @Override
   public eug b() {
      return euh.j;
   }

   @Override
   public Set<etn<?>> a() {
      return ImmutableSet.of(etq.i);
   }

   public boolean a(equ $$0) {
      cuc $$1 = $$0.c(etq.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static euf.a a(cp.a $$0) {
      return () -> new eum(Optional.of($$0.b()));
   }

   public Optional<cp> c() {
      return this.b;
   }
}
