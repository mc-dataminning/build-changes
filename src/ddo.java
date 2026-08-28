import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddo extends ddh implements ddf.a {
   public static final MapCodec<ddo> b = ddd.c.fieldOf("biome").xmap(ddo::new, $$0 -> $$0.c).stable();
   private final jj<ddd> c;

   public ddo(jj<ddd> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jj<ddd>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends ddh> a() {
      return b;
   }

   @Override
   public jj<ddd> getNoiseBiome(int $$0, int $$1, int $$2, ddm.f $$3) {
      return this.c;
   }

   @Override
   public jj<ddd> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ja, jj<ddd>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jj<ddd>> $$5, aym $$6, boolean $$7, ddm.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ja($$0, $$1, $$2), this.c) : Pair.of(new ja($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ja, jj<ddd>> a(ja $$0, int $$1, int $$2, int $$3, Predicate<jj<ddd>> $$4, ddm.f $$5, dcg $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jj<ddd>> a(int $$0, int $$1, int $$2, int $$3, ddm.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
