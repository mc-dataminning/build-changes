import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cus extends cul implements cuj.a {
   public static final Codec<cus> b = cuh.c.fieldOf("biome").xmap(cus::new, $$0 -> $$0.c).stable().codec();
   private final ih<cuh> c;

   public cus(ih<cuh> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<ih<cuh>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends cul> a() {
      return b;
   }

   @Override
   public ih<cuh> getNoiseBiome(int $$0, int $$1, int $$2, cuq.f $$3) {
      return this.c;
   }

   @Override
   public ih<cuh> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<hx, ih<cuh>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<ih<cuh>> $$5, aup $$6, boolean $$7, cuq.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new hx($$0, $$1, $$2), this.c) : Pair.of(new hx($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<hx, ih<cuh>> a(hx $$0, int $$1, int $$2, int $$3, Predicate<ih<cuh>> $$4, cuq.f $$5, ctl $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<ih<cuh>> a(int $$0, int $$1, int $$2, int $$3, cuq.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
