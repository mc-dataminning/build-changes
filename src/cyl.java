import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cyl extends cye implements cyc.a {
   public static final Codec<cyl> b = cya.c.fieldOf("biome").xmap(cyl::new, $$0 -> $$0.c).stable().codec();
   private final il<cya> c;

   public cyl(il<cya> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<il<cya>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cye> a() {
      return b;
   }

   @Override
   public il<cya> getNoiseBiome(int $$0, int $$1, int $$2, cyj.f $$3) {
      return this.c;
   }

   @Override
   public il<cya> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ib, il<cya>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<il<cya>> $$5, axd $$6, boolean $$7, cyj.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ib($$0, $$1, $$2), this.c) : Pair.of(new ib($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ib, il<cya>> a(ib $$0, int $$1, int $$2, int $$3, Predicate<il<cya>> $$4, cyj.f $$5, cxe $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<il<cya>> a(int $$0, int $$1, int $$2, int $$3, cyj.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
