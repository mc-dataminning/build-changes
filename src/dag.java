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

public class dag implements cxw {
   public static final dag a = new dag(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(0, 255);
   private static final Codec<Object2IntOpenHashMap<jm<daa>>> e = Codec.unboundedMap(daa.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<dag> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, dag::new)
   );
   public static final Codec<dag> b = Codec.withAlternative(f, e, $$0 -> new dag($$0, true));
   public static final yw<wj, dag> c = yw.a(yu.a(Object2IntOpenHashMap::new, daa.d, yu.g), $$0 -> $$0.g, yu.b, $$0 -> $$0.h, dag::new);
   final Object2IntOpenHashMap<jm<daa>> g;
   final boolean h;

   dag(Object2IntOpenHashMap<jm<daa>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jm<daa>> $$2 = (Entry<jm<daa>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jm<daa> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cuj.b $$0, Consumer<wy> $$1, cwk $$2) {
      if (this.h) {
         jo.a $$3 = $$0.a();
         jq<daa> $$4 = a($$3, lu.aL, awg.a);

         for (jm<daa> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(daa.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jm<daa>> $$7 = (Entry<jm<daa>>)var9.next();
            jm<daa> $$8 = (jm<daa>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(daa.a((jm<daa>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> jq<T> a(@Nullable jo.a $$0, akp<jz<T>> $$1, awt<T> $$2) {
      if ($$0 != null) {
         Optional<jq.c<T>> $$3 = $$0.b($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jq.a();
   }

   public dag a(boolean $$0) {
      return new dag(this.g, $$0);
   }

   public Set<jm<daa>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jm<daa>>> b() {
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
         return !($$0 instanceof dag $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jm<daa>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(dag $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jm<daa> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jm<daa> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jm<daa>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jm<daa> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jm<daa>> a() {
         return this.a.keySet();
      }

      public dag b() {
         return new dag(this.a, this.b);
      }
   }
}
