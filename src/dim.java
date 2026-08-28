import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dim extends dif implements did.a {
   public static final MapCodec<dim> b = dib.c.fieldOf("biome").xmap(dim::new, $$0 -> $$0.c).stable();
   private final jq<dib> c;

   public dim(jq<dib> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jq<dib>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dif> a() {
      return b;
   }

   @Override
   public jq<dib> getNoiseBiome(int $$0, int $$1, int $$2, dik.f $$3) {
      return this.c;
   }

   @Override
   public jq<dib> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<jh, jq<dib>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jq<dib>> $$5, bac $$6, boolean $$7, dik.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new jh($$0, $$1, $$2), this.c) : Pair.of(new jh($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<jh, jq<dib>> a(jh $$0, int $$1, int $$2, int $$3, Predicate<jq<dib>> $$4, dik.f $$5, dhc $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jq<dib>> a(int $$0, int $$1, int $$2, int $$3, dik.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
