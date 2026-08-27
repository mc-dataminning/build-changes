import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record erk(Optional<br> b, eoa.b c) implements erh {
   public static final Codec<erk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.a(br.a, "predicate").forGetter(erk::c), eoa.b.e.fieldOf("entity").forGetter(erk::d)).apply($$0, erk::new)
   );

   @Override
   public eri b() {
      return erj.g;
   }

   @Override
   public Set<eqq<?>> a() {
      return ImmutableSet.of(eqt.f, this.c.a());
   }

   public boolean a(eoa $$0) {
      bql $$1 = $$0.c(this.c.a());
      etf $$2 = $$0.c(eqt.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static erh.a a(eoa.b $$0) {
      return a($$0, br.a.a());
   }

   public static erh.a a(eoa.b $$0, br.a $$1) {
      return () -> new erk(Optional.of($$1.b()), $$0);
   }

   public static erh.a a(eoa.b $$0, br $$1) {
      return () -> new erk(Optional.of($$1), $$0);
   }

   public Optional<br> c() {
      return this.b;
   }

   public eoa.b d() {
      return this.c;
   }
}
