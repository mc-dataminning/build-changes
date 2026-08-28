import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cdn extends cdw<btn> {
   private static final int a = 40;
   private static final int c = 5;
   private static final int d = 20;
   private final Long2LongMap e = new Long2LongOpenHashMap();
   private int f;
   private long g;

   public cdn() {
      super(20);
   }

   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.w);
   }

   protected void a(aqt $$0, btn $$1) {
      if ($$1.o_()) {
         this.f = 0;
         this.g = $$0.Z() + (long)$$0.E_().a(20);
         ceq $$2 = $$0.y();
         Predicate<jd> $$3 = $$0x -> {
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
         Set<Pair<jm<cet>, jd>> $$4 = $$2.b($$0x -> $$0x.a(ceu.n), $$3, $$1.dq(), 48, ceq.b.c).collect(Collectors.toSet());
         epm $$5 = buy.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            jd $$6 = $$5.l();
            Optional<jm<cet>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dU().a(ccq.w, $$6);
            }
         } else if (this.f < 5) {
            this.e.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.g);
         }
      }
   }
}
