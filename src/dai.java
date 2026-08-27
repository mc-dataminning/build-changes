import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Collections;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class dai implements cxx {
   public static final dai a = new dai(new Object2IntLinkedOpenHashMap(), true);
   public static final int b = 255;
   private static final Codec<Integer> e = Codec.intRange(0, 255);
   private static final Codec<Object2IntLinkedOpenHashMap<ja<dad>>> f = Codec.unboundedMap(lh.f.r(), e)
      .xmap(Object2IntLinkedOpenHashMap::new, Function.identity());
   private static final Codec<dai> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(f.fieldOf("levels").forGetter($$0x -> $$0x.h), axu.a(Codec.BOOL, "show_in_tooltip", true).forGetter($$0x -> $$0x.i))
            .apply($$0, dai::new)
   );
   public static final Codec<dai> c = axu.a(g, f, $$0 -> new dai($$0, true));
   public static final zc<wp, dai> d = zc.a(za.a(Object2IntLinkedOpenHashMap::new, za.b(li.u), za.g), $$0 -> $$0.h, za.b, $$0 -> $$0.i, dai::new);
   final Object2IntLinkedOpenHashMap<ja<dad>> h;
   final boolean i;

   dai(Object2IntLinkedOpenHashMap<ja<dad>> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public int a(dad $$0) {
      return this.h.getInt($$0.l());
   }

   @Override
   public void a(Consumer<xe> $$0, cwi $$1) {
      if (this.i) {
         ObjectBidirectionalIterator var3 = this.h.object2IntEntrySet().iterator();

         while (var3.hasNext()) {
            Entry<ja<dad>> $$2 = (Entry<ja<dad>>)var3.next();
            $$0.accept(((dad)((ja)$$2.getKey()).a()).e($$2.getIntValue()));
         }
      }
   }

   public dai a(boolean $$0) {
      return new dai(this.h, $$0);
   }

   public Set<ja<dad>> a() {
      return Collections.unmodifiableSet(this.h.keySet());
   }

   public Set<Entry<ja<dad>>> b() {
      return Collections.unmodifiableSet(this.h.object2IntEntrySet());
   }

   public int c() {
      return this.h.size();
   }

   public boolean d() {
      return this.h.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof dai $$1) ? false : this.i == $$1.i && this.h.equals($$1.h);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.h.hashCode();
      return 31 * $$0 + (this.i ? 1 : 0);
   }

   @Override
   public String toString() {
      return "ItemEnchantments{enchantments=" + this.h + ", showInTooltip=" + this.i + "}";
   }

   public static class a {
      private final Object2IntLinkedOpenHashMap<ja<dad>> a = new Object2IntLinkedOpenHashMap();
      private final boolean b;

      public a(dai $$0) {
         this.a.putAll($$0.h);
         this.b = $$0.i;
      }

      public void a(dad $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0.l());
         } else {
            this.a.put($$0.l(), $$1);
         }
      }

      public void b(dad $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0.l(), $$1, Integer::max);
         }
      }

      public void a(Predicate<ja<dad>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(dad $$0) {
         return this.a.getOrDefault($$0.l(), 0);
      }

      public Set<ja<dad>> a() {
         return this.a.keySet();
      }

      public dai b() {
         return new dai(this.a, this.b);
      }
   }
}
