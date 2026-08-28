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

public class ddg implements czt {
   public static final ddg a = new ddg(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jr<dda>>> e = Codec.unboundedMap(dda.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<ddg> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, ddg::new)
   );
   public static final Codec<ddg> b = Codec.withAlternative(f, e, $$0 -> new ddg($$0, true));
   public static final yn<wa, ddg> c = yn.a(yl.a(Object2IntOpenHashMap::new, dda.d, yl.h), $$0 -> $$0.g, yl.b, $$0 -> $$0.h, ddg::new);
   final Object2IntOpenHashMap<jr<dda>> g;
   final boolean h;

   ddg(Object2IntOpenHashMap<jr<dda>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jr<dda>> $$2 = (Entry<jr<dda>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jr<dda> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cwm.b $$0, Consumer<wp> $$1, cyi $$2) {
      if (this.h) {
         jt.a $$3 = $$0.a();
         jv<dda> $$4 = a($$3, mc.aO, aws.a);

         for (jr<dda> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(dda.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jr<dda>> $$7 = (Entry<jr<dda>>)var9.next();
            jr<dda> $$8 = (jr<dda>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(dda.a((jr<dda>)$$7.getKey(), $$7.getIntValue()));
            }
         }
      }
   }

   private static <T> jv<T> a(@Nullable jt.a $$0, aku<ke<T>> $$1, axf<T> $$2) {
      if ($$0 != null) {
         Optional<jv.c<T>> $$3 = $$0.d($$1).a($$2);
         if ($$3.isPresent()) {
            return $$3.get();
         }
      }

      return jv.a();
   }

   public ddg a(boolean $$0) {
      return new ddg(this.g, $$0);
   }

   public Set<jr<dda>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jr<dda>>> b() {
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
         return !($$0 instanceof ddg $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jr<dda>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(ddg $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jr<dda> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jr<dda> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jr<dda>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jr<dda> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jr<dda>> a() {
         return this.a.keySet();
      }

      public ddg b() {
         return new ddg(this.a, this.b);
      }
   }
}
