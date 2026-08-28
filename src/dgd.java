import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dgd implements dcp {
   public static final dgd a = new dgd(new Object2IntOpenHashMap());
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   public static final Codec<dgd> b = Codec.unboundedMap(dfx.c, d).xmap($$0 -> new dgd(new Object2IntOpenHashMap($$0)), $$0 -> $$0.e);
   public static final yw<wj, dgd> c = yw.a(yu.a(Object2IntOpenHashMap::new, dfx.d, yu.h), $$0 -> $$0.e, dgd::new);
   final Object2IntOpenHashMap<jf<dfx>> e;

   dgd(Object2IntOpenHashMap<jf<dfx>> $$0) {
      this.e = $$0;
      ObjectIterator var2 = $$0.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<jf<dfx>> $$1 = (Entry<jf<dfx>>)var2.next();
         int $$2 = $$1.getIntValue();
         if ($$2 < 0 || $$2 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$1.getKey() + " has invalid level " + $$2);
         }
      }
   }

   public int a(jf<dfx> $$0) {
      return this.e.getInt($$0);
   }

   @Override
   public void a(czg.b $$0, Consumer<wy> $$1, daz $$2, kf $$3) {
      jh.a $$4 = $$0.a();
      jj<dfx> $$5 = a($$4, mh.aR, axe.a);

      for (jf<dfx> $$6 : $$5) {
         int $$7 = this.e.getInt($$6);
         if ($$7 > 0) {
            $$1.accept(dfx.a($$6, $$7));
         }
      }

      ObjectIterator var10 = this.e.object2IntEntrySet().iterator();

      while (var10.hasNext()) {
         Entry<jf<dfx>> $$8 = (Entry<jf<dfx>>)var10.next();
         jf<dfx> $$9 = (jf<dfx>)$$8.getKey();
         if (!$$5.a($$9)) {
            $$1.accept(dfx.a((jf<dfx>)$$8.getKey(), $$8.getIntValue()));
         }
      }
   }

   private static <T> jj<T> a(@Nullable jh.a $$0, alf<js<T>> $$1, axr<T> $$2) {
      if ($$0 != null) {
         Optional<jj.c<T>> $$3 = $$0.e($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jj.a();
   }

   public Set<jf<dfx>> a() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   public Set<Entry<jf<dfx>>> b() {
      return Collections.unmodifiableSet(this.e.object2IntEntrySet());
   }

   public int c() {
      return this.e.size();
   }

   public boolean d() {
      return this.e.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof dgd $$1 ? this.e.equals($$1.e) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.e.hashCode();
   }

   @Override
   public String toString() {
      return "ItemEnchantments{enchantments=" + this.e + "}";
   }

   public static class a {
      private final Object2IntOpenHashMap<jf<dfx>> a = new Object2IntOpenHashMap();

      public a(dgd $$0) {
         this.a.putAll($$0.e);
      }

      public void a(jf<dfx> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jf<dfx> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jf<dfx>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jf<dfx> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jf<dfx>> a() {
         return this.a.keySet();
      }

      public dgd b() {
         return new dgd(this.a);
      }
   }
}
