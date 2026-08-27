import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejr(Optional<bp> b, egp.b c) implements ejo {
   public static final Codec<ejr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atq.a(bp.a, "predicate").forGetter(ejr::c), egp.b.e.fieldOf("entity").forGetter(ejr::d)).apply($$0, ejr::new)
   );

   @Override
   public ejp b() {
      return ejq.g;
   }

   @Override
   public Set<eix<?>> a() {
      return ImmutableSet.of(eja.f, this.c.a());
   }

   public boolean a(egp $$0) {
      blp $$1 = $$0.c(this.c.a());
      elm $$2 = $$0.c(eja.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ejo.a a(egp.b $$0) {
      return a($$0, bp.a.a());
   }

   public static ejo.a a(egp.b $$0, bp.a $$1) {
      return () -> new ejr(Optional.of($$1.b()), $$0);
   }

   public static ejo.a a(egp.b $$0, bp $$1) {
      return () -> new ejr(Optional.of($$1), $$0);
   }

   public Optional<bp> c() {
      return this.b;
   }

   public egp.b d() {
      return this.c;
   }
}
