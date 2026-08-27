import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eji(Optional<bf> b) implements ejo {
   public static final Codec<eji> a = RecordCodecBuilder.create($$0 -> $$0.group(atq.a(bf.a, "predicate").forGetter(eji::c)).apply($$0, eji::new));

   @Override
   public ejp b() {
      return ejq.n;
   }

   @Override
   public Set<eix<?>> a() {
      return ImmutableSet.of(eja.f, eja.c);
   }

   public boolean a(egp $$0) {
      bkn $$1 = $$0.c(eja.c);
      elm $$2 = $$0.c(eja.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ejo.a a(bf.a $$0) {
      return () -> new eji(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
