import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cen extends cew<bup> {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private final Long2LongMap d = new Long2LongOpenHashMap();
   private int e;
   private long f;

   public cen() {
      super(20);
   }

   @Override
   public Set<cdq<?>> a() {
      return ImmutableSet.of(cdq.w);
   }

   protected void a(arj $$0, bup $$1) {
      if ($$1.p_()) {
         this.e = 0;
         this.f = $$0.aa() + (long)$$0.D_().a(20);
         cfq $$2 = $$0.y();
         Predicate<jf> $$3 = $$0x -> {
            long $$1x = $$0x.a();
            if (this.d.containsKey($$1x)) {
               return false;
            } else if (++this.e >= 5) {
               return false;
            } else {
               this.d.put($$1x, this.f + 40L);
               return true;
            }
         };
         Set<Pair<jo<cft>, jf>> $$4 = $$2.b($$0x -> $$0x.a(cfu.n), $$3, $$1.ds(), 48, cfq.b.c).collect(Collectors.toSet());
         erh $$5 = bvy.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            jf $$6 = $$5.l();
            Optional<jo<cft>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dY().a(cdq.w, $$6);
            }
         } else if (this.e < 5) {
            this.d.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.f);
         }
      }
   }
}
