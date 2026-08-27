import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efd(Optional<bf> b) implements efj {
   public static final Codec<efd> a = RecordCodecBuilder.create($$0 -> $$0.group(arj.a(bf.a, "predicate").forGetter(efd::c)).apply($$0, efd::new));

   @Override
   public efk b() {
      return efl.n;
   }

   @Override
   public Set<ees<?>> a() {
      return ImmutableSet.of(eev.f, eev.c);
   }

   public boolean a(eck $$0) {
      bhu $$1 = $$0.c(eev.c);
      ehh $$2 = $$0.c(eev.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static efj.a a(bf.a $$0) {
      return () -> new efd(Optional.of($$0.b()));
   }

   public Optional<bf> c() {
      return this.b;
   }
}
