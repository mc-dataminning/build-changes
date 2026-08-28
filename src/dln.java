import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dln extends dlg implements dle.a {
   public static final MapCodec<dln> b = dlc.c.fieldOf("biome").xmap(dln::new, $$0 -> $$0.c).stable();
   private final jg<dlc> c;

   public dln(jg<dlc> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jg<dlc>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dlg> a() {
      return b;
   }

   @Override
   public jg<dlc> getNoiseBiome(int $$0, int $$1, int $$2, dll.f $$3) {
      return this.c;
   }

   @Override
   public jg<dlc> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<iw, jg<dlc>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jg<dlc>> $$5, azz $$6, boolean $$7, dll.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new iw($$0, $$1, $$2), this.c) : Pair.of(new iw($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<iw, jg<dlc>> a(iw $$0, int $$1, int $$2, int $$3, Predicate<jg<dlc>> $$4, dll.f $$5, dkc $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jg<dlc>> a(int $$0, int $$1, int $$2, int $$3, dll.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
