import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record euk(Optional<bu> b, eqw.b c) implements euh {
   public static final MapCodec<euk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bu.a.optionalFieldOf("predicate").forGetter(euk::c), eqw.b.e.fieldOf("entity").forGetter(euk::d)).apply($$0, euk::new)
   );

   @Override
   public eui b() {
      return euj.f;
   }

   @Override
   public Set<etp<?>> a() {
      return ImmutableSet.of(ets.f, this.c.a());
   }

   public boolean a(eqw $$0) {
      bsh $$1 = $$0.c(this.c.a());
      ewh $$2 = $$0.c(ets.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static euh.a a(eqw.b $$0) {
      return a($$0, bu.a.a());
   }

   public static euh.a a(eqw.b $$0, bu.a $$1) {
      return () -> new euk(Optional.of($$1.b()), $$0);
   }

   public static euh.a a(eqw.b $$0, bu $$1) {
      return () -> new euk(Optional.of($$1), $$0);
   }

   public Optional<bu> c() {
      return this.b;
   }

   public eqw.b d() {
      return this.c;
   }
}
