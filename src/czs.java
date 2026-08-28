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

public class czs implements cxi {
   public static final czs a = new czs(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(0, 255);
   private static final Codec<Object2IntOpenHashMap<jj<czm>>> e = Codec.unboundedMap(czm.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<czs> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, czs::new)
   );
   public static final Codec<czs> b = Codec.withAlternative(f, e, $$0 -> new czs($$0, true));
   public static final ys<wf, czs> c = ys.a(yq.a(Object2IntOpenHashMap::new, czm.d, yq.g), $$0 -> $$0.g, yq.b, $$0 -> $$0.h, czs::new);
   final Object2IntOpenHashMap<jj<czm>> g;
   final boolean h;

   czs(Object2IntOpenHashMap<jj<czm>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jj<czm>> $$2 = (Entry<jj<czm>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jj<czm> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cty.b $$0, Consumer<wu> $$1, cvw $$2) {
      if (this.h) {
         jl.a $$3 = $$0.a();
         jn<czm> $$4 = a($$3, lr.aK, avz.a);

         for (jj<czm> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(czm.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jj<czm>> $$7 = (Entry<jj<czm>>)var9.next();
            jj<czm> $$8 = (jj<czm>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(czm.a((jj<czm>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> jn<T> a(@Nullable jl.a $$0, akj<jw<T>> $$1, awm<T> $$2) {
      if ($$0 != null) {
         Optional<jn.c<T>> $$3 = $$0.b($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jn.a();
   }

   public czs a(boolean $$0) {
      return new czs(this.g, $$0);
   }

   public Set<jj<czm>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jj<czm>>> b() {
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
         return !($$0 instanceof czs $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jj<czm>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(czs $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jj<czm> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jj<czm> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jj<czm>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jj<czm> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jj<czm>> a() {
         return this.a.keySet();
      }

      public czs b() {
         return new czs(this.a, this.b);
      }
   }
}
