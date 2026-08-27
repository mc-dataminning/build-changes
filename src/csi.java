import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class csi extends csb implements crz.a {
   public static final Codec<csi> b = crx.c.fieldOf("biome").xmap(csi::new, $$0 -> $$0.c).stable().codec();
   private final ib<crx> c;

   public csi(ib<crx> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ib<crx>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends csb> a() {
      return b;
   }

   @Override
   public ib<crx> getNoiseBiome(int $$0, int $$1, int $$2, csg.f $$3) {
      return this.c;
   }

   @Override
   public ib<crx> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ht, ib<crx>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ib<crx>> $$5, ate $$6, boolean $$7, csg.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ht($$0, $$1, $$2), this.c) : Pair.of(new ht($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ht, ib<crx>> a(ht $$0, int $$1, int $$2, int $$3, Predicate<ib<crx>> $$4, csg.f $$5, crc $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ib<crx>> a(int $$0, int $$1, int $$2, int $$3, csg.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
