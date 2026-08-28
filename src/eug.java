import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eug(Optional<cp> b) implements etz {
   public static final MapCodec<eug> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cp.a.optionalFieldOf("predicate").forGetter(eug::c)).apply($$0, eug::new));

   @Override
   public eua b() {
      return eub.j;
   }

   @Override
   public Set<eth<?>> a() {
      return ImmutableSet.of(etk.i);
   }

   public boolean a(eqo $$0) {
      cua $$1 = $$0.c(etk.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static etz.a a(cp.a $$0) {
      return () -> new eug(Optional.of($$0.b()));
   }

   public Optional<cp> c() {
      return this.b;
   }
}
