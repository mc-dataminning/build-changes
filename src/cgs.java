import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class cgs {
   public static final Codec<cgs> a = cgs.b.a.listOf().xmap(cgs::new, $$0 -> $$0.e().toList());
   public static final int b = 2;
   private final Map<UUID, cgs.a> c = new HashMap<>();

   public cgs() {
   }

   private cgs(List<cgs.b> $$0) {
      $$0.forEach($$0x -> this.a($$0x.b).a.put($$0x.c, $$0x.d));
   }

   @bax
   public Map<UUID, Object2IntMap<cgt>> a() {
      Map<UUID, Object2IntMap<cgt>> $$0 = Maps.newHashMap();
      this.c.keySet().forEach($$1 -> {
         cgs.a $$2 = this.c.get($$1);
         $$0.put($$1, $$2.a);
      });
      return $$0;
   }

   public void b() {
      Iterator<cgs.a> $$0 = this.c.values().iterator();

      while ($$0.hasNext()) {
         cgs.a $$1 = $$0.next();
         $$1.a();
         if ($$1.b()) {
            $$0.remove();
         }
      }
   }

   private Stream<cgs.b> e() {
      return this.c.entrySet().stream().flatMap($$0 -> $$0.getValue().a($$0.getKey()));
   }

   private Collection<cgs.b> a(azx $$0, int $$1) {
      List<cgs.b> $$2 = this.e().toList();
      if ($$2.isEmpty()) {
         return Collections.emptyList();
      } else {
         int[] $$3 = new int[$$2.size()];
         int $$4 = 0;

         for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
            cgs.b $$6 = $$2.get($$5);
            $$4 += Math.abs($$6.a());
            $$3[$$5] = $$4 - 1;
         }

         Set<cgs.b> $$7 = Sets.newIdentityHashSet();

         for (int $$8 = 0; $$8 < $$1; $$8++) {
            int $$9 = $$0.a($$4);
            int $$10 = Arrays.binarySearch($$3, $$9);
            $$7.add($$2.get($$10 < 0 ? -$$10 - 1 : $$10));
         }

         return $$7;
      }
   }

   private cgs.a a(UUID $$0) {
      return this.c.computeIfAbsent($$0, $$0x -> new cgs.a());
   }

   public void a(cgs $$0, azx $$1, int $$2) {
      Collection<cgs.b> $$3 = $$0.a($$1, $$2);
      $$3.forEach($$0x -> {
         int $$1x = $$0x.d - $$0x.c.m;
         if ($$1x >= 2) {
            this.a($$0x.b).a.mergeInt($$0x.c, $$1x, cgs::a);
         }
      });
   }

   public int a(UUID $$0, Predicate<cgt> $$1) {
      cgs.a $$2 = this.c.get($$0);
      return $$2 != null ? $$2.a($$1) : 0;
   }

   public long a(cgt $$0, DoublePredicate $$1) {
      return this.c.values().stream().filter($$2 -> $$1.test((double)($$2.a.getOrDefault($$0, 0) * $$0.j))).count();
   }

   public void a(UUID $$0, cgt $$1, int $$2) {
      cgs.a $$3 = this.a($$0);
      $$3.a.mergeInt($$1, $$2, ($$1x, $$2x) -> this.a($$1, $$1x, $$2x));
      $$3.a($$1);
      if ($$3.b()) {
         this.c.remove($$0);
      }
   }

   public void b(UUID $$0, cgt $$1, int $$2) {
      this.a($$0, $$1, -$$2);
   }

   public void a(UUID $$0, cgt $$1) {
      cgs.a $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.b($$1);
         if ($$2.b()) {
            this.c.remove($$0);
         }
      }
   }

   public void a(cgt $$0) {
      Iterator<cgs.a> $$1 = this.c.values().iterator();

      while ($$1.hasNext()) {
         cgs.a $$2 = $$1.next();
         $$2.b($$0);
         if ($$2.b()) {
            $$1.remove();
         }
      }
   }

   public void c() {
      this.c.clear();
   }

   public void a(cgs $$0) {
      $$0.c.forEach(($$0x, $$1) -> this.a($$0x).a.putAll($$1.a));
   }

   private static int a(int $$0, int $$1) {
      return Math.max($$0, $$1);
   }

   private int a(cgt $$0, int $$1, int $$2) {
      int $$3 = $$1 + $$2;
      return $$3 > $$0.k ? Math.max($$0.k, $$1) : $$3;
   }

   public cgs d() {
      cgs $$0 = new cgs();
      $$0.a(this);
      return $$0;
   }

   static class a {
      final Object2IntMap<cgt> a = new Object2IntOpenHashMap();

      public int a(Predicate<cgt> $$0) {
         return this.a
            .object2IntEntrySet()
            .stream()
            .filter($$1 -> $$0.test((cgt)$$1.getKey()))
            .mapToInt($$0x -> $$0x.getIntValue() * ((cgt)$$0x.getKey()).j)
            .sum();
      }

      public Stream<cgs.b> a(UUID $$0) {
         return this.a.object2IntEntrySet().stream().map($$1 -> new cgs.b($$0, (cgt)$$1.getKey(), $$1.getIntValue()));
      }

      public void a() {
         ObjectIterator<Entry<cgt>> $$0 = this.a.object2IntEntrySet().iterator();

         while ($$0.hasNext()) {
            Entry<cgt> $$1 = (Entry<cgt>)$$0.next();
            int $$2 = $$1.getIntValue() - ((cgt)$$1.getKey()).l;
            if ($$2 < 2) {
               $$0.remove();
            } else {
               $$1.setValue($$2);
            }
         }
      }

      public boolean b() {
         return this.a.isEmpty();
      }

      public void a(cgt $$0) {
         int $$1 = this.a.getInt($$0);
         if ($$1 > $$0.k) {
            this.a.put($$0, $$0.k);
         }

         if ($$1 < 2) {
            this.b($$0);
         }
      }

      public void b(cgt $$0) {
         this.a.removeInt($$0);
      }
   }

   static record b(UUID b, cgt c, int d) {
      public static final Codec<cgs.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(jz.a.fieldOf("Target").forGetter(cgs.b::b), cgt.n.fieldOf("Type").forGetter(cgs.b::c), ayw.m.fieldOf("Value").forGetter(cgs.b::d))
               .apply($$0, cgs.b::new)
      );

      public int a() {
         return this.d * this.c.j;
      }
   }
}
