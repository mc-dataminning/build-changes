import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ero(Optional<cg> b) implements erh {
   public static final Codec<ero> a = RecordCodecBuilder.create($$0 -> $$0.group(axe.a(cg.a, "predicate").forGetter(ero::c)).apply($$0, ero::new));

   @Override
   public eri b() {
      return erj.k;
   }

   @Override
   public Set<eqq<?>> a() {
      return ImmutableSet.of(eqt.i);
   }

   public boolean a(eoa $$0) {
      csd $$1 = $$0.c(eqt.i);
      return $$1 != null && (this.b.isEmpty() || this.b.get().a($$1));
   }

   public static erh.a a(cg.a $$0) {
      return () -> new ero(Optional.of($$0.b()));
   }

   public Optional<cg> c() {
      return this.b;
   }
}
