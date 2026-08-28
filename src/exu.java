import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exu(Optional<cu> b) implements exn {
   public static final MapCodec<exu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cu.a.optionalFieldOf("predicate").forGetter(exu::c)).apply($$0, exu::new));

   @Override
   public exo b() {
      return exp.j;
   }

   @Override
   public Set<ewv<?>> a() {
      return ImmutableSet.of(ewy.i);
   }

   public boolean a(euc $$0) {
      cwb $$1 = $$0.c(ewy.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static exn.a a(cu.a $$0) {
      return () -> new exu(Optional.of($$0.b()));
   }

   public Optional<cu> c() {
      return this.b;
   }
}
