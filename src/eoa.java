import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record eoa(Optional<cc> b) implements ent {
   public static final Codec<eoa> a = RecordCodecBuilder.create($$0 -> $$0.group(awe.a(cc.a, "predicate").forGetter(eoa::c)).apply($$0, eoa::new));

   @Override
   public enu b() {
      return env.k;
   }

   @Override
   public Set<enc<?>> a() {
      return ImmutableSet.of(enf.i);
   }

   public boolean a(eku $$0) {
      cqk $$1 = $$0.c(enf.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static ent.a a(cc.a $$0) {
      return () -> new eoa(Optional.of($$0.b()));
   }

   public Optional<cc> c() {
      return this.b;
   }
}
