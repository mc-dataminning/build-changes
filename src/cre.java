import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cre extends cqx implements cqv.a {
   public static final Codec<cre> b = cqt.c.fieldOf("biome").xmap(cre::new, $$0 -> $$0.c).stable().codec();
   private final hg<cqt> c;

   public cre(hg<cqt> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<hg<cqt>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cqx> a() {
      return b;
   }

   @Override
   public hg<cqt> getNoiseBiome(int $$0, int $$1, int $$2, crc.f $$3) {
      return this.c;
   }

   @Override
   public hg<cqt> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<gw, hg<cqt>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<hg<cqt>> $$5, asc $$6, boolean $$7, crc.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new gw($$0, $$1, $$2), this.c) : Pair.of(new gw($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<gw, hg<cqt>> a(gw $$0, int $$1, int $$2, int $$3, Predicate<hg<cqt>> $$4, crc.f $$5, cpy $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<hg<cqt>> a(int $$0, int $$1, int $$2, int $$3, crc.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
