import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efe(Optional<bf> b) implements efk {
   public static final Codec<efe> a = RecordCodecBuilder.create($$0 -> $$0.group(arb.a(bf.a, "predicate").forGetter(efe::c)).apply($$0, efe::new));

   @Override
   public efl b() {
      return efm.n;
   }

   @Override
   public Set<eet<?>> a() {
      return ImmutableSet.of(eew.f, eew.c);
   }

   public boolean a(ecl $$0) {
      bhj $$1 = $$0.c(eew.c);
      ehi $$2 = $$0.c(eew.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static efk.a a(bf.a $$0) {
      return () -> new efe(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
