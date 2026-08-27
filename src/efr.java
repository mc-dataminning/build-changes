import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efr(Optional<cb> b) implements efk {
   public static final Codec<efr> a = RecordCodecBuilder.create($$0 -> $$0.group(arb.a(cb.a, "predicate").forGetter(efr::c)).apply($$0, efr::new));

   @Override
   public efl b() {
      return efm.k;
   }

   @Override
   public Set<eet<?>> a() {
      return ImmutableSet.of(eew.i);
   }

   public boolean a(ecl $$0) {
      cja $$1 = $$0.c(eew.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static efk.a a(cb.a $$0) {
      return () -> new efr(Optional.of($$0.b()));
   }

   public Optional<cb> c() {
      return this.b;
   }
}
