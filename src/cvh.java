import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cvh extends cva implements cuy.a {
   public static final Codec<cvh> b = cuw.c.fieldOf("biome").xmap(cvh::new, $$0 -> $$0.c).stable().codec();
   private final ih<cuw> c;

   public cvh(ih<cuw> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ih<cuw>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cva> a() {
      return b;
   }

   @Override
   public ih<cuw> getNoiseBiome(int $$0, int $$1, int $$2, cvf.f $$3) {
      return this.c;
   }

   @Override
   public ih<cuw> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<hx, ih<cuw>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ih<cuw>> $$5, auw $$6, boolean $$7, cvf.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new hx($$0, $$1, $$2), this.c) : Pair.of(new hx($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<hx, ih<cuw>> a(hx $$0, int $$1, int $$2, int $$3, Predicate<ih<cuw>> $$4, cvf.f $$5, cua $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ih<cuw>> a(int $$0, int $$1, int $$2, int $$3, cvf.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
