import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cuz extends cus implements cuq.a {
   public static final Codec<cuz> b = cuo.c.fieldOf("biome").xmap(cuz::new, $$0 -> $$0.c).stable().codec();
   private final ih<cuo> c;

   public cuz(ih<cuo> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ih<cuo>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cus> a() {
      return b;
   }

   @Override
   public ih<cuo> getNoiseBiome(int $$0, int $$1, int $$2, cux.f $$3) {
      return this.c;
   }

   @Override
   public ih<cuo> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<hx, ih<cuo>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ih<cuo>> $$5, auv $$6, boolean $$7, cux.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new hx($$0, $$1, $$2), this.c) : Pair.of(new hx($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<hx, ih<cuo>> a(hx $$0, int $$1, int $$2, int $$3, Predicate<ih<cuo>> $$4, cux.f $$5, cts $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ih<cuo>> a(int $$0, int $$1, int $$2, int $$3, cux.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
