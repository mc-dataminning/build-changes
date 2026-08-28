import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddi extends ddb implements dcz.a {
   public static final MapCodec<ddi> b = dcx.c.fieldOf("biome").xmap(ddi::new, $$0 -> $$0.c).stable();
   private final ji<dcx> c;

   public ddi(ji<dcx> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ji<dcx>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends ddb> a() {
      return b;
   }

   @Override
   public ji<dcx> getNoiseBiome(int $$0, int $$1, int $$2, ddg.f $$3) {
      return this.c;
   }

   @Override
   public ji<dcx> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<iz, ji<dcx>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ji<dcx>> $$5, azh $$6, boolean $$7, ddg.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new iz($$0, $$1, $$2), this.c) : Pair.of(new iz($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<iz, ji<dcx>> a(iz $$0, int $$1, int $$2, int $$3, Predicate<ji<dcx>> $$4, ddg.f $$5, dcb $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ji<dcx>> a(int $$0, int $$1, int $$2, int $$3, ddg.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
