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
   public static final int b = 255;
   private static final Codec<Integer> e = Codec.intRange(0, 255);
   private static final Codec<Object2IntOpenHashMap<ji<dab>>> f = Codec.unboundedMap(lp.f.r(), e).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<dag> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(f.fieldOf("levels").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.i))
            .apply($$0, dag::new)
   );
   public static final Codec<dag> c = Codec.withAlternative(g, f, $$0 -> new dag($$0, true));
   public static final zn<xa, dag> d = zn.a(zl.a(Object2IntOpenHashMap::new, zl.b(lq.u), zl.g), $$0 -> $$0.h, zl.b, $$0 -> $$0.i, dag::new);
   final Object2IntOpenHashMap<ji<dab>> h;
   final boolean i;

   dag(Object2IntOpenHashMap<ji<dab>> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<ji<dab>> $$2 = (Entry<ji<dab>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(dab $$0) {
      return this.h.getInt($$0.m());
   }

   @Override
   public void a(cul.b $$0, Consumer<xp> $$1, cwj $$2) {
      if (this.i) {
         jk.a $$3 = $$0.a();
         jm<dab> $$4 = a($$3, lq.u, aws.a);

         for (ji<dab> $$5 : $$4) {
            int $$6 = this.h.getInt($$5);
            if ($$6 > 0) {
               $$1.accept($$5.a().e($$6));
            }
         }

         ObjectIterator var9 = this.h.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<ji<dab>> $$7 = (Entry<ji<dab>>)var9.next();
            ji<dab> $$8 = (ji<dab>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept($$8.a().e($$7.getIntValue()));
            }
         }
      }
   }

   private static <T> jm<T> a(@Nullable jk.a $$0, ale<jv<T>> $$1, axf<T> $$2) {
      if ($$0 != null) {
         Optional<jm.c<T>> $$3 = $$0.b($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jm.a();
   }

   public dag a(boolean $$0) {
      return new dag(this.h, $$0);
   }

   public Set<ji<dab>> a() {
      return Collections.unmodifiableSet(this.h.keySet());
   }

   public Set<Entry<ji<dab>>> b() {
      return Collections.unmodifiableSet(this.h.object2IntEntrySet());
   }

   public int c() {
      return this.h.size();
   }

   public boolean d() {
      return this.h.isEmpty();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof dag $$1) ? false : this.i == $$1.i && this.h.equals($$1.h);
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.h.hashCode();
      return 31 * $$0 + (this.i ? 1 : 0);
   }

   @Override
   public String toString() {
      return "ItemEnchantments{enchantments=" + this.h + ", showInTooltip=" + this.i + "}";
   }

   public static class a {
      private final Object2IntOpenHashMap<ji<dab>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(dag $$0) {
         this.a.putAll($$0.h);
         this.b = $$0.i;
      }

      public void a(dab $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0.m());
         } else {
            this.a.put($$0.m(), Math.min($$1, 255));
         }
      }

      public void b(dab $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0.m(), Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<ji<dab>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(dab $$0) {
         return this.a.getOrDefault($$0.m(), 0);
      }

      public Set<ji<dab>> a() {
         return this.a.keySet();
      }

      public dag b() {
         return new dag(this.a, this.b);
      }
   }
}
