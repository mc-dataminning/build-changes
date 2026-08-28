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

public class ddx implements dan {
   public static final ddx a = new ddx(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jq<ddr>>> e = Codec.unboundedMap(ddr.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<ddx> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, ddx::new)
   );
   public static final Codec<ddx> b = Codec.withAlternative(f, e, $$0 -> new ddx($$0, true));
   public static final zt<xg, ddx> c = zt.a(zr.a(Object2IntOpenHashMap::new, ddr.d, zr.h), $$0 -> $$0.g, zr.b, $$0 -> $$0.h, ddx::new);
   final Object2IntOpenHashMap<jq<ddr>> g;
   final boolean h;

   ddx(Object2IntOpenHashMap<jq<ddr>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jq<ddr>> $$2 = (Entry<jq<ddr>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jq<ddr> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cxg.b $$0, Consumer<xv> $$1, czc $$2) {
      if (this.h) {
         js.a $$3 = $$0.a();
         ju<ddr> $$4 = a($$3, mb.aN, axx.a);

         for (jq<ddr> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(ddr.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jq<ddr>> $$7 = (Entry<jq<ddr>>)var9.next();
            jq<ddr> $$8 = (jq<ddr>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(ddr.a((jq<ddr>)$$7.getKey(), $$7.getIntValue()));
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

   public ddx a(boolean $$0) {
      return new ddx(this.g, $$0);
   }

   public Set<jq<ddr>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jq<ddr>>> b() {
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
         return !($$0 instanceof ddx $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jq<ddr>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(ddx $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jq<ddr> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jq<ddr> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jq<ddr>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jq<ddr> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jq<ddr>> a() {
         return this.a.keySet();
      }

      public ddx b() {
         return new ddx(this.a, this.b);
      }
   }
}
