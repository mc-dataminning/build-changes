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

public class czg implements cww {
   public static final czg a = new czg(new Object2IntLinkedOpenHashMap(), true);
   public static final int b = 255;
   private static final Codec<Integer> e = Codec.intRange(0, 255);
   private static final Codec<Object2IntLinkedOpenHashMap<ix<czb>>> f = Codec.unboundedMap(le.f.r(), e)
      .xmap(Object2IntLinkedOpenHashMap::new, Function.identity());
   private static final Codec<czg> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(f.fieldOf("levels").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.i))
            .apply($$0, czg::new)
   );
   public static final Codec<czg> c = Codec.withAlternative(g, f, $$0 -> new czg($$0, true));
   public static final yv<wi, czg> d = yv.a(yt.a(Object2IntLinkedOpenHashMap::new, yt.b(lf.u), yt.f), $$0 -> $$0.h, yt.b, $$0 -> $$0.i, czg::new);
   final Object2IntLinkedOpenHashMap<ix<czb>> h;
   final boolean i;

   czg(Object2IntLinkedOpenHashMap<ix<czb>> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public int a(czb $$0) {
      return this.h.getInt($$0.m());
   }

   @Override
   public void a(Consumer<wx> $$0, cvj $$1) {
      if (this.i) {
         ObjectBidirectionalIterator var3 = this.h.object2IntEntrySet().iterator();

         while (var3.hasNext()) {
            Entry<ix<czb>> $$2 = (Entry<ix<czb>>)var3.next();
            $$0.accept(((czb)((ix)$$2.getKey()).a()).e($$2.getIntValue()));
         }
      }
   }

   public czg a(boolean $$0) {
      return new czg(this.h, $$0);
   }

   public Set<ix<czb>> a() {
      return Collections.unmodifiableSet(this.h.keySet());
   }

   public Set<Entry<ix<czb>>> b() {
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
         return !($$0 instanceof czg $$1) ? false : this.i == $$1.i && this.h.equals($$1.h);
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
      private final Object2IntLinkedOpenHashMap<ix<czb>> a = new Object2IntLinkedOpenHashMap();
      private final boolean b;

      public a(czg $$0) {
         this.a.putAll($$0.h);
         this.b = $$0.i;
      }

      public void a(czb $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0.m());
         } else {
            this.a.put($$0.m(), $$1);
         }
      }

      public void b(czb $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0.m(), $$1, Integer::max);
         }
      }

      public void a(Predicate<ix<czb>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(czb $$0) {
         return this.a.getOrDefault($$0.m(), 0);
      }

      public Set<ix<czb>> a() {
         return this.a.keySet();
      }

      public czg b() {
         return new czg(this.a, this.b);
      }
   }
}
