import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddd extends dcw implements dcu.a {
   public static final MapCodec<ddd> b = dcs.c.fieldOf("biome").xmap(ddd::new, $$0 -> $$0.c).stable();
   private final ji<dcs> c;

   public ddd(ji<dcs> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ji<dcs>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dcw> a() {
      return b;
   }

   @Override
   public ji<dcs> getNoiseBiome(int $$0, int $$1, int $$2, ddb.f $$3) {
      return this.c;
   }

   @Override
   public ji<dcs> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<iz, ji<dcs>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ji<dcs>> $$5, azc $$6, boolean $$7, ddb.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new iz($$0, $$1, $$2), this.c) : Pair.of(new iz($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<iz, ji<dcs>> a(iz $$0, int $$1, int $$2, int $$3, Predicate<ji<dcs>> $$4, ddb.f $$5, dbw $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ji<dcs>> a(int $$0, int $$1, int $$2, int $$3, ddb.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
