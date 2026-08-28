import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cdo extends cdx<btp> {
   private static final int a = 40;
   private static final int c = 5;
   private static final int d = 20;
   private final Long2LongMap e = new Long2LongOpenHashMap();
   private int f;
   private long g;

   public cdo() {
      super(20);
   }

   @Override
   public Set<ccr<?>> a() {
      return ImmutableSet.of(ccr.w);
   }

   protected void a(are $$0, btp $$1) {
      if ($$1.p_()) {
         this.f = 0;
         this.g = $$0.Z() + (long)$$0.E_().a(20);
         cer $$2 = $$0.y();
         Predicate<iz> $$3 = $$0x -> {
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
         Set<Pair<ji<ceu>, iz>> $$4 = $$2.b($$0x -> $$0x.a(cev.n), $$3, $$1.dp(), 48, cer.b.c).collect(Collectors.toSet());
         eoh $$5 = buz.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            iz $$6 = $$5.l();
            Optional<ji<ceu>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dS().a(ccr.w, $$6);
            }
         } else if (this.f < 5) {
            this.e.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.g);
         }
      }
   }
}
