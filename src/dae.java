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

public class dae implements cxu {
   public static final dae a = new dae(new Object2IntOpenHashMap(), true);
   public static final int b = 255;
   private static final Codec<Integer> e = Codec.intRange(0, 255);
   private static final Codec<Object2IntOpenHashMap<ji<czz>>> f = Codec.unboundedMap(lp.f.r(), e).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<dae> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(f.fieldOf("levels").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.i))
            .apply($$0, dae::new)
   );
   public static final Codec<dae> c = Codec.withAlternative(g, f, $$0 -> new dae($$0, true));
   public static final zm<wz, dae> d = zm.a(zk.a(Object2IntOpenHashMap::new, zk.b(lq.u), zk.g), $$0 -> $$0.h, zk.b, $$0 -> $$0.i, dae::new);
   final Object2IntOpenHashMap<ji<czz>> h;
   final boolean i;

   dae(Object2IntOpenHashMap<ji<czz>> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<ji<czz>> $$2 = (Entry<ji<czz>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(czz $$0) {
      return this.h.getInt($$0.m());
   }

   @Override
   public void a(cuj.b $$0, Consumer<xo> $$1, cwh $$2) {
      if (this.i) {
         jk.a $$3 = $$0.a();
         jm<czz> $$4 = a($$3, lq.u, awr.a);

         for (ji<czz> $$5 : $$4) {
            int $$6 = this.h.getInt($$5);
            if ($$6 > 0) {
               $$1.accept($$5.a().e($$6));
            }
         }

         ObjectIterator var9 = this.h.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<ji<czz>> $$7 = (Entry<ji<czz>>)var9.next();
            ji<czz> $$8 = (ji<czz>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept($$8.a().e($$7.getIntValue()));
            }
         }
      }
   }

   private static <T> jm<T> a(@Nullable jk.a $$0, ald<jv<T>> $$1, axe<T> $$2) {
      if ($$0 != null) {
         Optional<jm.c<T>> $$3 = $$0.b($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jm.a();
   }

   public dae a(boolean $$0) {
      return new dae(this.h, $$0);
   }

   public Set<ji<czz>> a() {
      return Collections.unmodifiableSet(this.h.keySet());
   }

   public Set<Entry<ji<czz>>> b() {
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
         return !($$0 instanceof dae $$1) ? false : this.i == $$1.i && this.h.equals($$1.h);
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
      private final Object2IntOpenHashMap<ji<czz>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(dae $$0) {
         this.a.putAll($$0.h);
         this.b = $$0.i;
      }

      public void a(czz $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0.m());
         } else {
            this.a.put($$0.m(), Math.min($$1, 255));
         }
      }

      public void b(czz $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0.m(), Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<ji<czz>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(czz $$0) {
         return this.a.getOrDefault($$0.m(), 0);
      }

      public Set<ji<czz>> a() {
         return this.a.keySet();
      }

      public dae b() {
         return new dae(this.a, this.b);
      }
   }
}
