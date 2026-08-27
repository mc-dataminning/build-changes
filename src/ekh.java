import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ekh(Optional<bp> b, ehf.b c) implements eke {
   public static final Codec<ekh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atx.a(bp.a, "predicate").forGetter(ekh::c), ehf.b.e.fieldOf("entity").forGetter(ekh::d)).apply($$0, ekh::new)
   );

   @Override
   public ekf b() {
      return ekg.g;
   }

   @Override
   public Set<ejn<?>> a() {
      return ImmutableSet.of(ejq.f, this.c.a());
   }

   public boolean a(ehf $$0) {
      blw $$1 = $$0.c(this.c.a());
      emc $$2 = $$0.c(ejq.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static eke.a a(ehf.b $$0) {
      return a($$0, bp.a.a());
   }

   public static eke.a a(ehf.b $$0, bp.a $$1) {
      return () -> new ekh(Optional.of($$1.b()), $$0);
   }

   public static eke.a a(ehf.b $$0, bp $$1) {
      return () -> new ekh(Optional.of($$1), $$0);
   }

   public Optional<bp> c() {
      return this.b;
   }

   public ehf.b d() {
      return this.c;
   }
}
