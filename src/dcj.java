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

public class dcj implements czp {
   public static final dcj a = new dcj(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jq<dcd>>> e = Codec.unboundedMap(dcd.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<dcj> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, dcj::new)
   );
   public static final Codec<dcj> b = Codec.withAlternative(f, e, $$0 -> new dcj($$0, true));
   public static final zh<wu, dcj> c = zh.a(zf.a(Object2IntOpenHashMap::new, dcd.d, zf.h), $$0 -> $$0.g, zf.b, $$0 -> $$0.h, dcj::new);
   final Object2IntOpenHashMap<jq<dcd>> g;
   final boolean h;

   dcj(Object2IntOpenHashMap<jq<dcd>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jq<dcd>> $$2 = (Entry<jq<dcd>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jq<dcd> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cwi.b $$0, Consumer<xj> $$1, cye $$2) {
      if (this.h) {
         js.a $$3 = $$0.a();
         ju<dcd> $$4 = a($$3, ma.aM, axf.a);

         for (jq<dcd> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(dcd.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jq<dcd>> $$7 = (Entry<jq<dcd>>)var9.next();
            jq<dcd> $$8 = (jq<dcd>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(dcd.a((jq<dcd>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> ju<T> a(@Nullable js.a $$0, ali<kd<T>> $$1, axs<T> $$2) {
      if ($$0 != null) {
         Optional<ju.c<T>> $$3 = $$0.d($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return ju.a();
   }

   public dcj a(boolean $$0) {
      return new dcj(this.g, $$0);
   }

   public Set<jq<dcd>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jq<dcd>>> b() {
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
         return !($$0 instanceof dcj $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jq<dcd>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(dcj $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jq<dcd> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jq<dcd> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jq<dcd>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jq<dcd> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jq<dcd>> a() {
         return this.a.keySet();
      }

      public dcj b() {
         return new dcj(this.a, this.b);
      }
   }
}
