import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efn(Optional<bz> b) implements efg {
   public static final Codec<efn> a = RecordCodecBuilder.create($$0 -> $$0.group(aqy.a(bz.a, "predicate").forGetter(efn::c)).apply($$0, efn::new));

   @Override
   public efh b() {
      return efi.k;
   }

   @Override
   public Set<eep<?>> a() {
      return ImmutableSet.of(ees.i);
   }

   public boolean a(ech $$0) {
      ciy $$1 = $$0.c(ees.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static efg.a a(bz.a $$0) {
      return () -> new efn($$0.b());
   }

   public Optional<bz> c() {
      return this.b;
   }
}
