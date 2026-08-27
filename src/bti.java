import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class bti extends btr<bjo> {
   private static final int a = 40;
   private static final int c = 5;
   private static final int d = 20;
   private final Long2LongMap e = new Long2LongOpenHashMap();
   private int f;
   private long g;

   public bti() {
      super(20);
   }

   @Override
   public Set<bsn<?>> a() {
      return ImmutableSet.of(bsn.w);
   }

   protected void a(akt $$0, bjo $$1) {
      if ($$1.m_()) {
         this.f = 0;
         this.g = $$0.V() + (long)$$0.D_().a(20);
         bul $$2 = $$0.w();
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
         Set<Pair<he<buo>, gw>> $$4 = $$2.b($$0x -> $$0x.a(bup.n), $$3, $$1.dl(), 48, bul.b.c).collect(Collectors.toSet());
         eav $$5 = bkw.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            gw $$6 = $$5.l();
            Optional<he<buo>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dN().a(bsn.w, $$6);
            }
         } else if (this.f < 5) {
            this.e.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.g);
         }
      }
   }
}
