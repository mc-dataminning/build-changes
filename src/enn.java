import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record enn(Optional<bg> b) implements ent {
   public static final Codec<enn> a = RecordCodecBuilder.create($$0 -> $$0.group(awe.a(bg.a, "predicate").forGetter(enn::c)).apply($$0, enn::new));

   @Override
   public enu b() {
      return env.n;
   }

   @Override
   public Set<enc<?>> a() {
      return ImmutableSet.of(enf.f, enf.c);
   }

   public boolean a(eku $$0) {
      bnv $$1 = $$0.c(enf.c);
      epr $$2 = $$0.c(enf.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static ent.a a(bg.a $$0) {
      return () -> new enn(Optional.of($$0.b()));
   }

   public Optional<bg> c() {
      return this.b;
   }
}
