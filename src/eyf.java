import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eyf(Optional<cu> b) implements exy {
   public static final MapCodec<eyf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cu.a.optionalFieldOf("predicate").forGetter(eyf::c)).apply($$0, eyf::new));

   @Override
   public exz b() {
      return eya.j;
   }

   @Override
   public Set<exg<?>> a() {
      return ImmutableSet.of(exj.i);
   }

   public boolean a(eun $$0) {
      cwm $$1 = $$0.c(exj.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static exy.a a(cu.a $$0) {
      return () -> new eyf(Optional.of($$0.b()));
   }

   public Optional<cu> c() {
      return this.b;
   }
}
