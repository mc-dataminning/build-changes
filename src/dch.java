import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dch extends dca implements dby.a {
   public static final MapCodec<dch> b = dbw.c.fieldOf("biome").xmap(dch::new, $$0 -> $$0.c).stable();
   private final ix<dbw> c;

   public dch(ix<dbw> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ix<dbw>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dca> a() {
      return b;
   }

   @Override
   public ix<dbw> getNoiseBiome(int $$0, int $$1, int $$2, dcf.f $$3) {
      return this.c;
   }

   @Override
   public ix<dbw> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<io, ix<dbw>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ix<dbw>> $$5, ayk $$6, boolean $$7, dcf.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new io($$0, $$1, $$2), this.c) : Pair.of(new io($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<io, ix<dbw>> a(io $$0, int $$1, int $$2, int $$3, Predicate<ix<dbw>> $$4, dcf.f $$5, dba $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ix<dbw>> a(int $$0, int $$1, int $$2, int $$3, dcf.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
