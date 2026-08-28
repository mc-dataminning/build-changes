import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record evf(Optional<bv> b, err.b c) implements evc {
   public static final MapCodec<evf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bv.a.optionalFieldOf("predicate").forGetter(evf::c), err.b.e.fieldOf("entity").forGetter(evf::d)).apply($$0, evf::new)
   );

   @Override
   public evd b() {
      return eve.f;
   }

   @Override
   public Set<euk<?>> a() {
      return ImmutableSet.of(eun.f, this.c.a());
   }

   public boolean a(err $$0) {
      bsr $$1 = $$0.c(this.c.a());
      exc $$2 = $$0.c(eun.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static evc.a a(err.b $$0) {
      return a($$0, bv.a.a());
   }

   public static evc.a a(err.b $$0, bv.a $$1) {
      return () -> new evf(Optional.of($$1.b()), $$0);
   }

   public static evc.a a(err.b $$0, bv $$1) {
      return () -> new evf(Optional.of($$1), $$0);
   }

   public Optional<bv> c() {
      return this.b;
   }

   public err.b d() {
      return this.c;
   }
}
