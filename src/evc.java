import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record evc(Optional<ci> b) implements euu {
   public static final Codec<evc> a = RecordCodecBuilder.create($$0 -> $$0.group(axu.a(ci.a, "predicate").forGetter(evc::c)).apply($$0, evc::new));

   @Override
   public euv b() {
      return euw.l;
   }

   @Override
   public Set<eud<?>> a() {
      return ImmutableSet.of(eug.i);
   }

   public boolean a(erp $$0) {
      cuh $$1 = $$0.c(eug.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static euu.a a(ci.a $$0) {
      return () -> new evc(Optional.of($$0.b()));
   }

   public Optional<ci> c() {
      return this.b;
   }
}
