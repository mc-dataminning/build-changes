import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cui extends cub implements ctz.a {
   public static final Codec<cui> b = ctx.c.fieldOf("biome").xmap(cui::new, $$0 -> $$0.c).stable().codec();
   private final ie<ctx> c;

   public cui(ie<ctx> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ie<ctx>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cub> a() {
      return b;
   }

   @Override
   public ie<ctx> getNoiseBiome(int $$0, int $$1, int $$2, cug.f $$3) {
      return this.c;
   }

   @Override
   public ie<ctx> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<hv, ie<ctx>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ie<ctx>> $$5, auf $$6, boolean $$7, cug.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new hv($$0, $$1, $$2), this.c) : Pair.of(new hv($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<hv, ie<ctx>> a(hv $$0, int $$1, int $$2, int $$3, Predicate<ie<ctx>> $$4, cug.f $$5, ctb $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ie<ctx>> a(int $$0, int $$1, int $$2, int $$3, cug.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
