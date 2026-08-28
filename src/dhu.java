import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhu extends dhn implements dhl.a {
   public static final MapCodec<dhu> b = dhj.c.fieldOf("biome").xmap(dhu::new, $$0 -> $$0.c).stable();
   private final jr<dhj> c;

   public dhu(jr<dhj> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jr<dhj>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dhn> a() {
      return b;
   }

   @Override
   public jr<dhj> getNoiseBiome(int $$0, int $$1, int $$2, dhs.f $$3) {
      return this.c;
   }

   @Override
   public jr<dhj> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ji, jr<dhj>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jr<dhj>> $$5, azh $$6, boolean $$7, dhs.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ji($$0, $$1, $$2), this.c) : Pair.of(new ji($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ji, jr<dhj>> a(ji $$0, int $$1, int $$2, int $$3, Predicate<jr<dhj>> $$4, dhs.f $$5, dgk $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jr<dhj>> a(int $$0, int $$1, int $$2, int $$3, dhs.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
