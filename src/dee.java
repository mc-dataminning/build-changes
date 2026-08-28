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

public class dee implements dar {
   public static final dee a = new dee(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jq<ddy>>> e = Codec.unboundedMap(ddy.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<dee> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, dee::new)
   );
   public static final Codec<dee> b = Codec.withAlternative(f, e, $$0 -> new dee($$0, true));
   public static final zt<xg, dee> c = zt.a(zr.a(Object2IntOpenHashMap::new, ddy.d, zr.h), $$0 -> $$0.g, zr.b, $$0 -> $$0.h, dee::new);
   final Object2IntOpenHashMap<jq<ddy>> g;
   final boolean h;

   dee(Object2IntOpenHashMap<jq<ddy>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jq<ddy>> $$2 = (Entry<jq<ddy>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jq<ddy> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cxk.b $$0, Consumer<xv> $$1, czg $$2) {
      if (this.h) {
         js.a $$3 = $$0.a();
         ju<ddy> $$4 = a($$3, mb.aO, axx.a);

         for (jq<ddy> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(ddy.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jq<ddy>> $$7 = (Entry<jq<ddy>>)var9.next();
            jq<ddy> $$8 = (jq<ddy>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(ddy.a((jq<ddy>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> ju<T> a(@Nullable js.a $$0, aly<kd<T>> $$1, ayk<T> $$2) {
      if ($$0 != null) {
         Optional<ju.c<T>> $$3 = $$0.d($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return ju.a();
   }

   public dee a(boolean $$0) {
      return new dee(this.g, $$0);
   }

   public Set<jq<ddy>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jq<ddy>>> b() {
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
         return !($$0 instanceof dee $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jq<ddy>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(dee $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jq<ddy> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jq<ddy> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jq<ddy>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jq<ddy> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jq<ddy>> a() {
         return this.a.keySet();
      }

      public dee b() {
         return new dee(this.a, this.b);
      }
   }
}
