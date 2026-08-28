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

public class dbs implements cyy {
   public static final dbs a = new dbs(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jp<dbm>>> e = Codec.unboundedMap(dbm.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<dbs> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, dbs::new)
   );
   public static final Codec<dbs> b = Codec.withAlternative(f, e, $$0 -> new dbs($$0, true));
   public static final zf<ws, dbs> c = zf.a(zd.a(Object2IntOpenHashMap::new, dbm.d, zd.h), $$0 -> $$0.g, zd.b, $$0 -> $$0.h, dbs::new);
   final Object2IntOpenHashMap<jp<dbm>> g;
   final boolean h;

   dbs(Object2IntOpenHashMap<jp<dbm>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jp<dbm>> $$2 = (Entry<jp<dbm>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jp<dbm> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cvt.b $$0, Consumer<xh> $$1, cxp $$2) {
      if (this.h) {
         jr.a $$3 = $$0.a();
         jt<dbm> $$4 = a($$3, ly.aM, axc.a);

         for (jp<dbm> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(dbm.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jp<dbm>> $$7 = (Entry<jp<dbm>>)var9.next();
            jp<dbm> $$8 = (jp<dbm>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(dbm.a((jp<dbm>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> jt<T> a(@Nullable jr.a $$0, alg<kc<T>> $$1, axp<T> $$2) {
      if ($$0 != null) {
         Optional<jt.c<T>> $$3 = $$0.d($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jt.a();
   }

   public dbs a(boolean $$0) {
      return new dbs(this.g, $$0);
   }

   public Set<jp<dbm>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jp<dbm>>> b() {
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
         return !($$0 instanceof dbs $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jp<dbm>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(dbs $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jp<dbm> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jp<dbm> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jp<dbm>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jp<dbm> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jp<dbm>> a() {
         return this.a.keySet();
      }

      public dbs b() {
         return new dbs(this.a, this.b);
      }
   }
}
