import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ewh(Optional<bv> b, est.b c) implements ewe {
   public static final MapCodec<ewh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bv.a.optionalFieldOf("predicate").forGetter(ewh::c), est.b.e.fieldOf("entity").forGetter(ewh::d)).apply($$0, ewh::new)
   );

   @Override
   public ewf b() {
      return ewg.f;
   }

   @Override
   public Set<evm<?>> a() {
      return ImmutableSet.of(evp.f, this.c.a());
   }

   public boolean a(est $$0) {
      btj $$1 = $$0.c(this.c.a());
      eye $$2 = $$0.c(evp.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static ewe.a a(est.b $$0) {
      return a($$0, bv.a.a());
   }

   public static ewe.a a(est.b $$0, bv.a $$1) {
      return () -> new ewh(Optional.of($$1.b()), $$0);
   }

   public static ewe.a a(est.b $$0, bv $$1) {
      return () -> new ewh(Optional.of($$1), $$0);
   }

   public Optional<bv> c() {
      return this.b;
   }

   public est.b d() {
      return this.c;
   }
}
