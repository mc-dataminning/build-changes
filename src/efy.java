import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efy(Optional<cb> b) implements efr {
   public static final Codec<efy> a = RecordCodecBuilder.create($$0 -> $$0.group(arh.a(cb.a, "predicate").forGetter(efy::c)).apply($$0, efy::new));

   @Override
   public efs b() {
      return eft.k;
   }

   @Override
   public Set<efa<?>> a() {
      return ImmutableSet.of(efd.i);
   }

   public boolean a(ecs $$0) {
      cjh $$1 = $$0.c(efd.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static efr.a a(cb.a $$0) {
      return () -> new efy(Optional.of($$0.b()));
   }

   public Optional<cb> c() {
      return this.b;
   }
}
