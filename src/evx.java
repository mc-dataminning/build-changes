import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record evx(Optional<bk> b) implements ewe {
   public static final MapCodec<evx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bk.a.optionalFieldOf("predicate").forGetter(evx::c)).apply($$0, evx::new));

   @Override
   public ewf b() {
      return ewg.m;
   }

   @Override
   public Set<evm<?>> a() {
      return ImmutableSet.of(evp.f, evp.c);
   }

   public boolean a(est $$0) {
      bsb $$1 = $$0.c(evp.c);
      eye $$2 = $$0.c(evp.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ewe.a a(bk.a $$0) {
      return () -> new evx(Optional.of($$0.b()));
   }

   public Optional<bk> c() {
      return this.b;
   }
}
