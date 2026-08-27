import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record enp(Optional<bg> b) implements env {
   public static final Codec<enp> a = RecordCodecBuilder.create($$0 -> $$0.group(awe.a(bg.a, "predicate").forGetter(enp::c)).apply($$0, enp::new));

   @Override
   public enw b() {
      return enx.n;
   }

   @Override
   public Set<ene<?>> a() {
      return ImmutableSet.of(enh.f, enh.c);
   }

   public boolean a(ekw $$0) {
      bnw $$1 = $$0.c(enh.c);
      ept $$2 = $$0.c(enh.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static env.a a(bg.a $$0) {
      return () -> new enp(Optional.of($$0.b()));
   }

   public Optional<bg> c() {
      return this.b;
   }
}
