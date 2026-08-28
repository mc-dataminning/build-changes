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

public class dfl implements dbx {
   public static final dfl a = new dfl(new Object2IntOpenHashMap());
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   public static final Codec<dfl> b = Codec.unboundedMap(dff.c, d).xmap($$0 -> new dfl(new Object2IntOpenHashMap($$0)), $$0 -> $$0.e);
   public static final yu<wh, dfl> c = yu.a(ys.a(Object2IntOpenHashMap::new, dff.d, ys.h), $$0 -> $$0.e, dfl::new);
   final Object2IntOpenHashMap<je<dff>> e;

   dfl(Object2IntOpenHashMap<je<dff>> $$0) {
      this.e = $$0;
      ObjectIterator var2 = $$0.object2IntEntrySet().iterator();

      while (var2.hasNext()) {
         Entry<je<dff>> $$1 = (Entry<je<dff>>)var2.next();
         int $$2 = $$1.getIntValue();
         if ($$2 < 0 || $$2 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$1.getKey() + " has invalid level " + $$2);
         }
      }
   }

   public int a(je<dff> $$0) {
      return this.e.getInt($$0);
   }

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      jg.a $$4 = $$0.a();
      ji<dff> $$5 = a($$4, mg.aP, axc.a);

      for (je<dff> $$6 : $$5) {
         int $$7 = this.e.getInt($$6);
         if ($$7 > 0) {
            $$1.accept(dff.a($$6, $$7));
         }
      }

      ObjectIterator var10 = this.e.object2IntEntrySet().iterator();

      while (var10.hasNext()) {
         Entry<je<dff>> $$8 = (Entry<je<dff>>)var10.next();
         je<dff> $$9 = (je<dff>)$$8.getKey();
         if (!$$5.a($$9)) {
            $$1.accept(dff.a((je<dff>)$$8.getKey(), $$8.getIntValue()));
         }
      }
   }

   private static <T> ji<T> a(@Nullable jg.a $$0, ald<jr<T>> $$1, axp<T> $$2) {
      if ($$0 != null) {
         Optional<ji.c<T>> $$3 = $$0.e($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return ji.a();
   }

   public Set<je<dff>> a() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   public Set<Entry<je<dff>>> b() {
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
         return $$0 instanceof dfl $$1 ? this.e.equals($$1.e) : false;
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
      private final Object2IntOpenHashMap<je<dff>> a = new Object2IntOpenHashMap();

      public a(dfl $$0) {
         this.a.putAll($$0.e);
      }

      public void a(je<dff> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(je<dff> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<je<dff>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(je<dff> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<je<dff>> a() {
         return this.a.keySet();
      }

      public dfl b() {
         return new dfl(this.a);
      }
   }
}
