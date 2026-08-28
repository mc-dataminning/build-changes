import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ety(Optional<bj> b) implements euf {
   public static final MapCodec<ety> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bj.a.optionalFieldOf("predicate").forGetter(ety::c)).apply($$0, ety::new));

   @Override
   public eug b() {
      return euh.m;
   }

   @Override
   public Set<etn<?>> a() {
      return ImmutableSet.of(etq.f, etq.c);
   }

   public boolean a(equ $$0) {
      bqz $$1 = $$0.c(etq.c);
      ewf $$2 = $$0.c(etq.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static euf.a a(bj.a $$0) {
      return () -> new ety(Optional.of($$0.b()));
   }

   public Optional<bj> c() {
      return this.b;
   }
}
