import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eqf(Optional<bg> b) implements eql {
   public static final Codec<eqf> a = RecordCodecBuilder.create($$0 -> $$0.group(awu.a(bg.a, "predicate").forGetter(eqf::c)).apply($$0, eqf::new));

   @Override
   public eqm b() {
      return eqn.n;
   }

   @Override
   public Set<epu<?>> a() {
      return ImmutableSet.of(epx.f, epx.c);
   }

   public boolean a(enk $$0) {
      boy $$1 = $$0.c(epx.c);
      esj $$2 = $$0.c(epx.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static eql.a a(bg.a $$0) {
      return () -> new eqf(Optional.of($$0.b()));
   }

   public Optional<bg> c() {
      return this.b;
   }
}
