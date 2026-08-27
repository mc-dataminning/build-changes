import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eid(Optional<cb> b) implements ehw {
   public static final Codec<eid> a = RecordCodecBuilder.create($$0 -> $$0.group(asu.a(cb.a, "predicate").forGetter(eid::c)).apply($$0, eid::new));

   @Override
   public ehx b() {
      return ehy.k;
   }

   @Override
   public Set<ehf<?>> a() {
      return ImmutableSet.of(ehi.i);
   }

   public boolean a(eex $$0) {
      clj $$1 = $$0.c(ehi.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ehw.a a(cb.a $$0) {
      return () -> new eid(Optional.of($$0.b()));
   }

   public Optional<cb> c() {
      return this.b;
   }
}
