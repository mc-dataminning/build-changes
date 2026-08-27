import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cqz extends cqs implements cqq.a {
   public static final Codec<cqz> b = cqo.c.fieldOf("biome").xmap(cqz::new, $$0 -> $$0.c).stable().codec();
   private final hg<cqo> c;

   public cqz(hg<cqo> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<hg<cqo>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cqs> a() {
      return b;
   }

   @Override
   public hg<cqo> getNoiseBiome(int $$0, int $$1, int $$2, cqx.f $$3) {
      return this.c;
   }

   @Override
   public hg<cqo> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<gw, hg<cqo>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<hg<cqo>> $$5, arx $$6, boolean $$7, cqx.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new gw($$0, $$1, $$2), this.c) : Pair.of(new gw($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<gw, hg<cqo>> a(gw $$0, int $$1, int $$2, int $$3, Predicate<hg<cqo>> $$4, cqx.f $$5, cpt $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<hg<cqo>> a(int $$0, int $$1, int $$2, int $$3, cqx.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
