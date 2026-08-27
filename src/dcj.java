import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dcj extends dcc implements dca.a {
   public static final MapCodec<dcj> b = dby.c.fieldOf("biome").xmap(dcj::new, $$0 -> $$0.c).stable();
   private final ix<dby> c;

   public dcj(ix<dby> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ix<dby>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dcc> a() {
      return b;
   }

   @Override
   public ix<dby> getNoiseBiome(int $$0, int $$1, int $$2, dch.f $$3) {
      return this.c;
   }

   @Override
   public ix<dby> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<io, ix<dby>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ix<dby>> $$5, aym $$6, boolean $$7, dch.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new io($$0, $$1, $$2), this.c) : Pair.of(new io($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<io, ix<dby>> a(io $$0, int $$1, int $$2, int $$3, Predicate<ix<dby>> $$4, dch.f $$5, dbc $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ix<dby>> a(int $$0, int $$1, int $$2, int $$3, dch.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
