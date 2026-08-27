import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record euo(Optional<bh> b) implements euu {
   public static final Codec<euo> a = RecordCodecBuilder.create($$0 -> $$0.group(axu.a(bh.a, "predicate").forGetter(euo::c)).apply($$0, euo::new));

   @Override
   public euv b() {
      return euw.o;
   }

   @Override
   public Set<eud<?>> a() {
      return ImmutableSet.of(eug.f, eug.c);
   }

   public boolean a(erp $$0) {
      bqt $$1 = $$0.c(eug.c);
      ewu $$2 = $$0.c(eug.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static euu.a a(bh.a $$0) {
      return () -> new euo(Optional.of($$0.b()));
   }

   public Optional<bh> c() {
      return this.b;
   }
}
