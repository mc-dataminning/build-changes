import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dgn extends dgg implements dge.a {
   public static final MapCodec<dgn> b = dgc.c.fieldOf("biome").xmap(dgn::new, $$0 -> $$0.c).stable();
   private final jq<dgc> c;

   public dgn(jq<dgc> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jq<dgc>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dgg> a() {
      return b;
   }

   @Override
   public jq<dgc> getNoiseBiome(int $$0, int $$1, int $$2, dgl.f $$3) {
      return this.c;
   }

   @Override
   public jq<dgc> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<jh, jq<dgc>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jq<dgc>> $$5, azs $$6, boolean $$7, dgl.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new jh($$0, $$1, $$2), this.c) : Pair.of(new jh($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<jh, jq<dgc>> a(jh $$0, int $$1, int $$2, int $$3, Predicate<jq<dgc>> $$4, dgl.f $$5, dfe $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jq<dgc>> a(int $$0, int $$1, int $$2, int $$3, dgl.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
