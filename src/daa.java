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

public class daa implements cxq {
   public static final daa a = new daa(new Object2IntOpenHashMap(), true);
   public static final int b = 255;
   private static final Codec<Integer> e = Codec.intRange(0, 255);
   private static final Codec<Object2IntOpenHashMap<ji<czv>>> f = Codec.unboundedMap(lp.f.r(), e).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<daa> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(f.fieldOf("levels").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.i))
            .apply($$0, daa::new)
   );
   public static final Codec<daa> c = Codec.withAlternative(g, f, $$0 -> new daa($$0, true));
   public static final zj<ww, daa> d = zj.a(zh.a(Object2IntOpenHashMap::new, zh.b(lq.u), zh.g), $$0 -> $$0.h, zh.b, $$0 -> $$0.i, daa::new);
   final Object2IntOpenHashMap<ji<czv>> h;
   final boolean i;

   daa(Object2IntOpenHashMap<ji<czv>> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
   }

   public int a(czv $$0) {
      return this.h.getInt($$0.m());
   }

   @Override
   public void a(cuf.b $$0, Consumer<xl> $$1, cwd $$2) {
      if (this.i) {
         jk.a $$3 = $$0.a();
         jm<czv> $$4 = a($$3, lq.u, awo.a);

         for (ji<czv> $$5 : $$4) {
            int $$6 = this.h.getInt($$5);
            if ($$6 > 0) {
               $$1.accept($$5.a().e($$6));
            }
         }

         ObjectIterator var9 = this.h.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<ji<czv>> $$7 = (Entry<ji<czv>>)var9.next();
            ji<czv> $$8 = (ji<czv>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept($$8.a().e($$7.getIntValue()));
            }
         }
      }
   }

   private static <T> jm<T> a(@Nullable jk.a $$0, ala<jv<T>> $$1, axb<T> $$2) {
      if ($$0 != null) {
         Optional<jm.c<T>> $$3 = $$0.b($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jm.a();
   }

   public daa a(boolean $$0) {
      return new daa(this.h, $$0);
   }

   public Set<ji<czv>> a() {
      return Collections.unmodifiableSet(this.h.keySet());
   }

   public Set<Entry<ji<czv>>> b() {
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
         return !($$0 instanceof daa $$1) ? false : this.i == $$1.i && this.h.equals($$1.h);
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
      private final Object2IntOpenHashMap<ji<czv>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(daa $$0) {
         this.a.putAll($$0.h);
         this.b = $$0.i;
      }

      public void a(czv $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0.m());
         } else {
            this.a.put($$0.m(), $$1);
         }
      }

      public void b(czv $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0.m(), $$1, Integer::max);
         }
      }

      public void a(Predicate<ji<czv>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(czv $$0) {
         return this.a.getOrDefault($$0.m(), 0);
      }

      public Set<ji<czv>> a() {
         return this.a.keySet();
      }

      public daa b() {
         return new daa(this.a, this.b);
      }
   }
}
