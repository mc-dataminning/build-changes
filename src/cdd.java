import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cdd extends cdm<bte> {
   private static final int a = 40;
   private static final int c = 5;
   private static final int d = 20;
   private final Long2LongMap e = new Long2LongOpenHashMap();
   private int f;
   private long g;

   public cdd() {
      super(20);
   }

   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.of(ccg.w);
   }

   protected void a(aqm $$0, bte $$1) {
      if ($$1.o_()) {
         this.f = 0;
         this.g = $$0.Z() + (long)$$0.E_().a(20);
         ceg $$2 = $$0.y();
         Predicate<ja> $$3 = $$0x -> {
            long $$1x = $$0x.a();
            if (this.e.containsKey($$1x)) {
               return false;
            } else if (++this.f >= 5) {
               return false;
            } else {
               this.e.put($$1x, this.g + 40L);
               return true;
            }
         };
         Set<Pair<jj<cej>, ja>> $$4 = $$2.b($$0x -> $$0x.a(cek.n), $$3, $$1.dr(), 48, ceg.b.c).collect(Collectors.toSet());
         eox $$5 = buo.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            ja $$6 = $$5.l();
            Optional<jj<cej>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dV().a(ccg.w, $$6);
            }
         } else if (this.f < 5) {
            this.e.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.g);
         }
      }
   }
}
