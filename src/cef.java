import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cef extends ceo<buh> {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private final Long2LongMap d = new Long2LongOpenHashMap();
   private int e;
   private long f;

   public cef() {
      super(20);
   }

   @Override
   public Set<cdi<?>> a() {
      return ImmutableSet.of(cdi.w);
   }

   protected void a(arg $$0, buh $$1) {
      if ($$1.o_()) {
         this.e = 0;
         this.f = $$0.aa() + (long)$$0.C_().a(20);
         cfi $$2 = $$0.y();
         Predicate<je> $$3 = $$0x -> {
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
         Set<Pair<jn<cfl>, je>> $$4 = $$2.b($$0x -> $$0x.a(cfm.n), $$3, $$1.ds(), 48, cfi.b.c).collect(Collectors.toSet());
         eqp $$5 = bvq.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            je $$6 = $$5.l();
            Optional<jn<cfl>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dX().a(cdi.w, $$6);
            }
         } else if (this.e < 5) {
            this.d.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.f);
         }
      }
   }
}
