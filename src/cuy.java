import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cuy extends cur implements cup.a {
   public static final Codec<cuy> b = cun.c.fieldOf("biome").xmap(cuy::new, $$0 -> $$0.c).stable().codec();
   private final ih<cun> c;

   public cuy(ih<cun> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ih<cun>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cur> a() {
      return b;
   }

   @Override
   public ih<cun> getNoiseBiome(int $$0, int $$1, int $$2, cuw.f $$3) {
      return this.c;
   }

   @Override
   public ih<cun> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<hx, ih<cun>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ih<cun>> $$5, auu $$6, boolean $$7, cuw.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new hx($$0, $$1, $$2), this.c) : Pair.of(new hx($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<hx, ih<cun>> a(hx $$0, int $$1, int $$2, int $$3, Predicate<ih<cun>> $$4, cuw.f $$5, ctr $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ih<cun>> a(int $$0, int $$1, int $$2, int $$3, cuw.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
