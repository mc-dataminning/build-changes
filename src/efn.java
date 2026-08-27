import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efn(Optional<bq> b, ecl.b c) implements efk {
   public static final Codec<efn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arb.a(bq.a, "predicate").forGetter(efn::c), ecl.b.e.fieldOf("entity").forGetter(efn::d)).apply($$0, efn::new)
   );

   @Override
   public efl b() {
      return efm.g;
   }

   @Override
   public Set<eet<?>> a() {
      return ImmutableSet.of(eew.f, this.c.a());
   }

   public boolean a(ecl $$0) {
      bil $$1 = $$0.c(this.c.a());
      ehi $$2 = $$0.c(eew.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static efk.a a(ecl.b $$0) {
      return a($$0, bq.a.a());
   }

   public static efk.a a(ecl.b $$0, bq.a $$1) {
      return () -> new efn(Optional.of($$1.b()), $$0);
   }

   public static efk.a a(ecl.b $$0, bq $$1) {
      return () -> new efn(Optional.of($$1), $$0);
   }

   public Optional<bq> c() {
      return this.b;
   }

   public ecl.b d() {
      return this.c;
   }
}
