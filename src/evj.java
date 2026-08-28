import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record evj(Optional<cs> b) implements evc {
   public static final MapCodec<evj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cs.a.optionalFieldOf("predicate").forGetter(evj::c)).apply($$0, evj::new));

   @Override
   public evd b() {
      return eve.j;
   }

   @Override
   public Set<euk<?>> a() {
      return ImmutableSet.of(eun.i);
   }

   public boolean a(err $$0) {
      cuq $$1 = $$0.c(eun.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static evc.a a(cs.a $$0) {
      return () -> new evj(Optional.of($$0.b()));
   }

   public Optional<cs> c() {
      return this.b;
   }
}
