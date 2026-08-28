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

public class dgr implements ddd {
   public static final dgr a = new dgr(new Object2IntOpenHashMap());
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   public static final Codec<dgr> b = Codec.unboundedMap(dgl.c, d).xmap($$0 -> new dgr(new Object2IntOpenHashMap($$0)), $$0 -> $$0.e);
   public static final yy<wl, dgr> c = yy.a(yw.a(Object2IntOpenHashMap::new, dgl.d, yw.h), $$0 -> $$0.e, dgr::new);
   final Object2IntOpenHashMap<jf<dgl>> e;

   dgr(Object2IntOpenHashMap<jf<dgl>> $$0) {
      this.e = $$0;
      ObjectIterator var2 = $$0.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<jf<dgl>> $$1 = (Entry<jf<dgl>>)var2.next();
         int $$2 = $$1.getIntValue();
         if ($$2 < 0 || $$2 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$1.getKey() + " has invalid level " + $$2);
         }
      }
   }

   public int a(jf<dgl> $$0) {
      return this.e.getInt($$0);
   }

   @Override
   public void a(czu.b $$0, Consumer<xa> $$1, dbn $$2, kf $$3) {
      jh.a $$4 = $$0.a();
      jj<dgl> $$5 = a($$4, mh.aR, axg.a);

      for (jf<dgl> $$6 : $$5) {
         int $$7 = this.e.getInt($$6);
         if ($$7 > 0) {
            $$1.accept(dgl.a($$6, $$7));
         }
      }

      ObjectIterator var10 = this.e.object2IntEntrySet().iterator();

      while (var10.hasNext()) {
         Entry<jf<dgl>> $$8 = (Entry<jf<dgl>>)var10.next();
         jf<dgl> $$9 = (jf<dgl>)$$8.getKey();
         if (!$$5.a($$9)) {
            $$1.accept(dgl.a((jf<dgl>)$$8.getKey(), $$8.getIntValue()));
         }
      }
   }

   private static <T> jj<T> a(@Nullable jh.a $$0, alh<js<T>> $$1, axt<T> $$2) {
      if ($$0 != null) {
         Optional<jj.c<T>> $$3 = $$0.e($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jj.a();
   }

   public Set<jf<dgl>> a() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   public Set<Entry<jf<dgl>>> b() {
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
         return $$0 instanceof dgr $$1 ? this.e.equals($$1.e) : false;
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
      private final Object2IntOpenHashMap<jf<dgl>> a = new Object2IntOpenHashMap();

      public a(dgr $$0) {
         this.a.putAll($$0.e);
      }

      public void a(jf<dgl> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jf<dgl> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jf<dgl>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jf<dgl> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jf<dgl>> a() {
         return this.a.keySet();
      }

      public dgr b() {
         return new dgr(this.a);
      }
   }
}
