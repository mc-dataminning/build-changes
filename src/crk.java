import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class crk extends crd implements crb.a {
   public static final Codec<crk> b = cqz.c.fieldOf("biome").xmap(crk::new, $$0 -> $$0.c).stable().codec();
   private final he<cqz> c;

   public crk(he<cqz> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<he<cqz>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends crd> a() {
      return b;
   }

   @Override
   public he<cqz> getNoiseBiome(int $$0, int $$1, int $$2, cri.f $$3) {
      return this.c;
   }

   @Override
   public he<cqz> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<gw, he<cqz>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<he<cqz>> $$5, ash $$6, boolean $$7, cri.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new gw($$0, $$1, $$2), this.c) : Pair.of(new gw($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<gw, he<cqz>> a(gw $$0, int $$1, int $$2, int $$3, Predicate<he<cqz>> $$4, cri.f $$5, cqe $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<he<cqz>> a(int $$0, int $$1, int $$2, int $$3, cri.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
