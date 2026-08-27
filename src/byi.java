import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class byi extends byr<bok> {
   private static final int a = 40;
   private static final int c = 5;
   private static final int d = 20;
   private final Long2LongMap e = new Long2LongOpenHashMap();
   private int f;
   private long g;

   public byi() {
      super(20);
   }

   @Override
   public Set<bxl<?>> a() {
      return ImmutableSet.of(bxl.w);
   }

   protected void a(aow $$0, bok $$1) {
      if ($$1.o_()) {
         this.f = 0;
         this.g = $$0.X() + (long)$$0.F_().a(20);
         bzl $$2 = $$0.y();
         Predicate<hz> $$3 = $$0x -> {
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
         Set<Pair<ij<bzo>, hz>> $$4 = $$2.b($$0x -> $$0x.a(bzp.n), $$3, $$1.dm(), 48, bzl.b.c).collect(Collectors.toSet());
         ehl $$5 = bpt.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            hz $$6 = $$5.l();
            Optional<ij<bzo>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dO().a(bxl.w, $$6);
            }
         } else if (this.f < 5) {
            this.e.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.g);
         }
      }
   }
}
