import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ekc(Optional<ca> b) implements ejv {
   public static final Codec<ekc> a = RecordCodecBuilder.create($$0 -> $$0.group(atw.a(ca.a, "predicate").forGetter(ekc::c)).apply($$0, ekc::new));

   @Override
   public ejw b() {
      return ejx.k;
   }

   @Override
   public Set<eje<?>> a() {
      return ImmutableSet.of(ejh.i);
   }

   public boolean a(egw $$0) {
      cmy $$1 = $$0.c(ejh.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ejv.a a(ca.a $$0) {
      return () -> new ekc(Optional.of($$0.b()));
   }

   public Optional<ca> c() {
      return this.b;
   }
}
