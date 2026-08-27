import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efl(Optional<bf> b) implements efr {
   public static final Codec<efl> a = RecordCodecBuilder.create($$0 -> $$0.group(arh.a(bf.a, "predicate").forGetter(efl::c)).apply($$0, efl::new));

   @Override
   public efs b() {
      return eft.n;
   }

   @Override
   public Set<efa<?>> a() {
      return ImmutableSet.of(efd.f, efd.c);
   }

   public boolean a(ecs $$0) {
      bhq $$1 = $$0.c(efd.c);
      ehp $$2 = $$0.c(efd.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static efr.a a(bf.a $$0) {
      return () -> new efl(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
