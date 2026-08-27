import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejo(Optional<bf> b) implements eju {
   public static final Codec<ejo> a = RecordCodecBuilder.create($$0 -> $$0.group(atv.a(bf.a, "predicate").forGetter(ejo::c)).apply($$0, ejo::new));

   @Override
   public ejv b() {
      return ejw.n;
   }

   @Override
   public Set<ejd<?>> a() {
      return ImmutableSet.of(ejg.f, ejg.c);
   }

   public boolean a(egv $$0) {
      bks $$1 = $$0.c(ejg.c);
      els $$2 = $$0.c(ejg.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static eju.a a(bf.a $$0) {
      return () -> new ejo(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
