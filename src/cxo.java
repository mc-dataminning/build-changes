import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cxo extends cxh implements cxf.a {
   public static final Codec<cxo> b = cxd.c.fieldOf("biome").xmap(cxo::new, $$0 -> $$0.c).stable().codec();
   private final il<cxd> c;

   public cxo(il<cxd> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<il<cxd>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cxh> a() {
      return b;
   }

   @Override
   public il<cxd> getNoiseBiome(int $$0, int $$1, int $$2, cxm.f $$3) {
      return this.c;
   }

   @Override
   public il<cxd> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ib, il<cxd>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<il<cxd>> $$5, awt $$6, boolean $$7, cxm.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ib($$0, $$1, $$2), this.c) : Pair.of(new ib($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ib, il<cxd>> a(ib $$0, int $$1, int $$2, int $$3, Predicate<il<cxd>> $$4, cxm.f $$5, cwh $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<il<cxd>> a(int $$0, int $$1, int $$2, int $$3, cxm.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
