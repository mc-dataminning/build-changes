import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class cfz extends cgi<bwa> {
   private static final int a = 40;
   private static final int b = 5;
   private static final int c = 20;
   private final Long2LongMap d = new Long2LongOpenHashMap();
   private int e;
   private long f;

   public cfz() {
      super(20);
   }

   @Override
   public Set<cfc<?>> a() {
      return ImmutableSet.of(cfc.w);
   }

   protected void a(ard $$0, bwa $$1) {
      if ($$1.n_()) {
         this.e = 0;
         this.f = $$0.ae() + (long)$$0.C_().a(20);
         chc $$2 = $$0.A();
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
         Set<Pair<jr<chf>, ji>> $$4 = $$2.b($$0x -> $$0x.a(chg.n), $$3, $$1.du(), 48, chc.b.c).collect(Collectors.toSet());
         euk $$5 = bxk.a($$1, $$4);
         if ($$5 != null && $$5.j()) {
            ji $$6 = $$5.l();
            Optional<jr<chf>> $$7 = $$2.c($$6);
            if ($$7.isPresent()) {
               $$1.ea().a(cfc.w, $$6);
            }
         } else if (this.e < 5) {
            this.d.long2LongEntrySet().removeIf($$0x -> $$0x.getLongValue() < this.f);
         }
      }
   }
}
