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

public class ddd implements czq {
   public static final ddd a = new ddd(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jr<dcx>>> e = Codec.unboundedMap(dcx.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<ddd> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, ddd::new)
   );
   public static final Codec<ddd> b = Codec.withAlternative(f, e, $$0 -> new ddd($$0, true));
   public static final ym<vz, ddd> c = ym.a(yk.a(Object2IntOpenHashMap::new, dcx.d, yk.h), $$0 -> $$0.g, yk.b, $$0 -> $$0.h, ddd::new);
   final Object2IntOpenHashMap<jr<dcx>> g;
   final boolean h;

   ddd(Object2IntOpenHashMap<jr<dcx>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jr<dcx>> $$2 = (Entry<jr<dcx>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jr<dcx> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cwj.b $$0, Consumer<wo> $$1, cyf $$2) {
      if (this.h) {
         jt.a $$3 = $$0.a();
         jv<dcx> $$4 = a($$3, mc.aO, awr.a);

         for (jr<dcx> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(dcx.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jr<dcx>> $$7 = (Entry<jr<dcx>>)var9.next();
            jr<dcx> $$8 = (jr<dcx>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(dcx.a((jr<dcx>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> jv<T> a(@Nullable jt.a $$0, akt<ke<T>> $$1, axe<T> $$2) {
      if ($$0 != null) {
         Optional<jv.c<T>> $$3 = $$0.d($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jv.a();
   }

   public ddd a(boolean $$0) {
      return new ddd(this.g, $$0);
   }

   public Set<jr<dcx>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jr<dcx>>> b() {
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
         return !($$0 instanceof ddd $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jr<dcx>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(ddd $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jr<dcx> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jr<dcx> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jr<dcx>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jr<dcx> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jr<dcx>> a() {
         return this.a.keySet();
      }

      public ddd b() {
         return new ddd(this.a, this.b);
      }
   }
}
