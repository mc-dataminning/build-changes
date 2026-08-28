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

public class ddw implements daj {
   public static final ddw a = new ddw(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jq<ddq>>> e = Codec.unboundedMap(ddq.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<ddw> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, ddw::new)
   );
   public static final Codec<ddw> b = Codec.withAlternative(f, e, $$0 -> new ddw($$0, true));
   public static final zi<wv, ddw> c = zi.a(zg.a(Object2IntOpenHashMap::new, ddq.d, zg.h), $$0 -> $$0.g, zg.b, $$0 -> $$0.h, ddw::new);
   final Object2IntOpenHashMap<jq<ddq>> g;
   final boolean h;

   ddw(Object2IntOpenHashMap<jq<ddq>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jq<ddq>> $$2 = (Entry<jq<ddq>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jq<ddq> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cxc.b $$0, Consumer<xk> $$1, cyy $$2) {
      if (this.h) {
         js.a $$3 = $$0.a();
         ju<ddq> $$4 = a($$3, mb.aO, axn.a);

         for (jq<ddq> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(ddq.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jq<ddq>> $$7 = (Entry<jq<ddq>>)var9.next();
            jq<ddq> $$8 = (jq<ddq>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(ddq.a((jq<ddq>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> ju<T> a(@Nullable js.a $$0, alo<kd<T>> $$1, aya<T> $$2) {
      if ($$0 != null) {
         Optional<ju.c<T>> $$3 = $$0.d($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return ju.a();
   }

   public ddw a(boolean $$0) {
      return new ddw(this.g, $$0);
   }

   public Set<jq<ddq>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jq<ddq>>> b() {
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
         return !($$0 instanceof ddw $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jq<ddq>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(ddw $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jq<ddq> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jq<ddq> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jq<ddq>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jq<ddq> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jq<ddq>> a() {
         return this.a.keySet();
      }

      public ddw b() {
         return new ddw(this.a, this.b);
      }
   }
}
