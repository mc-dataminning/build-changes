import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ehq(Optional<bf> b) implements ehw {
   public static final Codec<ehq> a = RecordCodecBuilder.create($$0 -> $$0.group(asu.a(bf.a, "predicate").forGetter(ehq::c)).apply($$0, ehq::new));

   @Override
   public ehx b() {
      return ehy.n;
   }

   @Override
   public Set<ehf<?>> a() {
      return ImmutableSet.of(ehi.f, ehi.c);
   }

   public boolean a(eex $$0) {
      bjo $$1 = $$0.c(ehi.c);
      eju $$2 = $$0.c(ehi.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ehw.a a(bf.a $$0) {
      return () -> new ehq(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
