import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejp(Optional<bf> b) implements ejv {
   public static final Codec<ejp> a = RecordCodecBuilder.create($$0 -> $$0.group(atw.a(bf.a, "predicate").forGetter(ejp::c)).apply($$0, ejp::new));

   @Override
   public ejw b() {
      return ejx.n;
   }

   @Override
   public Set<eje<?>> a() {
      return ImmutableSet.of(ejh.f, ejh.c);
   }

   public boolean a(egw $$0) {
      bkt $$1 = $$0.c(ejh.c);
      elt $$2 = $$0.c(ejh.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ejv.a a(bf.a $$0) {
      return () -> new ejp(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
