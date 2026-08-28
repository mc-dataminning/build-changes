import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dbq implements cyw {
   public static final dbq a = new dbq(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jn<dbk>>> e = Codec.unboundedMap(dbk.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<dbq> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, dbq::new)
   );
   public static final Codec<dbq> b = Codec.withAlternative(f, e, $$0 -> new dbq($$0, true));
   public static final zb<wo, dbq> c = zb.a(yz.a(Object2IntOpenHashMap::new, dbk.d, yz.g), $$0 -> $$0.g, yz.b, $$0 -> $$0.h, dbq::new);
   final Object2IntOpenHashMap<jn<dbk>> g;
   final boolean h;

   dbq(Object2IntOpenHashMap<jn<dbk>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jn<dbk>> $$2 = (Entry<jn<dbk>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jn<dbk> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cvk.b $$0, Consumer<xd> $$1, cxh $$2) {
      if (this.h) {
         jp.a $$3 = $$0.a();
         jr<dbk> $$4 = a($$3, lv.aM, aww.a);

         for (jn<dbk> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(dbk.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jn<dbk>> $$7 = (Entry<jn<dbk>>)var9.next();
            jn<dbk> $$8 = (jn<dbk>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(dbk.a((jn<dbk>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> jr<T> a(@Nullable jp.a $$0, alb<ka<T>> $$1, axj<T> $$2) {
      if ($$0 != null) {
         Optional<jr.c<T>> $$3 = $$0.b($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jr.a();
   }

   public dbq a(boolean $$0) {
      return new dbq(this.g, $$0);
   }

   public Set<jn<dbk>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jn<dbk>>> b() {
      return Collections.unmodifiableSet(this.g.object2IntEntrySet());
   }

   public int c() {
      return this.g.size();
   }

   public boolean d() {
      return this.g.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof dbq $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.g.hashCode();
      return 31 * $$0 + (this.h ? 1 : 0);
   }

   @Override
   public String toString() {
      return "ItemEnchantments{enchantments=" + this.g + ", showInTooltip=" + this.h + "}";
   }

   public static class a {
      private final Object2IntOpenHashMap<jn<dbk>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(dbq $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jn<dbk> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jn<dbk> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jn<dbk>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jn<dbk> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jn<dbk>> a() {
         return this.a.keySet();
      }

      public dbq b() {
         return new dbq(this.a, this.b);
      }
   }
}
