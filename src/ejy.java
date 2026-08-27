import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejy(Optional<bf> b) implements eke {
   public static final Codec<ejy> a = RecordCodecBuilder.create($$0 -> $$0.group(atx.a(bf.a, "predicate").forGetter(ejy::c)).apply($$0, ejy::new));

   @Override
   public ekf b() {
      return ekg.n;
   }

   @Override
   public Set<ejn<?>> a() {
      return ImmutableSet.of(ejq.f, ejq.c);
   }

   public boolean a(ehf $$0) {
      bkv $$1 = $$0.c(ejq.c);
      emc $$2 = $$0.c(ejq.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static eke.a a(bf.a $$0) {
      return () -> new ejy(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
