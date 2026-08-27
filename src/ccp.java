import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ccp extends ccy<bsq> {
   private static final int a = 40;
   private static final int c = 5;
   private static final int d = 20;
   private final Long2LongMap e = new Long2LongOpenHashMap();
   private int f;
   private long g;

   public ccp() {
      super(20);
   }

   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.w);
   }

   protected void a(aqm $$0, bsq $$1) {
      if ($$1.p_()) {
         this.f = 0;
         this.g = $$0.Y() + (long)$$0.E_().a(20);
         cds $$2 = $$0.y();
         Predicate<io> $$3 = $$0x -> {
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
         Set<Pair<ix<cdv>, io>> $$4 = $$2.b($$0x -> $$0x.a(cdw.n), $$3, $$1.dp(), 48, cds.b.c).collect(Collectors.toSet());
         eni $$5 = bua.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            io $$6 = $$5.l();
            Optional<ix<cdv>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dS().a(cbs.w, $$6);
            }
         } else if (this.f < 5) {
            this.e.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.g);
         }
      }
   }
}
