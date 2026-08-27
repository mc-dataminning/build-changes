import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cwx extends cwq implements cwo.a {
   public static final Codec<cwx> b = cwm.c.fieldOf("biome").xmap(cwx::new, $$0 -> $$0.c).stable().codec();
   private final ij<cwm> c;

   public cwx(ij<cwm> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ij<cwm>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cwq> a() {
      return b;
   }

   @Override
   public ij<cwm> getNoiseBiome(int $$0, int $$1, int $$2, cwv.f $$3) {
      return this.c;
   }

   @Override
   public ij<cwm> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<hz, ij<cwm>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ij<cwm>> $$5, awo $$6, boolean $$7, cwv.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new hz($$0, $$1, $$2), this.c) : Pair.of(new hz($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<hz, ij<cwm>> a(hz $$0, int $$1, int $$2, int $$3, Predicate<ij<cwm>> $$4, cwv.f $$5, cvq $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ij<cwm>> a(int $$0, int $$1, int $$2, int $$3, cwv.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
