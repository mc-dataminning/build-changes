import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfh extends cfq<bvi> {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private final Long2LongMap d = new Long2LongOpenHashMap();
   private int e;
   private long f;

   public cfh() {
      super(20);
   }

   @Override
   public Set<cek<?>> a() {
      return ImmutableSet.of(cek.w);
   }

   protected void a(arc $$0, bvi $$1) {
      if ($$1.e_()) {
         this.e = 0;
         this.f = $$0.ad() + (long)$$0.H_().a(20);
         cgk $$2 = $$0.A();
         Predicate<ji> $$3 = $$0x -> {
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
         Set<Pair<jr<cgn>, ji>> $$4 = $$2.b($$0x -> $$0x.a(cgo.n), $$3, $$1.dw(), 48, cgk.b.c).collect(Collectors.toSet());
         etn $$5 = bws.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            ji $$6 = $$5.l();
            Optional<jr<cgn>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.ec().a(cek.w, $$6);
            }
         } else if (this.e < 5) {
            this.d.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.f);
         }
      }
   }
}
