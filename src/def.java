import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class def extends ddy implements ddw.a {
   public static final MapCodec<def> b = ddu.c.fieldOf("biome").xmap(def::new, $$0 -> $$0.c).stable();
   private final jm<ddu> c;

   public def(jm<ddu> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jm<ddu>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends ddy> a() {
      return b;
   }

   @Override
   public jm<ddu> getNoiseBiome(int $$0, int $$1, int $$2, ded.f $$3) {
      return this.c;
   }

   @Override
   public jm<ddu> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<jd, jm<ddu>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jm<ddu>> $$5, ayv $$6, boolean $$7, ded.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new jd($$0, $$1, $$2), this.c) : Pair.of(new jd($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<jd, jm<ddu>> a(jd $$0, int $$1, int $$2, int $$3, Predicate<jm<ddu>> $$4, ded.f $$5, dcx $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jm<ddu>> a(int $$0, int $$1, int $$2, int $$3, ded.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
