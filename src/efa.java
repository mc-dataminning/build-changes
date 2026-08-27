import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efa(Optional<bd> b) implements efg {
   public static final Codec<efa> a = RecordCodecBuilder.create($$0 -> $$0.group(aqy.a(bd.a, "predicate").forGetter(efa::c)).apply($$0, efa::new));

   @Override
   public efh b() {
      return efi.n;
   }

   @Override
   public Set<eep<?>> a() {
      return ImmutableSet.of(ees.f, ees.c);
   }

   public boolean a(ech $$0) {
      bhg $$1 = $$0.c(ees.c);
      ehe $$2 = $$0.c(ees.f);
      return $$2 != null && $$1 != null ? this.b.isEmpty() || this.b.get().a($$0.d(), $$2, $$1) : false;
   }

   public static efg.a a(bd.a $$0) {
      return () -> new efa($$0.b());
   }

   public Optional<bd> c() {
      return this.b;
   }
}
