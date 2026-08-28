import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dkd extends djw implements dju.a {
   public static final MapCodec<dkd> b = djs.c.fieldOf("biome").xmap(dkd::new, $$0 -> $$0.c).stable();
   private final je<djs> c;

   public dkd(je<djs> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<je<djs>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends djw> a() {
      return b;
   }

   @Override
   public je<djs> getNoiseBiome(int $$0, int $$1, int $$2, dkb.f $$3) {
      return this.c;
   }

   @Override
   public je<djs> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<iu, je<djs>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<je<djs>> $$5, azt $$6, boolean $$7, dkb.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new iu($$0, $$1, $$2), this.c) : Pair.of(new iu($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<iu, je<djs>> a(iu $$0, int $$1, int $$2, int $$3, Predicate<je<djs>> $$4, dkb.f $$5, dis $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<je<djs>> a(int $$0, int $$1, int $$2, int $$3, dkb.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
