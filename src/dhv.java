import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhv extends dho implements dhm.a {
   public static final MapCodec<dhv> b = dhk.c.fieldOf("biome").xmap(dhv::new, $$0 -> $$0.c).stable();
   private final jr<dhk> c;

   public dhv(jr<dhk> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jr<dhk>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dho> a() {
      return b;
   }

   @Override
   public jr<dhk> getNoiseBiome(int $$0, int $$1, int $$2, dht.f $$3) {
      return this.c;
   }

   @Override
   public jr<dhk> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ji, jr<dhk>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jr<dhk>> $$5, azh $$6, boolean $$7, dht.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ji($$0, $$1, $$2), this.c) : Pair.of(new ji($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ji, jr<dhk>> a(ji $$0, int $$1, int $$2, int $$3, Predicate<jr<dhk>> $$4, dht.f $$5, dgl $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jr<dhk>> a(int $$0, int $$1, int $$2, int $$3, dht.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
