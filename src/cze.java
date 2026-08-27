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

public class cze implements cwu {
   public static final cze a = new cze(new Object2IntLinkedOpenHashMap(), true);
   public static final int b = 255;
   private static final Codec<Integer> e = Codec.intRange(0, 255);
   private static final Codec<Object2IntLinkedOpenHashMap<ix<cyz>>> f = Codec.unboundedMap(le.f.r(), e)
      .xmap(Object2IntLinkedOpenHashMap::new, Function.identity());
   private static final Codec<cze> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(f.fieldOf("levels").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.i))
            .apply($$0, cze::new)
   );
   public static final Codec<cze> c = Codec.withAlternative(g, f, $$0 -> new cze($$0, true));
   public static final yv<wi, cze> d = yv.a(yt.a(Object2IntLinkedOpenHashMap::new, yt.b(lf.u), yt.f), $$0 -> $$0.h, yt.b, $$0 -> $$0.i, cze::new);
   final Object2IntLinkedOpenHashMap<ix<cyz>> h;
   final boolean i;

   cze(Object2IntLinkedOpenHashMap<ix<cyz>> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public int a(cyz $$0) {
      return this.h.getInt($$0.m());
   }

   @Override
   public void a(Consumer<wx> $$0, cvh $$1) {
      if (this.i) {
         ObjectBidirectionalIterator var3 = this.h.object2IntEntrySet().iterator();

         while (var3.hasNext()) {
            Entry<ix<cyz>> $$2 = (Entry<ix<cyz>>)var3.next();
            $$0.accept(((cyz)((ix)$$2.getKey()).a()).e($$2.getIntValue()));
         }
      }
   }

   public cze a(boolean $$0) {
      return new cze(this.h, $$0);
   }

   public Set<ix<cyz>> a() {
      return Collections.unmodifiableSet(this.h.keySet());
   }

   public Set<Entry<ix<cyz>>> b() {
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
         return !($$0 instanceof cze $$1) ? false : this.i == $$1.i && this.h.equals($$1.h);
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
      private final Object2IntLinkedOpenHashMap<ix<cyz>> a = new Object2IntLinkedOpenHashMap();
      private final boolean b;

      public a(cze $$0) {
         this.a.putAll($$0.h);
         this.b = $$0.i;
      }

      public void a(cyz $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0.m());
         } else {
            this.a.put($$0.m(), $$1);
         }
      }

      public void b(cyz $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0.m(), $$1, Integer::max);
         }
      }

      public void a(Predicate<ix<cyz>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(cyz $$0) {
         return this.a.getOrDefault($$0.m(), 0);
      }

      public Set<ix<cyz>> a() {
         return this.a.keySet();
      }

      public cze b() {
         return new cze(this.a, this.b);
      }
   }
}
