import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejv(Optional<ca> b) implements ejo {
   public static final Codec<ejv> a = RecordCodecBuilder.create($$0 -> $$0.group(atq.a(ca.a, "predicate").forGetter(ejv::c)).apply($$0, ejv::new));

   @Override
   public ejp b() {
      return ejq.k;
   }

   @Override
   public Set<eix<?>> a() {
      return ImmutableSet.of(eja.i);
   }

   public boolean a(egp $$0) {
      cmr $$1 = $$0.c(eja.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ejo.a a(ca.a $$0) {
      return () -> new ejv(Optional.of($$0.b()));
   }

   public Optional<ca> c() {
      return this.b;
   }
}
