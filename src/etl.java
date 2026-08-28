import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etl(Optional<bj> b) implements etr {
   public static final MapCodec<etl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bj.a.optionalFieldOf("predicate").forGetter(etl::c)).apply($$0, etl::new));

   @Override
   public ets b() {
      return ett.o;
   }

   @Override
   public Set<eta<?>> a() {
      return ImmutableSet.of(etd.f, etd.c);
   }

   public boolean a(eqh $$0) {
      brm $$1 = $$0.c(etd.c);
      evq $$2 = $$0.c(etd.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static etr.a a(bj.a $$0) {
      return () -> new etl(Optional.of($$0.b()));
   }

   public Optional<bj> c() {
      return this.b;
   }
}
