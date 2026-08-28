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

public class dde implements czr {
   public static final dde a = new dde(new Object2IntOpenHashMap(), true);
   private static final Codec<Integer> d = Codec.intRange(1, 255);
   private static final Codec<Object2IntOpenHashMap<jr<dcy>>> e = Codec.unboundedMap(dcy.c, d).xmap(Object2IntOpenHashMap::new, Function.identity());
   private static final Codec<dde> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.fieldOf("levels").forGetter($$0x -> $$0x.g), Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter($$0x -> $$0x.h))
            .apply($$0, dde::new)
   );
   public static final Codec<dde> b = Codec.withAlternative(f, e, $$0 -> new dde($$0, true));
   public static final yn<wa, dde> c = yn.a(yl.a(Object2IntOpenHashMap::new, dcy.d, yl.h), $$0 -> $$0.g, yl.b, $$0 -> $$0.h, dde::new);
   final Object2IntOpenHashMap<jr<dcy>> g;
   final boolean h;

   dde(Object2IntOpenHashMap<jr<dcy>> $$0, boolean $$1) {
      this.g = $$0;
      this.h = $$1;
      ObjectIterator var3 = $$0.object2IntEntrySet().iterator();

      while (var3.hasNext()) {
         Entry<jr<dcy>> $$2 = (Entry<jr<dcy>>)var3.next();
         int $$3 = $$2.getIntValue();
         if ($$3 < 0 || $$3 > 255) {
            throw new IllegalArgumentException("Enchantment " + $$2.getKey() + " has invalid level " + $$3);
         }
      }
   }

   public int a(jr<dcy> $$0) {
      return this.g.getInt($$0);
   }

   @Override
   public void a(cwk.b $$0, Consumer<wp> $$1, cyg $$2) {
      if (this.h) {
         jt.a $$3 = $$0.a();
         jv<dcy> $$4 = a($$3, mc.aO, aws.a);

         for (jr<dcy> $$5 : $$4) {
            int $$6 = this.g.getInt($$5);
            if ($$6 > 0) {
               $$1.accept(dcy.a($$5, $$6));
            }
         }

         ObjectIterator var9 = this.g.object2IntEntrySet().iterator();

         while (var9.hasNext()) {
            Entry<jr<dcy>> $$7 = (Entry<jr<dcy>>)var9.next();
            jr<dcy> $$8 = (jr<dcy>)$$7.getKey();
            if (!$$4.a($$8)) {
               $$1.accept(dcy.a((jr<dcy>)$$7.getKey(), $$7.getIntValue()));
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

   public dde a(boolean $$0) {
      return new dde(this.g, $$0);
   }

   public Set<jr<dcy>> a() {
      return Collections.unmodifiableSet(this.g.keySet());
   }

   public Set<Entry<jr<dcy>>> b() {
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
         return !($$0 instanceof dde $$1) ? false : this.h == $$1.h && this.g.equals($$1.g);
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
      private final Object2IntOpenHashMap<jr<dcy>> a = new Object2IntOpenHashMap();
      private final boolean b;

      public a(dde $$0) {
         this.a.putAll($$0.g);
         this.b = $$0.h;
      }

      public void a(jr<dcy> $$0, int $$1) {
         if ($$1 <= 0) {
            this.a.removeInt($$0);
         } else {
            this.a.put($$0, Math.min($$1, 255));
         }
      }

      public void b(jr<dcy> $$0, int $$1) {
         if ($$1 > 0) {
            this.a.merge($$0, Math.min($$1, 255), Integer::max);
         }
      }

      public void a(Predicate<jr<dcy>> $$0) {
         this.a.keySet().removeIf($$0);
      }

      public int a(jr<dcy> $$0) {
         return this.a.getOrDefault($$0, 0);
      }

      public Set<jr<dcy>> a() {
         return this.a.keySet();
      }

      public dde b() {
         return new dde(this.a, this.b);
      }
   }
}
