import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cxb extends cwu implements cws.a {
   public static final Codec<cxb> b = cwq.c.fieldOf("biome").xmap(cxb::new, $$0 -> $$0.c).stable().codec();
   private final ij<cwq> c;

   public cxb(ij<cwq> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ij<cwq>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cwu> a() {
      return b;
   }

   @Override
   public ij<cwq> getNoiseBiome(int $$0, int $$1, int $$2, cwz.f $$3) {
      return this.c;
   }

   @Override
   public ij<cwq> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<hz, ij<cwq>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ij<cwq>> $$5, awp $$6, boolean $$7, cwz.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new hz($$0, $$1, $$2), this.c) : Pair.of(new hz($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<hz, ij<cwq>> a(hz $$0, int $$1, int $$2, int $$3, Predicate<ij<cwq>> $$4, cwz.f $$5, cvu $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ij<cwq>> a(int $$0, int $$1, int $$2, int $$3, cwz.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
