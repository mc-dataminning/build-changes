import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efm(Optional<bq> b, eck.b c) implements efj {
   public static final Codec<efm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arj.a(bq.a, "predicate").forGetter(efm::c), eck.b.e.fieldOf("entity").forGetter(efm::d)).apply($$0, efm::new)
   );

   @Override
   public efk b() {
      return efl.g;
   }

   @Override
   public Set<ees<?>> a() {
      return ImmutableSet.of(eev.f, this.c.a());
   }

   public boolean a(eck $$0) {
      biw $$1 = $$0.c(this.c.a());
      ehh $$2 = $$0.c(eev.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static efj.a a(eck.b $$0) {
      return a($$0, bq.a.a());
   }

   public static efj.a a(eck.b $$0, bq.a $$1) {
      return () -> new efm(Optional.of($$1.b()), $$0);
   }

   public static efj.a a(eck.b $$0, bq $$1) {
      return () -> new efm(Optional.of($$1), $$0);
   }

   public Optional<bq> c() {
      return this.b;
   }

   public eck.b d() {
      return this.c;
   }
}
