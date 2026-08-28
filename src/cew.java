import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cew extends cff<bux> {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private final Long2LongMap d = new Long2LongOpenHashMap();
   private int e;
   private long f;

   public cew() {
      super(20);
   }

   @Override
   public Set<cdz<?>> a() {
      return ImmutableSet.of(cdz.w);
   }

   protected void a(arm $$0, bux $$1) {
      if ($$1.p_()) {
         this.e = 0;
         this.f = $$0.aa() + (long)$$0.E_().a(20);
         cfz $$2 = $$0.y();
         Predicate<jg> $$3 = $$0x -> {
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
         Set<Pair<jp<cgc>, jg>> $$4 = $$2.b($$0x -> $$0x.a(cgd.n), $$3, $$1.dx(), 48, cfz.b.c).collect(Collectors.toSet());
         ers $$5 = bwh.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            jg $$6 = $$5.l();
            Optional<jp<cgc>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.ed().a(cdz.w, $$6);
            }
         } else if (this.e < 5) {
            this.d.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.f);
         }
      }
   }
}
