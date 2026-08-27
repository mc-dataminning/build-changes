import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eoc(Optional<cc> b) implements env {
   public static final Codec<eoc> a = RecordCodecBuilder.create($$0 -> $$0.group(awe.a(cc.a, "predicate").forGetter(eoc::c)).apply($$0, eoc::new));

   @Override
   public enw b() {
      return enx.k;
   }

   @Override
   public Set<ene<?>> a() {
      return ImmutableSet.of(enh.i);
   }

   public boolean a(ekw $$0) {
      cqm $$1 = $$0.c(enh.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static env.a a(cc.a $$0) {
      return () -> new eoc(Optional.of($$0.b()));
   }

   public Optional<cc> c() {
      return this.b;
   }
}
