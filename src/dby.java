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

public class dby implements cze {
   public static final dby a = new dby(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jq<dbs>>> e = Codec.unboundedMap(dbs.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<dby> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, dby::new)
   );
   public static final Codec<dby> b = Codec.withAlternative(f, e, $$0 -> new dby($$0, true));
   public static final zg<wt, dby> c = zg.a(ze.a(Object2IntOpenHashMap::new, dbs.d, ze.h), $$0 -> $$0.g, ze.b, $$0 -> $$0.h, dby::new);
   final Object2IntOpenHashMap<jq<dbs>> g;
   final boolean h;

   dby(Object2IntOpenHashMap<jq<dbs>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jq<dbs>> $$2 = (Entry<jq<dbs>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jq<dbs> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cvx.b $$0, Consumer<xi> $$1, cxt $$2) {
      if (this.h) {
         js.a $$3 = $$0.a();
         ju<dbs> $$4 = a($$3, lz.aM, axd.a);

         for (jq<dbs> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(dbs.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jq<dbs>> $$7 = (Entry<jq<dbs>>)var9.next();
            jq<dbs> $$8 = (jq<dbs>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(dbs.a((jq<dbs>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> ju<T> a(@Nullable js.a $$0, alh<kd<T>> $$1, axq<T> $$2) {
      if ($$0 != null) {
         Optional<ju.c<T>> $$3 = $$0.d($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return ju.a();
   }

   public dby a(boolean $$0) {
      return new dby(this.g, $$0);
   }

   public Set<jq<dbs>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jq<dbs>>> b() {
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
         return !($$0 instanceof dby $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jq<dbs>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(dby $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jq<dbs> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jq<dbs> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jq<dbs>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jq<dbs> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jq<dbs>> a() {
         return this.a.keySet();
      }

      public dby b() {
         return new dby(this.a, this.b);
      }
   }
}
