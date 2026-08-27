import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ehv(Optional<bf> b) implements eib {
   public static final Codec<ehv> a = RecordCodecBuilder.create($$0 -> $$0.group(asy.a(bf.a, "predicate").forGetter(ehv::c)).apply($$0, ehv::new));

   @Override
   public eic b() {
      return eid.n;
   }

   @Override
   public Set<ehk<?>> a() {
      return ImmutableSet.of(ehn.f, ehn.c);
   }

   public boolean a(efc $$0) {
      bjt $$1 = $$0.c(ehn.c);
      ejz $$2 = $$0.c(ehn.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static eib.a a(bf.a $$0) {
      return () -> new ehv(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
