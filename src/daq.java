import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class daq extends daj implements dah.a {
   public static final Codec<daq> b = daf.c.fieldOf("biome").xmap(daq::new, $$0 -> $$0.c).stable().codec();
   private final in<daf> c;

   public daq(in<daf> $$0) {
      this.c = $$0;
   }

   @Override
   protected Stream<in<daf>> b() {
      return Stream.of(this.c);
   }

   @Override
   protected Codec<? extends daj> a() {
      return b;
   }

   @Override
   public in<daf> getNoiseBiome(int $$0, int $$1, int $$2, dao.f $$3) {
      return this.c;
   }

   @Override
   public in<daf> getNoiseBiome(int $$0, int $$1, int $$2) {
      return this.c;
   }

   @Nullable
   @Override
   public Pair<id, in<daf>> a(int $$0, int $$1, int $$2, int $$3, int $$4, Predicate<in<daf>> $$5, axt $$6, boolean $$7, dao.f $$8) {
      if ($$5.test(this.c)) {
         return $$7 ? Pair.of(new id($$0, $$1, $$2), this.c) : Pair.of(new id($$0 - $$3 + $$6.a($$3 * 2 + 1), $$1, $$2 - $$3 + $$6.a($$3 * 2 + 1)), this.c);
      } else {
         return null;
      }
   }

   @Nullable
   @Override
   public Pair<id, in<daf>> a(id $$0, int $$1, int $$2, int $$3, Predicate<in<daf>> $$4, dao.f $$5, czj $$6) {
      return $$4.test(this.c) ? Pair.of($$0, this.c) : null;
   }

   @Override
   public Set<in<daf>> a(int $$0, int $$1, int $$2, int $$3, dao.f $$4) {
      return Sets.newHashSet(Set.of(this.c));
   }
}
