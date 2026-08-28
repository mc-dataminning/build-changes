import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eua(Optional<cp> b) implements ett {
   public static final MapCodec<eua> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cp.a.optionalFieldOf("predicate").forGetter(eua::c)).apply($$0, eua::new));

   @Override
   public etu b() {
      return etv.l;
   }

   @Override
   public Set<etc<?>> a() {
      return ImmutableSet.of(etf.i);
   }

   public boolean a(eqj $$0) {
      cuq $$1 = $$0.c(etf.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ett.a a(cp.a $$0) {
      return () -> new eua(Optional.of($$0.b()));
   }

   public Optional<cp> c() {
      return this.b;
   }
}
