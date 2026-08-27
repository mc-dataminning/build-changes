import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cqt extends cqm implements cqk.a {
   public static final Codec<cqt> b = cqi.c.fieldOf("biome").xmap(cqt::new, $$0 -> $$0.c).stable().codec();
   private final hf<cqi> c;

   public cqt(hf<cqi> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<hf<cqi>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cqm> a() {
      return b;
   }

   @Override
   public hf<cqi> getNoiseBiome(int $$0, int $$1, int $$2, cqr.f $$3) {
      return this.c;
   }

   @Override
   public hf<cqi> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<gv, hf<cqi>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<hf<cqi>> $$5, art $$6, boolean $$7, cqr.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new gv($$0, $$1, $$2), this.c) : Pair.of(new gv($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<gv, hf<cqi>> a(gv $$0, int $$1, int $$2, int $$3, Predicate<hf<cqi>> $$4, cqr.f $$5, cpn $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<hf<cqi>> a(int $$0, int $$1, int $$2, int $$3, cqr.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
