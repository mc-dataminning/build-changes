import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class chi extends chr<bxl> {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private final Long2LongMap d = new Long2LongOpenHashMap();
   private int e;
   private long f;

   public chi() {
      super(20);
   }

   @Override
   public Set<cgl<?>> a() {
      return ImmutableSet.of(cgl.x);
   }

   protected void a(arq $$0, bxl $$1) {
      if ($$1.n_()) {
         this.e = 0;
         this.f = $$0.ae() + (long)$$0.C_().a(20);
         cil $$2 = $$0.A();
         Predicate<iv> $$3 = $$0x -> {
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
         Set<Pair<jf<cio>, iv>> $$4 = $$2.b($$0x -> $$0x.a(cip.n), $$3, $$1.du(), 48, cil.b.c).collect(Collectors.toSet());
         exo $$5 = byt.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            iv $$6 = $$5.l();
            Optional<jf<cio>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.eb().a(cgl.x, $$6);
            }
         } else if (this.e < 5) {
            this.d.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.f);
         }
      }
   }
}
