import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dfv extends dfo implements dfm.a {
   public static final MapCodec<dfv> b = dfk.c.fieldOf("biome").xmap(dfv::new, $$0 -> $$0.c).stable();
   private final jo<dfk> c;

   public dfv(jo<dfk> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jo<dfk>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dfo> a() {
      return b;
   }

   @Override
   public jo<dfk> getNoiseBiome(int $$0, int $$1, int $$2, dft.f $$3) {
      return this.c;
   }

   @Override
   public jo<dfk> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<jf, jo<dfk>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jo<dfk>> $$5, azn $$6, boolean $$7, dft.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new jf($$0, $$1, $$2), this.c) : Pair.of(new jf($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<jf, jo<dfk>> a(jf $$0, int $$1, int $$2, int $$3, Predicate<jo<dfk>> $$4, dft.f $$5, dem $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jo<dfk>> a(int $$0, int $$1, int $$2, int $$3, dft.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
