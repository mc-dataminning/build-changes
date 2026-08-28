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

public class czr implements cxh {
   public static final czr a = new czr(new Object2IntOpenHashMap(), true);
   public static final int b = 255;
   private static final Codec<Integer> e = Codec.intRange(0, 255);
   private static final Codec<Object2IntOpenHashMap<jj<czl>>> f = Codec.unboundedMap(czl.b, e).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<czr> g = RecordCodecBuilder.create(
      $$0 -> $$0.group(f.fieldOf("levels").forGetter($$0x -> $$0x.h), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.i))
            .apply($$0, czr::new)
   );
   public static final Codec<czr> c = Codec.withAlternative(g, f, $$0 -> new czr($$0, true));
   public static final ys<wf, czr> d = ys.a(yq.a(Object2IntOpenHashMap::new, yq.b(lr.aK), yq.g), $$0 -> $$0.h, yq.b, $$0 -> $$0.i, czr::new);
   final Object2IntOpenHashMap<jj<czl>> h;
   final boolean i;

   czr(Object2IntOpenHashMap<jj<czl>> $$0, boolean $$1) {
      this.h = $$0;
      this.i = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jj<czl>> $$2 = (Entry<jj<czl>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jj<czl> $$0) {
      return this.h.getInt($$0);
   }

   @Override
   public void a(ctx.b $$0, Consumer<wu> $$1, cvv $$2) {
      if (this.i) {
         jl.a $$3 = $$0.a();
         jn<czl> $$4 = a($$3, lr.aK, avz.a);

         for (jj<czl> $$5 : $$4) {
            int $$6 = this.h.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(czl.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.h.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jj<czl>> $$7 = (Entry<jj<czl>>)var9.next();
            jj<czl> $$8 = (jj<czl>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(czl.a((jj<czl>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> jn<T> a(@Nullable jl.a $$0, akj<jw<T>> $$1, awm<T> $$2) {
      if ($$0 != null) {
         Optional<jn.c<T>> $$3 = $$0.b($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jn.a();
   }

   public czr a(boolean $$0) {
      return new czr(this.h, $$0);
   }

   public Set<jj<czl>> a() {
      return Collections.unmodifiableSet(this.h.keySet());
   }

   public Set<Entry<jj<czl>>> b() {
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
         return !($$0 instanceof czr $$1) ? false : this.i == $$1.i && this.h.equals($$1.h);
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
      private final Object2IntOpenHashMap<jj<czl>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(czr $$0) {
         this.a.putAll($$0.h);
         this.b = $$0.i;
      }

      public void a(jj<czl> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jj<czl> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jj<czl>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jj<czl> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jj<czl>> a() {
         return this.a.keySet();
      }

      public czr b() {
         return new czr(this.a, this.b);
      }
   }
}
