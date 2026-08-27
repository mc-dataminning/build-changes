import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record emi(Optional<cc> b) implements emb {
   public static final Codec<emi> a = RecordCodecBuilder.create($$0 -> $$0.group(avq.a(cc.a, "predicate").forGetter(emi::c)).apply($$0, emi::new));

   @Override
   public emc b() {
      return emd.k;
   }

   @Override
   public Set<elk<?>> a() {
      return ImmutableSet.of(eln.i);
   }

   public boolean a(ejc $$0) {
      cpd $$1 = $$0.c(eln.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static emb.a a(cc.a $$0) {
      return () -> new emi(Optional.of($$0.b()));
   }

   public Optional<cc> c() {
      return this.b;
   }
}
