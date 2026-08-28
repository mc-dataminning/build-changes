import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etu(Optional<bu> b, eqh.b c) implements etr {
   public static final MapCodec<etu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bu.a.optionalFieldOf("predicate").forGetter(etu::c), eqh.b.e.fieldOf("entity").forGetter(etu::d)).apply($$0, etu::new)
   );

   @Override
   public ets b() {
      return ett.h;
   }

   @Override
   public Set<eta<?>> a() {
      return ImmutableSet.of(etd.f, this.c.a());
   }

   public boolean a(eqh $$0) {
      bst $$1 = $$0.c(this.c.a());
      evq $$2 = $$0.c(etd.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static etr.a a(eqh.b $$0) {
      return a($$0, bu.a.a());
   }

   public static etr.a a(eqh.b $$0, bu.a $$1) {
      return () -> new etu(Optional.of($$1.b()), $$0);
   }

   public static etr.a a(eqh.b $$0, bu $$1) {
      return () -> new etu(Optional.of($$1), $$0);
   }

   public Optional<bu> c() {
      return this.b;
   }

   public eqh.b d() {
      return this.c;
   }
}
