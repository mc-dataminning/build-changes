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

public class def implements das {
   public static final def a = new def(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jq<ddz>>> e = Codec.unboundedMap(ddz.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<def> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, def::new)
   );
   public static final Codec<def> b = Codec.withAlternative(f, e, $$0 -> new def($$0, true));
   public static final zt<xg, def> c = zt.a(zr.a(Object2IntOpenHashMap::new, ddz.d, zr.h), $$0 -> $$0.g, zr.b, $$0 -> $$0.h, def::new);
   final Object2IntOpenHashMap<jq<ddz>> g;
   final boolean h;

   def(Object2IntOpenHashMap<jq<ddz>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jq<ddz>> $$2 = (Entry<jq<ddz>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jq<ddz> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cxl.b $$0, Consumer<xv> $$1, czh $$2) {
      if (this.h) {
         js.a $$3 = $$0.a();
         ju<ddz> $$4 = a($$3, mb.aO, axx.a);

         for (jq<ddz> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(ddz.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jq<ddz>> $$7 = (Entry<jq<ddz>>)var9.next();
            jq<ddz> $$8 = (jq<ddz>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(ddz.a((jq<ddz>)$$7.getKey(), $$7.getIntValue()));
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

   public def a(boolean $$0) {
      return new def(this.g, $$0);
   }

   public Set<jq<ddz>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jq<ddz>>> b() {
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
         return !($$0 instanceof def $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jq<ddz>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(def $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jq<ddz> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jq<ddz> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jq<ddz>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jq<ddz> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jq<ddz>> a() {
         return this.a.keySet();
      }

      public def b() {
         return new def(this.a, this.b);
      }
   }
}
