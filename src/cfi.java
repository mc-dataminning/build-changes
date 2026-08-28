import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfi extends cfr<bvj> {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private final Long2LongMap d = new Long2LongOpenHashMap();
   private int e;
   private long f;

   public cfi() {
      super(20);
   }

   @Override
   public Set<cel<?>> a() {
      return ImmutableSet.of(cel.w);
   }

   protected void a(arp $$0, bvj $$1) {
      if ($$1.e_()) {
         this.e = 0;
         this.f = $$0.ab() + (long)$$0.G_().a(20);
         cgl $$2 = $$0.z();
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
         Set<Pair<jq<cgo>, jh>> $$4 = $$2.b($$0x -> $$0x.a(cgp.n), $$3, $$1.dv(), 48, cgl.b.c).collect(Collectors.toSet());
         esj $$5 = bwt.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            jh $$6 = $$5.l();
            Optional<jq<cgo>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.eb().a(cel.w, $$6);
            }
         } else if (this.e < 5) {
            this.d.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.f);
         }
      }
   }
}
