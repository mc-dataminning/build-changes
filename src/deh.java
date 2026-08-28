import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class deh extends dea implements ddy.a {
   public static final MapCodec<deh> b = ddw.c.fieldOf("biome").xmap(deh::new, $$0 -> $$0.c).stable();
   private final jm<ddw> c;

   public deh(jm<ddw> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jm<ddw>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dea> a() {
      return b;
   }

   @Override
   public jm<ddw> getNoiseBiome(int $$0, int $$1, int $$2, def.f $$3) {
      return this.c;
   }

   @Override
   public jm<ddw> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<jd, jm<ddw>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jm<ddw>> $$5, ayw $$6, boolean $$7, def.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new jd($$0, $$1, $$2), this.c) : Pair.of(new jd($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<jd, jm<ddw>> a(jd $$0, int $$1, int $$2, int $$3, Predicate<jm<ddw>> $$4, def.f $$5, dcz $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jm<ddw>> a(int $$0, int $$1, int $$2, int $$3, def.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
