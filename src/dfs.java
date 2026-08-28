import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dfs extends dfl implements dfj.a {
   public static final MapCodec<dfs> b = dfh.c.fieldOf("biome").xmap(dfs::new, $$0 -> $$0.c).stable();
   private final jn<dfh> c;

   public dfs(jn<dfh> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jn<dfh>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dfl> a() {
      return b;
   }

   @Override
   public jn<dfh> getNoiseBiome(int $$0, int $$1, int $$2, dfq.f $$3) {
      return this.c;
   }

   @Override
   public jn<dfh> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<je, jn<dfh>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jn<dfh>> $$5, azl $$6, boolean $$7, dfq.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new je($$0, $$1, $$2), this.c) : Pair.of(new je($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<je, jn<dfh>> a(je $$0, int $$1, int $$2, int $$3, Predicate<jn<dfh>> $$4, dfq.f $$5, dej $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jn<dfh>> a(int $$0, int $$1, int $$2, int $$3, dfq.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
