import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddj extends ddc implements dda.a {
   public static final MapCodec<ddj> b = dcy.c.fieldOf("biome").xmap(ddj::new, $$0 -> $$0.c).stable();
   private final ji<dcy> c;

   public ddj(ji<dcy> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ji<dcy>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends ddc> a() {
      return b;
   }

   @Override
   public ji<dcy> getNoiseBiome(int $$0, int $$1, int $$2, ddh.f $$3) {
      return this.c;
   }

   @Override
   public ji<dcy> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<iz, ji<dcy>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ji<dcy>> $$5, azh $$6, boolean $$7, ddh.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new iz($$0, $$1, $$2), this.c) : Pair.of(new iz($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<iz, ji<dcy>> a(iz $$0, int $$1, int $$2, int $$3, Predicate<ji<dcy>> $$4, ddh.f $$5, dcc $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ji<dcy>> a(int $$0, int $$1, int $$2, int $$3, ddh.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
