import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cgy extends chh<bxb> {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private final Long2LongMap d = new Long2LongOpenHashMap();
   private int e;
   private long f;

   public cgy() {
      super(20);
   }

   @Override
   public Set<cgb<?>> a() {
      return ImmutableSet.of(cgb.x);
   }

   protected void a(aro $$0, bxb $$1) {
      if ($$1.n_()) {
         this.e = 0;
         this.f = $$0.ae() + (long)$$0.C_().a(20);
         cib $$2 = $$0.A();
         Predicate<iu> $$3 = $$0x -> {
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
         Set<Pair<je<cie>, iu>> $$4 = $$2.b($$0x -> $$0x.a(cif.n), $$3, $$1.dv(), 48, cib.b.c).collect(Collectors.toSet());
         ewj $$5 = byj.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            iu $$6 = $$5.l();
            Optional<je<cie>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.eb().a(cgb.x, $$6);
            }
         } else if (this.e < 5) {
            this.d.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.f);
         }
      }
   }
}
