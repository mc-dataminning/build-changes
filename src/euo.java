import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record euo(Optional<cp> b) implements euh {
   public static final MapCodec<euo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cp.a.optionalFieldOf("predicate").forGetter(euo::c)).apply($$0, euo::new));

   @Override
   public eui b() {
      return euj.j;
   }

   @Override
   public Set<etp<?>> a() {
      return ImmutableSet.of(ets.i);
   }

   public boolean a(eqw $$0) {
      cud $$1 = $$0.c(ets.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static euh.a a(cp.a $$0) {
      return () -> new euo(Optional.of($$0.b()));
   }

   public Optional<cp> c() {
      return this.b;
   }
}
