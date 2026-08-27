import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class crg extends cqz implements cqx.a {
   public static final Codec<crg> b = cqv.c.fieldOf("biome").xmap(crg::new, $$0 -> $$0.c).stable().codec();
   private final hg<cqv> c;

   public crg(hg<cqv> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<hg<cqv>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cqz> a() {
      return b;
   }

   @Override
   public hg<cqv> getNoiseBiome(int $$0, int $$1, int $$2, cre.f $$3) {
      return this.c;
   }

   @Override
   public hg<cqv> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<gw, hg<cqv>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<hg<cqv>> $$5, ase $$6, boolean $$7, cre.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new gw($$0, $$1, $$2), this.c) : Pair.of(new gw($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<gw, hg<cqv>> a(gw $$0, int $$1, int $$2, int $$3, Predicate<hg<cqv>> $$4, cre.f $$5, cqa $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<hg<cqv>> a(int $$0, int $$1, int $$2, int $$3, cre.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
