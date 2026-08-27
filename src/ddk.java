import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddk extends ddd implements ddb.a {
   public static final Codec<ddk> b = dcz.c.fieldOf("biome").xmap(ddk::new, $$0 -> $$0.c).stable().codec();
   private final ja<dcz> c;

   public ddk(ja<dcz> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ja<dcz>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends ddd> a() {
      return b;
   }

   @Override
   public ja<dcz> getNoiseBiome(int $$0, int $$1, int $$2, ddi.f $$3) {
      return this.c;
   }

   @Override
   public ja<dcz> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ir, ja<dcz>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ja<dcz>> $$5, ayt $$6, boolean $$7, ddi.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ir($$0, $$1, $$2), this.c) : Pair.of(new ir($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ir, ja<dcz>> a(ir $$0, int $$1, int $$2, int $$3, Predicate<ja<dcz>> $$4, ddi.f $$5, dcd $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ja<dcz>> a(int $$0, int $$1, int $$2, int $$3, ddi.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
