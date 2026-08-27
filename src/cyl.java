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

public class cyl implements cwd {
   public static final cyl a = new cyl(new Object2IntLinkedOpenHashMap(), true);
   public static final int b = 255;
   private static final Codec<Integer> e = Codec.intRange(0, 255);
   private static final Codec<Object2IntLinkedOpenHashMap<iw<cyg>>> f = Codec.unboundedMap(ld.f.r(), e)
      .xmap(Object2IntLinkedOpenHashMap::new, Function.identity());
   private static final Codec<cyl> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(f.fieldOf("levels").forGetter($$0x -> $$0x.h), axh.a(Codec.BOOL, "show_in_tooltip", true).forGetter($$0x -> $$0x.i))
            .apply($$0, cyl::new)
   );
   public static final Codec<cyl> c = axh.a(g, f, $$0 -> new cyl($$0, true));
   public static final ys<wf, cyl> d = ys.a(yq.a(Object2IntLinkedOpenHashMap::new, yq.b(le.u), yq.f), $$0 -> $$0.h, yq.b, $$0 -> $$0.i, cyl::new);
   final Object2IntLinkedOpenHashMap<iw<cyg>> h;
   final boolean i;

   cyl(Object2IntLinkedOpenHashMap<iw<cyg>> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public int a(cyg $$0) {
      return this.h.getInt($$0.l());
   }

   @Override
   public void a(Consumer<wu> $$0, cuq $$1) {
      if (this.i) {
         ObjectBidirectionalIterator var3 = this.h.object2IntEntrySet().iterator();

         while (var3.hasNext()) {
            Entry<iw<cyg>> $$2 = (Entry<iw<cyg>>)var3.next();
            $$0.accept(((cyg)((iw)$$2.getKey()).a()).e($$2.getIntValue()));
         }
      }
   }

   public cyl a(boolean $$0) {
      return new cyl(this.h, $$0);
   }

   public Set<iw<cyg>> a() {
      return Collections.unmodifiableSet(this.h.keySet());
   }

   public Set<Entry<iw<cyg>>> b() {
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
         return !($$0 instanceof cyl $$1) ? false : this.i == $$1.i && this.h.equals($$1.h);
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
      private final Object2IntLinkedOpenHashMap<iw<cyg>> a = new Object2IntLinkedOpenHashMap();
      private final boolean b;

      public a(cyl $$0) {
         this.a.putAll($$0.h);
         this.b = $$0.i;
      }

      public void a(cyg $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0.l());
         } else {
            this.a.put($$0.l(), $$1);
         }
      }

      public void b(cyg $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0.l(), $$1, Integer::max);
         }
      }

      public void a(Predicate<iw<cyg>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(cyg $$0) {
         return this.a.getOrDefault($$0.l(), 0);
      }

      public Set<iw<cyg>> a() {
         return this.a.keySet();
      }

      public cyl b() {
         return new cyl(this.a, this.b);
      }
   }
}
