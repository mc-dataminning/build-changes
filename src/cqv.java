import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cqv extends cqo implements cqm.a {
   public static final Codec<cqv> b = cqk.c.fieldOf("biome").xmap(cqv::new, $$0 -> $$0.c).stable().codec();
   private final he<cqk> c;

   public cqv(he<cqk> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<he<cqk>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cqo> a() {
      return b;
   }

   @Override
   public he<cqk> getNoiseBiome(int $$0, int $$1, int $$2, cqt.f $$3) {
      return this.c;
   }

   @Override
   public he<cqk> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<gu, he<cqk>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<he<cqk>> $$5, aru $$6, boolean $$7, cqt.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new gu($$0, $$1, $$2), this.c) : Pair.of(new gu($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<gu, he<cqk>> a(gu $$0, int $$1, int $$2, int $$3, Predicate<he<cqk>> $$4, cqt.f $$5, cpp $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<he<cqk>> a(int $$0, int $$1, int $$2, int $$3, cqt.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
