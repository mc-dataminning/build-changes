import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record etq(Optional<bu> b, eqd.b c) implements etn {
   public static final MapCodec<etq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bu.a.optionalFieldOf("predicate").forGetter(etq::c), eqd.b.e.fieldOf("entity").forGetter(etq::d)).apply($$0, etq::new)
   );

   @Override
   public eto b() {
      return etp.h;
   }

   @Override
   public Set<esw<?>> a() {
      return ImmutableSet.of(esz.f, this.c.a());
   }

   public boolean a(eqd $$0) {
      bsp $$1 = $$0.c(this.c.a());
      evm $$2 = $$0.c(esz.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static etn.a a(eqd.b $$0) {
      return a($$0, bu.a.a());
   }

   public static etn.a a(eqd.b $$0, bu.a $$1) {
      return () -> new etq(Optional.of($$1.b()), $$0);
   }

   public static etn.a a(eqd.b $$0, bu $$1) {
      return () -> new etq(Optional.of($$1), $$0);
   }

   public Optional<bu> c() {
      return this.b;
   }

   public eqd.b d() {
      return this.c;
   }
}
