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

public class dbt implements cyz {
   public static final dbt a = new dbt(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jo<dbn>>> e = Codec.unboundedMap(dbn.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<dbt> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, dbt::new)
   );
   public static final Codec<dbt> b = Codec.withAlternative(f, e, $$0 -> new dbt($$0, true));
   public static final zc<wp, dbt> c = zc.a(za.a(Object2IntOpenHashMap::new, dbn.d, za.h), $$0 -> $$0.g, za.b, $$0 -> $$0.h, dbt::new);
   final Object2IntOpenHashMap<jo<dbn>> g;
   final boolean h;

   dbt(Object2IntOpenHashMap<jo<dbn>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jo<dbn>> $$2 = (Entry<jo<dbn>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jo<dbn> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cvn.b $$0, Consumer<xe> $$1, cxk $$2) {
      if (this.h) {
         jq.a $$3 = $$0.a();
         js<dbn> $$4 = a($$3, lw.aN, awy.a);

         for (jo<dbn> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(dbn.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jo<dbn>> $$7 = (Entry<jo<dbn>>)var9.next();
            jo<dbn> $$8 = (jo<dbn>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(dbn.a((jo<dbn>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> js<T> a(@Nullable jq.a $$0, ald<kb<T>> $$1, axl<T> $$2) {
      if ($$0 != null) {
         Optional<js.c<T>> $$3 = $$0.d($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return js.a();
   }

   public dbt a(boolean $$0) {
      return new dbt(this.g, $$0);
   }

   public Set<jo<dbn>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jo<dbn>>> b() {
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
         return !($$0 instanceof dbt $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jo<dbn>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(dbt $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jo<dbn> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jo<dbn> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jo<dbn>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jo<dbn> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jo<dbn>> a() {
         return this.a.keySet();
      }

      public dbt b() {
         return new dbt(this.a, this.b);
      }
   }
}
