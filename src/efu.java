import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efu(Optional<bq> b, ecs.b c) implements efr {
   public static final Codec<efu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(arh.a(bq.a, "predicate").forGetter(efu::c), ecs.b.e.fieldOf("entity").forGetter(efu::d)).apply($$0, efu::new)
   );

   @Override
   public efs b() {
      return eft.g;
   }

   @Override
   public Set<efa<?>> a() {
      return ImmutableSet.of(efd.f, this.c.a());
   }

   public boolean a(ecs $$0) {
      bis $$1 = $$0.c(this.c.a());
      ehp $$2 = $$0.c(efd.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static efr.a a(ecs.b $$0) {
      return a($$0, bq.a.a());
   }

   public static efr.a a(ecs.b $$0, bq.a $$1) {
      return () -> new efu(Optional.of($$1.b()), $$0);
   }

   public static efr.a a(ecs.b $$0, bq $$1) {
      return () -> new efu(Optional.of($$1), $$0);
   }

   public Optional<bq> c() {
      return this.b;
   }

   public ecs.b d() {
      return this.c;
   }
}
