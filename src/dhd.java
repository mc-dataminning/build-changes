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

public class dhd implements ddp {
   public static final dhd a = new dhd(new Object2IntOpenHashMap());
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   public static final Codec<dhd> b = Codec.unboundedMap(dgx.c, d).xmap($$0 -> new dhd(new Object2IntOpenHashMap($$0)), $$0 -> $$0.e);
   public static final ze<wp, dhd> c = ze.a(zc.a(Object2IntOpenHashMap::new, dgx.d, zc.h), $$0 -> $$0.e, dhd::new);
   final Object2IntOpenHashMap<jg<dgx>> e;

   dhd(Object2IntOpenHashMap<jg<dgx>> $$0) {
      this.e = $$0;
      ObjectIterator var2 = $$0.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<jg<dgx>> $$1 = (Entry<jg<dgx>>)var2.next();
         int $$2 = $$1.getIntValue();
         if ($$2 < 0 || $$2 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$1.getKey() + " has invalid level " + $$2);
         }
      }
   }

   public int a(jg<dgx> $$0) {
      return this.e.getInt($$0);
   }

   @Override
   public void a(dag.b $$0, Consumer<xg> $$1, dbz $$2, kg $$3) {
      ji.a $$4 = $$0.a();
      jk<dgx> $$5 = a($$4, mi.aR, axp.a);

      for (jg<dgx> $$6 : $$5) {
         int $$7 = this.e.getInt($$6);
         if ($$7 > 0) {
            $$1.accept(dgx.a($$6, $$7));
         }
      }

      ObjectIterator var10 = this.e.object2IntEntrySet().iterator();

      while (var10.hasNext()) {
         Entry<jg<dgx>> $$8 = (Entry<jg<dgx>>)var10.next();
         jg<dgx> $$9 = (jg<dgx>)$$8.getKey();
         if (!$$5.a($$9)) {
            $$1.accept(dgx.a((jg<dgx>)$$8.getKey(), $$8.getIntValue()));
         }
      }
   }

   private static <T> jk<T> a(@Nullable ji.a $$0, alq<jt<T>> $$1, ayc<T> $$2) {
      if ($$0 != null) {
         Optional<jk.c<T>> $$3 = $$0.e($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jk.a();
   }

   public Set<jg<dgx>> a() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   public Set<Entry<jg<dgx>>> b() {
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
         return $$0 instanceof dhd $$1 ? this.e.equals($$1.e) : false;
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
      private final Object2IntOpenHashMap<jg<dgx>> a = new Object2IntOpenHashMap();

      public a(dhd $$0) {
         this.a.putAll($$0.e);
      }

      public void a(jg<dgx> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jg<dgx> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jg<dgx>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jg<dgx> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jg<dgx>> a() {
         return this.a.keySet();
      }

      public dhd b() {
         return new dhd(this.a);
      }
   }
}
