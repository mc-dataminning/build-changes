import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cek extends cet<bum> {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private final Long2LongMap d = new Long2LongOpenHashMap();
   private int e;
   private long f;

   public cek() {
      super(20);
   }

   @Override
   public Set<cdn<?>> a() {
      return ImmutableSet.of(cdn.w);
   }

   protected void a(arh $$0, bum $$1) {
      if ($$1.o_()) {
         this.e = 0;
         this.f = $$0.aa() + (long)$$0.C_().a(20);
         cfn $$2 = $$0.y();
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
         Set<Pair<jn<cfq>, je>> $$4 = $$2.b($$0x -> $$0x.a(cfr.n), $$3, $$1.ds(), 48, cfn.b.c).collect(Collectors.toSet());
         erd $$5 = bvv.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            je $$6 = $$5.l();
            Optional<jn<cfq>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.dX().a(cdn.w, $$6);
            }
         } else if (this.e < 5) {
            this.d.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.f);
         }
      }
   }
}
