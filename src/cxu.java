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

public class cxu implements cvg {
   public static final cxu a = new cxu(new Object2IntLinkedOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(0, 255);
   private static final Codec<Object2IntLinkedOpenHashMap<iv<cxn>>> e = Codec.unboundedMap(lc.f.r(), d)
      .xmap(Object2IntLinkedOpenHashMap::new, Function.identity());
   private static final Codec<cxu> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), axe.a(Codec.BOOL, "show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, cxu::new)
   );
   public static final Codec<cxu> b = axe.a(f, e, $$0 -> new cxu($$0, true));
   public static final yq<wd, cxu> c = yq.a(yo.a(Object2IntLinkedOpenHashMap::new, yo.b(ld.u), yo.f), $$0 -> $$0.g, yo.b, $$0 -> $$0.h, cxu::new);
   final Object2IntLinkedOpenHashMap<iv<cxn>> g;
   final boolean h;

   cxu(Object2IntLinkedOpenHashMap<iv<cxn>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   public int a(cxn $$0) {
      return this.g.getInt($$0.k());
   }

   @Override
   public void a(Consumer<ws> $$0, ctu $$1) {
      if (this.h) {
         ObjectBidirectionalIterator var3 = this.g.object2IntEntrySet().iterator();

         while (var3.hasNext()) {
            Entry<iv<cxn>> $$2 = (Entry<iv<cxn>>)var3.next();
            $$0.accept(((cxn)((iv)$$2.getKey()).a()).d($$2.getIntValue()));
         }
      }
   }

   public Set<iv<cxn>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<iv<cxn>>> b() {
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
         return !($$0 instanceof cxu $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntLinkedOpenHashMap<iv<cxn>> a = new Object2IntLinkedOpenHashMap();
      private final boolean b;

      public a(cxu $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(cxn $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0.k());
         } else {
            this.a.put($$0.k(), $$1);
         }
      }

      public void b(cxn $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0.k(), $$1, Integer::max);
         }
      }

      public void a(Predicate<iv<cxn>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(cxn $$0) {
         return this.a.getOrDefault($$0.k(), 0);
      }

      public Set<iv<cxn>> a() {
         return this.a.keySet();
      }

      public cxu b() {
         return new cxu(this.a, this.b);
      }
   }
}
