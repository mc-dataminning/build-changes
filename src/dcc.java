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

public class dcc implements czi {
   public static final dcc a = new dcc(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jq<dbw>>> e = Codec.unboundedMap(dbw.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<dcc> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, dcc::new)
   );
   public static final Codec<dcc> b = Codec.withAlternative(f, e, $$0 -> new dcc($$0, true));
   public static final zj<ww, dcc> c = zj.a(zh.a(Object2IntOpenHashMap::new, dbw.d, zh.h), $$0 -> $$0.g, zh.b, $$0 -> $$0.h, dcc::new);
   final Object2IntOpenHashMap<jq<dbw>> g;
   final boolean h;

   dcc(Object2IntOpenHashMap<jq<dbw>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jq<dbw>> $$2 = (Entry<jq<dbw>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jq<dbw> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cwb.b $$0, Consumer<xl> $$1, cxx $$2) {
      if (this.h) {
         js.a $$3 = $$0.a();
         ju<dbw> $$4 = a($$3, ma.aM, axg.a);

         for (jq<dbw> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(dbw.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jq<dbw>> $$7 = (Entry<jq<dbw>>)var9.next();
            jq<dbw> $$8 = (jq<dbw>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(dbw.a((jq<dbw>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> ju<T> a(@Nullable js.a $$0, alk<kd<T>> $$1, axt<T> $$2) {
      if ($$0 != null) {
         Optional<ju.c<T>> $$3 = $$0.d($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return ju.a();
   }

   public dcc a(boolean $$0) {
      return new dcc(this.g, $$0);
   }

   public Set<jq<dbw>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jq<dbw>>> b() {
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
         return !($$0 instanceof dcc $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jq<dbw>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(dcc $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jq<dbw> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jq<dbw> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jq<dbw>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jq<dbw> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jq<dbw>> a() {
         return this.a.keySet();
      }

      public dcc b() {
         return new dcc(this.a, this.b);
      }
   }
}
