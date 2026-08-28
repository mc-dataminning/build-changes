import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exk(Optional<bl> b) implements exr {
   public static final MapCodec<exk> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bl.a.optionalFieldOf("predicate").forGetter(exk::c)).apply($$0, exk::new));

   @Override
   public exs b() {
      return ext.m;
   }

   @Override
   public Set<ewz<?>> a() {
      return ImmutableSet.of(exc.f, exc.c);
   }

   public boolean a(eug $$0) {
      bsy $$1 = $$0.c(exc.c);
      ezr $$2 = $$0.c(exc.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static exr.a a(bl.a $$0) {
      return () -> new exk(Optional.of($$0.b()));
   }

   public Optional<bl> c() {
      return this.b;
   }
}
