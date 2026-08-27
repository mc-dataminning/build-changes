import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record esf(Optional<bg> b) implements esl {
   public static final MapCodec<esf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bg.a.optionalFieldOf("predicate").forGetter(esf::c)).apply($$0, esf::new));

   @Override
   public esm b() {
      return esn.o;
   }

   @Override
   public Set<eru<?>> a() {
      return ImmutableSet.of(erx.f, erx.c);
   }

   public boolean a(epf $$0) {
      bqn $$1 = $$0.c(erx.c);
      euk $$2 = $$0.c(erx.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static esl.a a(bg.a $$0) {
      return () -> new esf(Optional.of($$0.b()));
   }

   public Optional<bg> c() {
      return this.b;
   }
}
