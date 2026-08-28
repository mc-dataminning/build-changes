import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dkv extends dko implements dkm.a {
   public static final MapCodec<dkv> b = dkk.c.fieldOf("biome").xmap(dkv::new, $$0 -> $$0.c).stable();
   private final jf<dkk> c;

   public dkv(jf<dkk> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jf<dkk>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dko> a() {
      return b;
   }

   @Override
   public jf<dkk> getNoiseBiome(int $$0, int $$1, int $$2, dkt.f $$3) {
      return this.c;
   }

   @Override
   public jf<dkk> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<iv, jf<dkk>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jf<dkk>> $$5, azv $$6, boolean $$7, dkt.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new iv($$0, $$1, $$2), this.c) : Pair.of(new iv($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<iv, jf<dkk>> a(iv $$0, int $$1, int $$2, int $$3, Predicate<jf<dkk>> $$4, dkt.f $$5, djk $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jf<dkk>> a(int $$0, int $$1, int $$2, int $$3, dkt.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
