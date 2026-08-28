import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dfe extends dex implements dev.a {
   public static final MapCodec<dfe> b = det.c.fieldOf("biome").xmap(dfe::new, $$0 -> $$0.c).stable();
   private final jn<det> c;

   public dfe(jn<det> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jn<det>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dex> a() {
      return b;
   }

   @Override
   public jn<det> getNoiseBiome(int $$0, int $$1, int $$2, dfc.f $$3) {
      return this.c;
   }

   @Override
   public jn<det> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<je, jn<det>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jn<det>> $$5, azk $$6, boolean $$7, dfc.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new je($$0, $$1, $$2), this.c) : Pair.of(new je($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<je, jn<det>> a(je $$0, int $$1, int $$2, int $$3, Predicate<jn<det>> $$4, dfc.f $$5, ddv $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jn<det>> a(int $$0, int $$1, int $$2, int $$3, dfc.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
