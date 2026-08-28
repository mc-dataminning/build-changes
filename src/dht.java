import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dht extends dhm implements dhk.a {
   public static final MapCodec<dht> b = dhi.c.fieldOf("biome").xmap(dht::new, $$0 -> $$0.c).stable();
   private final jr<dhi> c;

   public dht(jr<dhi> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jr<dhi>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dhm> a() {
      return b;
   }

   @Override
   public jr<dhi> getNoiseBiome(int $$0, int $$1, int $$2, dhr.f $$3) {
      return this.c;
   }

   @Override
   public jr<dhi> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ji, jr<dhi>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jr<dhi>> $$5, azg $$6, boolean $$7, dhr.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ji($$0, $$1, $$2), this.c) : Pair.of(new ji($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ji, jr<dhi>> a(ji $$0, int $$1, int $$2, int $$3, Predicate<jr<dhi>> $$4, dhr.f $$5, dgj $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jr<dhi>> a(int $$0, int $$1, int $$2, int $$3, dhr.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
