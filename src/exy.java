import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exy(Optional<cu> b) implements exr {
   public static final MapCodec<exy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cu.a.optionalFieldOf("predicate").forGetter(exy::c)).apply($$0, exy::new));

   @Override
   public exs b() {
      return ext.j;
   }

   @Override
   public Set<ewz<?>> a() {
      return ImmutableSet.of(exc.i);
   }

   public boolean a(eug $$0) {
      cwf $$1 = $$0.c(exc.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static exr.a a(cu.a $$0) {
      return () -> new exy(Optional.of($$0.b()));
   }

   public Optional<cu> c() {
      return this.b;
   }
}
