import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efj(Optional<bf> b) implements efp {
   public static final Codec<efj> a = RecordCodecBuilder.create($$0 -> $$0.group(arf.a(bf.a, "predicate").forGetter(efj::c)).apply($$0, efj::new));

   @Override
   public efq b() {
      return efr.n;
   }

   @Override
   public Set<eey<?>> a() {
      return ImmutableSet.of(efb.f, efb.c);
   }

   public boolean a(ecq $$0) {
      bho $$1 = $$0.c(efb.c);
      ehn $$2 = $$0.c(efb.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static efp.a a(bf.a $$0) {
      return () -> new efj(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
