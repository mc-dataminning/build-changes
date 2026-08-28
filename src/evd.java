import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record evd(Optional<bv> b, erp.b c) implements eva {
   public static final MapCodec<evd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bv.a.optionalFieldOf("predicate").forGetter(evd::c), erp.b.e.fieldOf("entity").forGetter(evd::d)).apply($$0, evd::new)
   );

   @Override
   public evb b() {
      return evc.f;
   }

   @Override
   public Set<eui<?>> a() {
      return ImmutableSet.of(eul.f, this.c.a());
   }

   public boolean a(erp $$0) {
      bsr $$1 = $$0.c(this.c.a());
      exa $$2 = $$0.c(eul.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static eva.a a(erp.b $$0) {
      return a($$0, bv.a.a());
   }

   public static eva.a a(erp.b $$0, bv.a $$1) {
      return () -> new evd(Optional.of($$1.b()), $$0);
   }

   public static eva.a a(erp.b $$0, bv $$1) {
      return () -> new evd(Optional.of($$1), $$0);
   }

   public Optional<bv> c() {
      return this.b;
   }

   public erp.b d() {
      return this.c;
   }
}
