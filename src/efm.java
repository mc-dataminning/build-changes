import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efm(Optional<bz> b) implements eff {
   public static final Codec<efm> a = RecordCodecBuilder.create($$0 -> $$0.group(aqy.a(bz.a, "predicate").forGetter(efm::c)).apply($$0, efm::new));

   @Override
   public efg b() {
      return efh.k;
   }

   @Override
   public Set<eeo<?>> a() {
      return ImmutableSet.of(eer.i);
   }

   public boolean a(ecg $$0) {
      cix $$1 = $$0.c(eer.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static eff.a a(bz.a $$0) {
      return () -> new efm($$0.b());
   }

   public Optional<bz> c() {
      return this.b;
   }
}
