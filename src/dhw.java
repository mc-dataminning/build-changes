import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.MapCodec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dhw extends dhp implements dhn.a {
   public static final MapCodec<dhw> b = dhl.c.fieldOf("biome").xmap(dhw::new, $$0 -> $$0.c).stable();
   private final jr<dhl> c;

   public dhw(jr<dhl> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<jr<dhl>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected MapCodec<? extends dhp> a() {
      return b;
   }

   @Override
   public jr<dhl> getNoiseBiome(int $$0, int $$1, int $$2, dhu.f $$3) {
      return this.c;
   }

   @Override
   public jr<dhl> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<ji, jr<dhl>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<jr<dhl>> $$5, azh $$6, boolean $$7, dhu.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new ji($$0, $$1, $$2), this.c) : Pair.of(new ji($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<ji, jr<dhl>> a(ji $$0, int $$1, int $$2, int $$3, Predicate<jr<dhl>> $$4, dhu.f $$5, dgm $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<jr<dhl>> a(int $$0, int $$1, int $$2, int $$3, dhu.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
