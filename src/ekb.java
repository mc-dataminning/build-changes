import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ekb(Optional<ca> b) implements eju {
   public static final Codec<ekb> a = RecordCodecBuilder.create($$0 -> $$0.group(atv.a(ca.a, "predicate").forGetter(ekb::c)).apply($$0, ekb::new));

   @Override
   public ejv b() {
      return ejw.k;
   }

   @Override
   public Set<ejd<?>> a() {
      return ImmutableSet.of(ejg.i);
   }

   public boolean a(egv $$0) {
      cmx $$1 = $$0.c(ejg.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static eju.a a(ca.a $$0) {
      return () -> new ekb(Optional.of($$0.b()));
   }

   public Optional<ca> c() {
      return this.b;
   }
}
