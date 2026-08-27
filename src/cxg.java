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

public class cxg implements cus {
   public static final cxg a = new cxg(new Object2IntLinkedOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(0, 255);
   private static final Codec<Object2IntLinkedOpenHashMap<in<cwz>>> e = Codec.unboundedMap(kt.f.r(), d)
      .xmap(Object2IntLinkedOpenHashMap::new, Function.identity());
   private static final Codec<cxg> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), awu.a(Codec.BOOL, "show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, cxg::new)
   );
   public static final Codec<cxg> b = awu.a(f, e, $$0 -> new cxg($$0, true));
   public static final yg<vt, cxg> c = yg.a(ye.a(Object2IntLinkedOpenHashMap::new, ye.b(ku.u), ye.f), $$0 -> $$0.g, ye.b, $$0 -> $$0.h, cxg::new);
   final Object2IntLinkedOpenHashMap<in<cwz>> g;
   final boolean h;

   cxg(Object2IntLinkedOpenHashMap<in<cwz>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a(cwz $$0) {
      return this.g.getInt($$0.k());
   }

   @Override
   public void a(Consumer<wi> $$0, cti $$1) {
      if (this.h) {
         ObjectBidirectionalIterator var3 = this.g.object2IntEntrySet().iterator();

         while (var3.hasNext()) {
            Entry<in<cwz>> $$2 = (Entry<in<cwz>>)var3.next();
            $$0.accept(((cwz)((in)$$2.getKey()).a()).d($$2.getIntValue()));
         }
      }
   }

   public Set<in<cwz>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<in<cwz>>> b() {
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
         return !($$0 instanceof cxg $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntLinkedOpenHashMap<in<cwz>> a = new Object2IntLinkedOpenHashMap();
      private final boolean b;

      public a(cxg $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(cwz $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0.k());
         } else {
            this.a.put($$0.k(), $$1);
         }
      }

      public void b(cwz $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0.k(), $$1, Integer::max);
         }
      }

      public void a(Predicate<in<cwz>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(cwz $$0) {
         return this.a.getOrDefault($$0.k(), 0);
      }

      public Set<in<cwz>> a() {
         return this.a.keySet();
      }

      public cxg b() {
         return new cxg(this.a, this.b);
      }
   }
}
