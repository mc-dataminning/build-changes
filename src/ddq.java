import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddq extends ddj implements ddh.a {
   public static final MapCodec<ddq> b = ddf.c.fieldOf("biome").xmap(ddq::new, $$0 -> $$0.c).stable();
   private final jj<ddf> c;

   public ddq(jj<ddf> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jj<ddf>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends ddj> a() {
      return b;
   }

   @Override
   public jj<ddf> getNoiseBiome(int $$0, int $$1, int $$2, ddo.f $$3) {
      return this.c;
   }

   @Override
   public jj<ddf> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ja, jj<ddf>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jj<ddf>> $$5, ayo $$6, boolean $$7, ddo.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ja($$0, $$1, $$2), this.c) : Pair.of(new ja($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ja, jj<ddf>> a(ja $$0, int $$1, int $$2, int $$3, Predicate<jj<ddf>> $$4, ddo.f $$5, dci $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jj<ddf>> a(int $$0, int $$1, int $$2, int $$3, ddo.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
