import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exo(Optional<ct> b) implements exh {
   public static final MapCodec<exo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ct.a.optionalFieldOf("predicate").forGetter(exo::c)).apply($$0, exo::new));

   @Override
   public exi b() {
      return exj.j;
   }

   @Override
   public Set<ewp<?>> a() {
      return ImmutableSet.of(ews.i);
   }

   public boolean a(etw $$0) {
      cvx $$1 = $$0.c(ews.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static exh.a a(ct.a $$0) {
      return () -> new exo(Optional.of($$0.b()));
   }

   public Optional<ct> c() {
      return this.b;
   }
}
