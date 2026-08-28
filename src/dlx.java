import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dlx extends dlq implements dlo.a {
   public static final MapCodec<dlx> b = dlm.c.fieldOf("biome").xmap(dlx::new, $$0 -> $$0.c).stable();
   private final jg<dlm> c;

   public dlx(jg<dlm> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jg<dlm>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dlq> a() {
      return b;
   }

   @Override
   public jg<dlm> getNoiseBiome(int $$0, int $$1, int $$2, dlv.f $$3) {
      return this.c;
   }

   @Override
   public jg<dlm> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<iw, jg<dlm>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jg<dlm>> $$5, bai $$6, boolean $$7, dlv.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new iw($$0, $$1, $$2), this.c) : Pair.of(new iw($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<iw, jg<dlm>> a(iw $$0, int $$1, int $$2, int $$3, Predicate<jg<dlm>> $$4, dlv.f $$5, dkm $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jg<dlm>> a(int $$0, int $$1, int $$2, int $$3, dlv.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
