import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddg extends dcz implements dcx.a {
   public static final MapCodec<ddg> b = dcv.c.fieldOf("biome").xmap(ddg::new, $$0 -> $$0.c).stable();
   private final ji<dcv> c;

   public ddg(ji<dcv> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ji<dcv>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dcz> a() {
      return b;
   }

   @Override
   public ji<dcv> getNoiseBiome(int $$0, int $$1, int $$2, dde.f $$3) {
      return this.c;
   }

   @Override
   public ji<dcv> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<iz, ji<dcv>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ji<dcv>> $$5, azf $$6, boolean $$7, dde.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new iz($$0, $$1, $$2), this.c) : Pair.of(new iz($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<iz, ji<dcv>> a(iz $$0, int $$1, int $$2, int $$3, Predicate<ji<dcv>> $$4, dde.f $$5, dbz $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ji<dcv>> a(int $$0, int $$1, int $$2, int $$3, dde.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
