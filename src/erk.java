import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record erk(Optional<bg> b) implements erq {
   public static final Codec<erk> a = RecordCodecBuilder.create($$0 -> $$0.group(axh.a(bg.a, "predicate").forGetter(erk::c)).apply($$0, erk::new));

   @Override
   public err b() {
      return ers.o;
   }

   @Override
   public Set<eqz<?>> a() {
      return ImmutableSet.of(erc.f, erc.c);
   }

   public boolean a(eol $$0) {
      bqf $$1 = $$0.c(erc.c);
      etp $$2 = $$0.c(erc.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static erq.a a(bg.a $$0) {
      return () -> new erk(Optional.of($$0.b()));
   }

   public Optional<bg> c() {
      return this.b;
   }
}
