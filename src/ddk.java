import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddk extends ddd implements ddb.a {
   public static final MapCodec<ddk> b = dcz.c.fieldOf("biome").xmap(ddk::new, $$0 -> $$0.c).stable();
   private final ji<dcz> c;

   public ddk(ji<dcz> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ji<dcz>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends ddd> a() {
      return b;
   }

   @Override
   public ji<dcz> getNoiseBiome(int $$0, int $$1, int $$2, ddi.f $$3) {
      return this.c;
   }

   @Override
   public ji<dcz> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<iz, ji<dcz>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ji<dcz>> $$5, azh $$6, boolean $$7, ddi.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new iz($$0, $$1, $$2), this.c) : Pair.of(new iz($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<iz, ji<dcz>> a(iz $$0, int $$1, int $$2, int $$3, Predicate<ji<dcz>> $$4, ddi.f $$5, dcd $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ji<dcz>> a(int $$0, int $$1, int $$2, int $$3, ddi.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
