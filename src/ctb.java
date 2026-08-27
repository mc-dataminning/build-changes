import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ctb extends csu implements css.a {
   public static final Codec<ctb> b = csq.c.fieldOf("biome").xmap(ctb::new, $$0 -> $$0.c).stable().codec();
   private final ib<csq> c;

   public ctb(ib<csq> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ib<csq>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends csu> a() {
      return b;
   }

   @Override
   public ib<csq> getNoiseBiome(int $$0, int $$1, int $$2, csz.f $$3) {
      return this.c;
   }

   @Override
   public ib<csq> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ht, ib<csq>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ib<csq>> $$5, ato $$6, boolean $$7, csz.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ht($$0, $$1, $$2), this.c) : Pair.of(new ht($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ht, ib<csq>> a(ht $$0, int $$1, int $$2, int $$3, Predicate<ib<csq>> $$4, csz.f $$5, crv $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ib<csq>> a(int $$0, int $$1, int $$2, int $$3, csz.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
