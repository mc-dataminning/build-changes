import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dko extends dkh implements dkf.a {
   public static final MapCodec<dko> b = dkd.c.fieldOf("biome").xmap(dko::new, $$0 -> $$0.c).stable();
   private final je<dkd> c;

   public dko(je<dkd> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<je<dkd>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dkh> a() {
      return b;
   }

   @Override
   public je<dkd> getNoiseBiome(int $$0, int $$1, int $$2, dkm.f $$3) {
      return this.c;
   }

   @Override
   public je<dkd> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<iu, je<dkd>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<je<dkd>> $$5, azv $$6, boolean $$7, dkm.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new iu($$0, $$1, $$2), this.c) : Pair.of(new iu($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<iu, je<dkd>> a(iu $$0, int $$1, int $$2, int $$3, Predicate<je<dkd>> $$4, dkm.f $$5, djd $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<je<dkd>> a(int $$0, int $$1, int $$2, int $$3, dkm.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
