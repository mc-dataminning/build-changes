import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cff extends cfo<bvg> {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private final Long2LongMap d = new Long2LongOpenHashMap();
   private int e;
   private long f;

   public cff() {
      super(20);
   }

   @Override
   public Set<cei<?>> a() {
      return ImmutableSet.of(cei.w);
   }

   protected void a(arq $$0, bvg $$1) {
      if ($$1.p_()) {
         this.e = 0;
         this.f = $$0.aa() + (long)$$0.E_().a(20);
         cgi $$2 = $$0.y();
         Predicate<jh> $$3 = $$0x -> {
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
         Set<Pair<jq<cgl>, jh>> $$4 = $$2.b($$0x -> $$0x.a(cgm.n), $$3, $$1.dy(), 48, cgi.b.c).collect(Collectors.toSet());
         esc $$5 = bwq.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            jh $$6 = $$5.l();
            Optional<jq<cgl>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.ee().a(cei.w, $$6);
            }
         } else if (this.e < 5) {
            this.d.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.f);
         }
      }
   }
}
