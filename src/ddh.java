import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddh extends dda implements dcy.a {
   public static final MapCodec<ddh> b = dcw.c.fieldOf("biome").xmap(ddh::new, $$0 -> $$0.c).stable();
   private final ji<dcw> c;

   public ddh(ji<dcw> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ji<dcw>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dda> a() {
      return b;
   }

   @Override
   public ji<dcw> getNoiseBiome(int $$0, int $$1, int $$2, ddf.f $$3) {
      return this.c;
   }

   @Override
   public ji<dcw> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<iz, ji<dcw>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ji<dcw>> $$5, azg $$6, boolean $$7, ddf.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new iz($$0, $$1, $$2), this.c) : Pair.of(new iz($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<iz, ji<dcw>> a(iz $$0, int $$1, int $$2, int $$3, Predicate<ji<dcw>> $$4, ddf.f $$5, dca $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ji<dcw>> a(int $$0, int $$1, int $$2, int $$3, ddf.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
