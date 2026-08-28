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

public class ddf implements czs {
   public static final ddf a = new ddf(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jr<dcz>>> e = Codec.unboundedMap(dcz.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<ddf> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, ddf::new)
   );
   public static final Codec<ddf> b = Codec.withAlternative(f, e, $$0 -> new ddf($$0, true));
   public static final yn<wa, ddf> c = yn.a(yl.a(Object2IntOpenHashMap::new, dcz.d, yl.h), $$0 -> $$0.g, yl.b, $$0 -> $$0.h, ddf::new);
   final Object2IntOpenHashMap<jr<dcz>> g;
   final boolean h;

   ddf(Object2IntOpenHashMap<jr<dcz>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jr<dcz>> $$2 = (Entry<jr<dcz>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jr<dcz> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cwl.b $$0, Consumer<wp> $$1, cyh $$2) {
      if (this.h) {
         jt.a $$3 = $$0.a();
         jv<dcz> $$4 = a($$3, mc.aO, aws.a);

         for (jr<dcz> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(dcz.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jr<dcz>> $$7 = (Entry<jr<dcz>>)var9.next();
            jr<dcz> $$8 = (jr<dcz>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(dcz.a((jr<dcz>)$$7.getKey(), $$7.getIntValue()));
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

   public ddf a(boolean $$0) {
      return new ddf(this.g, $$0);
   }

   public Set<jr<dcz>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jr<dcz>>> b() {
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
         return !($$0 instanceof ddf $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jr<dcz>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(ddf $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jr<dcz> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jr<dcz> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jr<dcz>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jr<dcz> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jr<dcz>> a() {
         return this.a.keySet();
      }

      public ddf b() {
         return new ddf(this.a, this.b);
      }
   }
}
