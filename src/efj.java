import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efj(Optional<bo> b, ech.b c) implements efg {
   public static final Codec<efj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.a(bo.a, "predicate").forGetter(efj::c), ech.b.e.fieldOf("entity").forGetter(efj::d)).apply($$0, efj::new)
   );

   @Override
   public efh b() {
      return efi.g;
   }

   @Override
   public Set<eep<?>> a() {
      return ImmutableSet.of(ees.f, this.c.a());
   }

   public boolean a(ech $$0) {
      bii $$1 = $$0.c(this.c.a());
      ehe $$2 = $$0.c(ees.f);
      return this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1);
   }

   public static efg.a a(ech.b $$0) {
      return a($$0, bo.a.a());
   }

   public static efg.a a(ech.b $$0, bo.a $$1) {
      return () -> new efj($$1.b(), $$0);
   }

   public static efg.a a(ech.b $$0, bo $$1) {
      return () -> new efj(Optional.of($$1), $$0);
   }

   public Optional<bo> c() {
      return this.b;
   }

   public ech.b d() {
      return this.c;
   }
}
