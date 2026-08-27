import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eux(Optional<bs> b, erp.b c) implements euu {
   public static final Codec<eux> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axu.a(bs.a, "predicate").forGetter(eux::c), erp.b.e.fieldOf("entity").forGetter(eux::d)).apply($$0, eux::new)
   );

   @Override
   public euv b() {
      return euw.h;
   }

   @Override
   public Set<eud<?>> a() {
      return ImmutableSet.of(eug.f, this.c.a());
   }

   public boolean a(erp $$0) {
      brv $$1 = $$0.c(this.c.a());
      ewu $$2 = $$0.c(eug.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static euu.a a(erp.b $$0) {
      return a($$0, bs.a.a());
   }

   public static euu.a a(erp.b $$0, bs.a $$1) {
      return () -> new eux(Optional.of($$1.b()), $$0);
   }

   public static euu.a a(erp.b $$0, bs $$1) {
      return () -> new eux(Optional.of($$1), $$0);
   }

   public Optional<bs> c() {
      return this.b;
   }

   public erp.b d() {
      return this.c;
   }
}
