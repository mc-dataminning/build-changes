import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class bsu extends btd<bja> {
   private static final int a = 40;
   private static final int c = 5;
   private static final int d = 20;
   private final Long2LongMap e = new Long2LongOpenHashMap();
   private int f;
   private long g;

   public bsu() {
      super(20);
   }

   @Override
   public Set<brz<?>> a() {
      return ImmutableSet.of(brz.w);
   }

   protected void a(akk $$0, bja $$1) {
      if ($$1.i_()) {
         this.f = 0;
         this.g = $$0.V() + (long)$$0.y_().a(20);
         btx $$2 = $$0.w();
         Predicate<gu> $$3 = $$0x -> {
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
         Set<Pair<he<bua>, gu>> $$4 = $$2.b($$0x -> $$0x.a(bub.n), $$3, $$1.dk(), 48, btx.b.c).collect(Collectors.toSet());
         ear $$5 = bki.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            gu $$6 = $$5.l();
            Optional<he<bua>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dM().a(brz.w, $$6);
            }
         } else if (this.f < 5) {
            this.e.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.g);
         }
      }
   }
}
