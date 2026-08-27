import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ess(Optional<ch> b) implements esl {
   public static final MapCodec<ess> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ch.a.optionalFieldOf("predicate").forGetter(ess::c)).apply($$0, ess::new));

   @Override
   public esm b() {
      return esn.l;
   }

   @Override
   public Set<eru<?>> a() {
      return ImmutableSet.of(erx.i);
   }

   public boolean a(epf $$0) {
      cto $$1 = $$0.c(erx.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static esl.a a(ch.a $$0) {
      return () -> new ess(Optional.of($$0.b()));
   }

   public Optional<ch> c() {
      return this.b;
   }
}
