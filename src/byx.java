import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class byx extends bzg<boz> {
   private static final int a = 40;
   private static final int c = 5;
   private static final int d = 20;
   private final Long2LongMap e = new Long2LongOpenHashMap();
   private int f;
   private long g;

   public byx() {
      super(20);
   }

   @Override
   public Set<bya<?>> a() {
      return ImmutableSet.of(bya.w);
   }

   protected void a(apa $$0, boz $$1) {
      if ($$1.o_()) {
         this.f = 0;
         this.g = $$0.X() + (long)$$0.F_().a(20);
         caa $$2 = $$0.y();
         Predicate<ib> $$3 = $$0x -> {
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
         Set<Pair<il<cad>, ib>> $$4 = $$2.b($$0x -> $$0x.a(cae.n), $$3, $$1.dj(), 48, caa.b.c).collect(Collectors.toSet());
         eig $$5 = bqi.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            ib $$6 = $$5.l();
            Optional<il<cad>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dM().a(bya.w, $$6);
            }
         } else if (this.f < 5) {
            this.e.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.g);
         }
      }
   }
}
