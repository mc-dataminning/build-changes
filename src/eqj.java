import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eqj(Optional<cc> b) implements eqc {
   public static final Codec<eqj> a = RecordCodecBuilder.create($$0 -> $$0.group(aws.a(cc.a, "predicate").forGetter(eqj::c)).apply($$0, eqj::new));

   @Override
   public eqd b() {
      return eqe.k;
   }

   @Override
   public Set<epl<?>> a() {
      return ImmutableSet.of(epo.i);
   }

   public boolean a(enb $$0) {
      crj $$1 = $$0.c(epo.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static eqc.a a(cc.a $$0) {
      return () -> new eqj(Optional.of($$0.b()));
   }

   public Optional<cc> c() {
      return this.b;
   }
}
