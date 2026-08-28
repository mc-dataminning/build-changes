import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record evd(Optional<cs> b) implements euw {
   public static final MapCodec<evd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cs.a.optionalFieldOf("predicate").forGetter(evd::c)).apply($$0, evd::new));

   @Override
   public eux b() {
      return euy.j;
   }

   @Override
   public Set<eue<?>> a() {
      return ImmutableSet.of(euh.i);
   }

   public boolean a(erl $$0) {
      cuo $$1 = $$0.c(euh.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static euw.a a(cs.a $$0) {
      return () -> new evd(Optional.of($$0.b()));
   }

   public Optional<cs> c() {
      return this.b;
   }
}
