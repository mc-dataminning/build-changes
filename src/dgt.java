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

public class dgt implements ddf {
   public static final dgt a = new dgt(new Object2IntOpenHashMap());
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   public static final Codec<dgt> b = Codec.unboundedMap(dgn.c, d).xmap($$0 -> new dgt(new Object2IntOpenHashMap($$0)), $$0 -> $$0.e);
   public static final za<wn, dgt> c = za.a(yy.a(Object2IntOpenHashMap::new, dgn.d, yy.h), $$0 -> $$0.e, dgt::new);
   final Object2IntOpenHashMap<jg<dgn>> e;

   dgt(Object2IntOpenHashMap<jg<dgn>> $$0) {
      this.e = $$0;
      ObjectIterator var2 = $$0.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<jg<dgn>> $$1 = (Entry<jg<dgn>>)var2.next();
         int $$2 = $$1.getIntValue();
         if ($$2 < 0 || $$2 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$1.getKey() + " has invalid level " + $$2);
         }
      }
   }

   public int a(jg<dgn> $$0) {
      return this.e.getInt($$0);
   }

   @Override
   public void a(czw.b $$0, Consumer<xc> $$1, dbp $$2, kg $$3) {
      ji.a $$4 = $$0.a();
      jk<dgn> $$5 = a($$4, mi.aR, axi.a);

      for (jg<dgn> $$6 : $$5) {
         int $$7 = this.e.getInt($$6);
         if ($$7 > 0) {
            $$1.accept(dgn.a($$6, $$7));
         }
      }

      ObjectIterator var10 = this.e.object2IntEntrySet().iterator();

      while (var10.hasNext()) {
         Entry<jg<dgn>> $$8 = (Entry<jg<dgn>>)var10.next();
         jg<dgn> $$9 = (jg<dgn>)$$8.getKey();
         if (!$$5.a($$9)) {
            $$1.accept(dgn.a((jg<dgn>)$$8.getKey(), $$8.getIntValue()));
         }
      }
   }

   private static <T> jk<T> a(@Nullable ji.a $$0, alj<jt<T>> $$1, axv<T> $$2) {
      if ($$0 != null) {
         Optional<jk.c<T>> $$3 = $$0.e($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jk.a();
   }

   public Set<jg<dgn>> a() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   public Set<Entry<jg<dgn>>> b() {
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
         return $$0 instanceof dgt $$1 ? this.e.equals($$1.e) : false;
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
      private final Object2IntOpenHashMap<jg<dgn>> a = new Object2IntOpenHashMap();

      public a(dgt $$0) {
         this.a.putAll($$0.e);
      }

      public void a(jg<dgn> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jg<dgn> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jg<dgn>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jg<dgn> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jg<dgn>> a() {
         return this.a.keySet();
      }

      public dgt b() {
         return new dgt(this.a);
      }
   }
}
