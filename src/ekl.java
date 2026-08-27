import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ekl(Optional<ca> b) implements eke {
   public static final Codec<ekl> a = RecordCodecBuilder.create($$0 -> $$0.group(atx.a(ca.a, "predicate").forGetter(ekl::c)).apply($$0, ekl::new));

   @Override
   public ekf b() {
      return ekg.k;
   }

   @Override
   public Set<ejn<?>> a() {
      return ImmutableSet.of(ejq.i);
   }

   public boolean a(ehf $$0) {
      cng $$1 = $$0.c(ejq.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static eke.a a(ca.a $$0) {
      return () -> new ekl(Optional.of($$0.b()));
   }

   public Optional<ca> c() {
      return this.b;
   }
}
