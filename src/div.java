import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class div extends dio implements dim.a {
   public static final MapCodec<div> b = dik.c.fieldOf("biome").xmap(div::new, $$0 -> $$0.c).stable();
   private final jq<dik> c;

   public div(jq<dik> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jq<dik>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dio> a() {
      return b;
   }

   @Override
   public jq<dik> getNoiseBiome(int $$0, int $$1, int $$2, dit.f $$3) {
      return this.c;
   }

   @Override
   public jq<dik> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<jh, jq<dik>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jq<dik>> $$5, bam $$6, boolean $$7, dit.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new jh($$0, $$1, $$2), this.c) : Pair.of(new jh($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<jh, jq<dik>> a(jh $$0, int $$1, int $$2, int $$3, Predicate<jq<dik>> $$4, dit.f $$5, dhl $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jq<dik>> a(int $$0, int $$1, int $$2, int $$3, dit.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
