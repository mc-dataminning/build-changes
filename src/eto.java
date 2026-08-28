import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eto(Optional<bj> b) implements etu {
   public static final MapCodec<eto> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bj.a.optionalFieldOf("predicate").forGetter(eto::c)).apply($$0, eto::new));

   @Override
   public etv b() {
      return etw.o;
   }

   @Override
   public Set<etd<?>> a() {
      return ImmutableSet.of(etg.f, etg.c);
   }

   public boolean a(eqk $$0) {
      brp $$1 = $$0.c(etg.c);
      evt $$2 = $$0.c(etg.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static etu.a a(bj.a $$0) {
      return () -> new eto(Optional.of($$0.b()));
   }

   public Optional<bj> c() {
      return this.b;
   }
}
