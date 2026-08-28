import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exr(Optional<bl> b) implements exy {
   public static final MapCodec<exr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bl.a.optionalFieldOf("predicate").forGetter(exr::c)).apply($$0, exr::new));

   @Override
   public exz b() {
      return eya.m;
   }

   @Override
   public Set<exg<?>> a() {
      return ImmutableSet.of(exj.f, exj.c);
   }

   public boolean a(eun $$0) {
      btb $$1 = $$0.c(exj.c);
      ezy $$2 = $$0.c(exj.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static exy.a a(bl.a $$0) {
      return () -> new exr(Optional.of($$0.b()));
   }

   public Optional<bl> c() {
      return this.b;
   }
}
