import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etu(Optional<cp> b) implements etn {
   public static final MapCodec<etu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cp.a.optionalFieldOf("predicate").forGetter(etu::c)).apply($$0, etu::new));

   @Override
   public eto b() {
      return etp.l;
   }

   @Override
   public Set<esw<?>> a() {
      return ImmutableSet.of(esz.i);
   }

   public boolean a(eqd $$0) {
      cuk $$1 = $$0.c(esz.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static etn.a a(cp.a $$0) {
      return () -> new etu(Optional.of($$0.b()));
   }

   public Optional<cp> c() {
      return this.b;
   }
}
