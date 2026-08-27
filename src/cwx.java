import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Collections;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class cwx implements cuj {
   public static final cwx a = new cwx(new Object2IntLinkedOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(0, 255);
   public static final Codec<cwx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.unboundedMap(kr.f.r(), d).fieldOf("levels").forGetter($$0x -> $$0x.e),
               aws.a(Codec.BOOL, "show_in_tooltip", true).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, ($$0x, $$1) -> new cwx(new Object2IntLinkedOpenHashMap($$0x), $$1))
   );
   public static final ye<vr, cwx> c = ye.a(yc.a(Object2IntLinkedOpenHashMap::new, yc.b(ks.t), yc.f), $$0 -> $$0.e, yc.b, $$0 -> $$0.f, cwx::new);
   final Object2IntLinkedOpenHashMap<il<cwq>> e;
   final boolean f;

   cwx(Object2IntLinkedOpenHashMap<il<cwq>> $$0, boolean $$1) {
      this.e = $$0;
      this.f = $$1;
   }

   public int a(cwq $$0) {
      return this.e.getInt($$0.k());
   }

   @Override
   public void a(Consumer<wg> $$0, csz $$1) {
      if (this.f) {
         ObjectBidirectionalIterator var3 = this.e.object2IntEntrySet().iterator();

         while (var3.hasNext()) {
            Entry<il<cwq>> $$2 = (Entry<il<cwq>>)var3.next();
            $$0.accept(((cwq)((il)$$2.getKey()).a()).d($$2.getIntValue()));
         }
      }
   }

   public Set<il<cwq>> a() {
      return Collections.unmodifiableSet(this.e.keySet());
   }

   public Set<Entry<il<cwq>>> b() {
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
         return !($$0 instanceof cwx $$1) ? false : this.f == $$1.f && this.e.equals($$1.e);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.e.hashCode();
      return 31 * $$0 + (this.f ? 1 : 0);
   }

   @Override
   public String toString() {
      return "ItemEnchantments{enchantments=" + this.e + ", showInTooltip=" + this.f + "}";
   }

   public static class a {
      private final Object2IntLinkedOpenHashMap<il<cwq>> a = new Object2IntLinkedOpenHashMap();
      private final boolean b;

      public a(cwx $$0) {
         this.a.putAll($$0.e);
         this.b = $$0.f;
      }

      public void a(cwq $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0.k());
         } else {
            this.a.put($$0.k(), $$1);
         }
      }

      public void b(cwq $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0.k(), $$1, Integer::max);
         }
      }

      public void a(Predicate<il<cwq>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(cwq $$0) {
         return this.a.getOrDefault($$0.k(), 0);
      }

      public Set<il<cwq>> a() {
         return this.a.keySet();
      }

      public cwx b() {
         return new cwx(this.a, this.b);
      }
   }
}
