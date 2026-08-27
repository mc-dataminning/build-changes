import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class bst extends btc<biy> {
   private static final int a = 40;
   private static final int c = 5;
   private static final int d = 20;
   private final Long2LongMap e = new Long2LongOpenHashMap();
   private int f;
   private long g;

   public bst() {
      super(20);
   }

   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.w);
   }

   protected void a(aki $$0, biy $$1) {
      if ($$1.i_()) {
         this.f = 0;
         this.g = $$0.V() + (long)$$0.y_().a(20);
         btw $$2 = $$0.w();
         Predicate<gv> $$3 = $$0x -> {
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
         Set<Pair<hf<btz>, gv>> $$4 = $$2.b($$0x -> $$0x.a(bua.n), $$3, $$1.dk(), 48, btw.b.c).collect(Collectors.toSet());
         eaq $$5 = bkh.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            gv $$6 = $$5.l();
            Optional<hf<btz>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dM().a(bry.w, $$6);
            }
         } else if (this.f < 5) {
            this.e.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.g);
         }
      }
   }
}
