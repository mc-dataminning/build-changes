import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class bsx extends btg<bjd> {
   private static final int a = 40;
   private static final int c = 5;
   private static final int d = 20;
   private final Long2LongMap e = new Long2LongOpenHashMap();
   private int f;
   private long g;

   public bsx() {
      super(20);
   }

   @Override
   public Set<bsc<?>> a() {
      return ImmutableSet.of(bsc.w);
   }

   protected void a(akn $$0, bjd $$1) {
      if ($$1.i_()) {
         this.f = 0;
         this.g = $$0.V() + (long)$$0.y_().a(20);
         bua $$2 = $$0.w();
         Predicate<gw> $$3 = $$0x -> {
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
         Set<Pair<hg<bud>, gw>> $$4 = $$2.b($$0x -> $$0x.a(bue.n), $$3, $$1.dk(), 48, bua.b.c).collect(Collectors.toSet());
         eaw $$5 = bkl.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            gw $$6 = $$5.l();
            Optional<hg<bud>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dM().a(bsc.w, $$6);
            }
         } else if (this.f < 5) {
            this.e.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.g);
         }
      }
   }
}
