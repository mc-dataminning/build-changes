import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class din extends dig implements die.a {
   public static final MapCodec<din> b = dic.c.fieldOf("biome").xmap(din::new, $$0 -> $$0.c).stable();
   private final jq<dic> c;

   public din(jq<dic> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jq<dic>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dig> a() {
      return b;
   }

   @Override
   public jq<dic> getNoiseBiome(int $$0, int $$1, int $$2, dil.f $$3) {
      return this.c;
   }

   @Override
   public jq<dic> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<jh, jq<dic>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jq<dic>> $$5, bam $$6, boolean $$7, dil.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new jh($$0, $$1, $$2), this.c) : Pair.of(new jh($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<jh, jq<dic>> a(jh $$0, int $$1, int $$2, int $$3, Predicate<jq<dic>> $$4, dil.f $$5, dhd $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jq<dic>> a(int $$0, int $$1, int $$2, int $$3, dil.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
