import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record euv(Optional<bk> b) implements evc {
   public static final MapCodec<euv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bk.a.optionalFieldOf("predicate").forGetter(euv::c)).apply($$0, euv::new));

   @Override
   public evd b() {
      return eve.m;
   }

   @Override
   public Set<euk<?>> a() {
      return ImmutableSet.of(eun.f, eun.c);
   }

   public boolean a(err $$0) {
      brk $$1 = $$0.c(eun.c);
      exc $$2 = $$0.c(eun.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static evc.a a(bk.a $$0) {
      return () -> new euv(Optional.of($$0.b()));
   }

   public Optional<bk> c() {
      return this.b;
   }
}
