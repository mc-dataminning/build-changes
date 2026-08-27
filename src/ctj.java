import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ctj extends ctc implements cta.a {
   public static final Codec<ctj> b = csy.c.fieldOf("biome").xmap(ctj::new, $$0 -> $$0.c).stable().codec();
   private final ib<csy> c;

   public ctj(ib<csy> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ib<csy>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends ctc> a() {
      return b;
   }

   @Override
   public ib<csy> getNoiseBiome(int $$0, int $$1, int $$2, cth.f $$3) {
      return this.c;
   }

   @Override
   public ib<csy> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ht, ib<csy>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ib<csy>> $$5, ats $$6, boolean $$7, cth.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ht($$0, $$1, $$2), this.c) : Pair.of(new ht($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ht, ib<csy>> a(ht $$0, int $$1, int $$2, int $$3, Predicate<ib<csy>> $$4, cth.f $$5, csd $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ib<csy>> a(int $$0, int $$1, int $$2, int $$3, cth.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
