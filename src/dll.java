import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dll extends dle implements dlc.a {
   public static final MapCodec<dll> b = dla.c.fieldOf("biome").xmap(dll::new, $$0 -> $$0.c).stable();
   private final jf<dla> c;

   public dll(jf<dla> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jf<dla>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dle> a() {
      return b;
   }

   @Override
   public jf<dla> getNoiseBiome(int $$0, int $$1, int $$2, dlj.f $$3) {
      return this.c;
   }

   @Override
   public jf<dla> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<iv, jf<dla>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jf<dla>> $$5, azx $$6, boolean $$7, dlj.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new iv($$0, $$1, $$2), this.c) : Pair.of(new iv($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<iv, jf<dla>> a(iv $$0, int $$1, int $$2, int $$3, Predicate<jf<dla>> $$4, dlj.f $$5, dka $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jf<dla>> a(int $$0, int $$1, int $$2, int $$3, dlj.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
