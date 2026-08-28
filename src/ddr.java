import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ddr extends ddk implements ddi.a {
   public static final MapCodec<ddr> b = ddg.c.fieldOf("biome").xmap(ddr::new, $$0 -> $$0.c).stable();
   private final jj<ddg> c;

   public ddr(jj<ddg> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jj<ddg>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends ddk> a() {
      return b;
   }

   @Override
   public jj<ddg> getNoiseBiome(int $$0, int $$1, int $$2, ddp.f $$3) {
      return this.c;
   }

   @Override
   public jj<ddg> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ja, jj<ddg>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jj<ddg>> $$5, ayo $$6, boolean $$7, ddp.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ja($$0, $$1, $$2), this.c) : Pair.of(new ja($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ja, jj<ddg>> a(ja $$0, int $$1, int $$2, int $$3, Predicate<jj<ddg>> $$4, ddp.f $$5, dcj $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jj<ddg>> a(int $$0, int $$1, int $$2, int $$3, ddp.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
