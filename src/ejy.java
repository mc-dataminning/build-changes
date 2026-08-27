import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejy(Optional<bp> b, egw.b c) implements ejv {
   public static final Codec<ejy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(atw.a(bp.a, "predicate").forGetter(ejy::c), egw.b.e.fieldOf("entity").forGetter(ejy::d)).apply($$0, ejy::new)
   );

   @Override
   public ejw b() {
      return ejx.g;
   }

   @Override
   public Set<eje<?>> a() {
      return ImmutableSet.of(ejh.f, this.c.a());
   }

   public boolean a(egw $$0) {
      blv $$1 = $$0.c(this.c.a());
      elt $$2 = $$0.c(ejh.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ejv.a a(egw.b $$0) {
      return a($$0, bp.a.a());
   }

   public static ejv.a a(egw.b $$0, bp.a $$1) {
      return () -> new ejy(Optional.of($$1.b()), $$0);
   }

   public static ejv.a a(egw.b $$0, bp $$1) {
      return () -> new ejy(Optional.of($$1), $$0);
   }

   public Optional<bp> c() {
      return this.b;
   }

   public egw.b d() {
      return this.c;
   }
}
