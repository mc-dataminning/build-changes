import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class bxw {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 2;
   private final Map<UUID, bxw.a> c = Maps.newHashMap();

   @axp
   public Map<UUID, Object2IntMap<bxx>> a() {
      Map<UUID, Object2IntMap<bxx>> $$0 = Maps.newHashMap();
      this.c.keySet().forEach($$1 -> {
         bxw.a $$2 = this.c.get($$1);
         $$0.put($$1, $$2.a);
      });
      return $$0;
   }

   public void b() {
      Iterator<bxw.a> $$0 = this.c.values().iterator();

      while ($$0.hasNext()) {
         bxw.a $$1 = $$0.next();
         $$1.a();
         if ($$1.b()) {
            $$0.remove();
         }
      }
   }

   private Stream<bxw.b> c() {
      return this.c.entrySet().stream().flatMap($$0 -> $$0.getValue().a($$0.getKey()));
   }

   private Collection<bxw.b> a(awt $$0, int $$1) {
      List<bxw.b> $$2 = this.c().toList();
      if ($$2.isEmpty()) {
         return Collections.emptyList();
      } else {
         int[] $$3 = new int[$$2.size()];
         int $$4 = 0;

         for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
            bxw.b $$6 = $$2.get($$5);
            $$4 += Math.abs($$6.a());
            $$3[$$5] = $$4 - 1;
         }

         Set<bxw.b> $$7 = Sets.newIdentityHashSet();

         for (int $$8 = 0; $$8 < $$1; $$8++) {
            int $$9 = $$0.a($$4);
            int $$10 = Arrays.binarySearch($$3, $$9);
            $$7.add($$2.get($$10 < 0 ? -$$10 - 1 : $$10));
         }

         return $$7;
      }
   }

   private bxw.a a(UUID $$0) {
      return this.c.computeIfAbsent($$0, $$0x -> new bxw.a());
   }

   public void a(bxw $$0, awt $$1, int $$2) {
      Collection<bxw.b> $$3 = $$0.a($$1, $$2);
      $$3.forEach($$0x -> {
         int $$1x = $$0x.e - $$0x.d.m;
         if ($$1x >= 2) {
            this.a($$0x.c).a.mergeInt($$0x.d, $$1x, bxw::a);
         }
      });
   }

   public int a(UUID $$0, Predicate<bxx> $$1) {
      bxw.a $$2 = this.c.get($$0);
      return $$2 != null ? $$2.a($$1) : 0;
   }

   public long a(bxx $$0, DoublePredicate $$1) {
      return this.c.values().stream().filter($$2 -> $$1.test((double)($$2.a.getOrDefault($$0, 0) * $$0.j))).count();
   }

   public void a(UUID $$0, bxx $$1, int $$2) {
      bxw.a $$3 = this.a($$0);
      $$3.a.mergeInt($$1, $$2, ($$1x, $$2x) -> this.a($$1, $$1x, $$2x));
      $$3.a($$1);
      if ($$3.b()) {
         this.c.remove($$0);
      }
   }

   public void b(UUID $$0, bxx $$1, int $$2) {
      this.a($$0, $$1, -$$2);
   }

   public void a(UUID $$0, bxx $$1) {
      bxw.a $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.b($$1);
         if ($$2.b()) {
            this.c.remove($$0);
         }
      }
   }

   public void a(bxx $$0) {
      Iterator<bxw.a> $$1 = this.c.values().iterator();

      while ($$1.hasNext()) {
         bxw.a $$2 = $$1.next();
         $$2.b($$0);
         if ($$2.b()) {
            $$1.remove();
         }
      }
   }

   public <T> T a(DynamicOps<T> $$0) {
      return (T)bxw.b.b.encodeStart($$0, this.c().toList()).resultOrPartial($$0x -> b.warn("Failed to serialize gossips: {}", $$0x)).orElseGet($$0::emptyList);
   }

   public void a(Dynamic<?> $$0) {
      bxw.b.b
         .decode($$0)
         .resultOrPartial($$0x -> b.warn("Failed to deserialize gossips: {}", $$0x))
         .stream()
         .flatMap($$0x -> ((List)$$0x.getFirst()).stream())
         .forEach($$0x -> this.a($$0x.c).a.put($$0x.d, $$0x.e));
   }

   private static int a(int $$0, int $$1) {
      return Math.max($$0, $$1);
   }

   private int a(bxx $$0, int $$1, int $$2) {
      int $$3 = $$1 + $$2;
      return $$3 > $$0.k ? Math.max($$0.k, $$1) : $$3;
   }

   static class a {
      final Object2IntMap<bxx> a = new Object2IntOpenHashMap();

      public int a(Predicate<bxx> $$0) {
         return this.a
            .object2IntEntrySet()
            .stream()
            .filter($$1 -> $$0.test((bxx)$$1.getKey()))
            .mapToInt($$0x -> $$0x.getIntValue() * ((bxx)$$0x.getKey()).j)
            .sum();
      }

      public Stream<bxw.b> a(UUID $$0) {
         return this.a.object2IntEntrySet().stream().map($$1 -> new bxw.b($$0, (bxx)$$1.getKey(), $$1.getIntValue()));
      }

      public void a() {
         ObjectIterator<Entry<bxx>> $$0 = this.a.object2IntEntrySet().iterator();

         while ($$0.hasNext()) {
            Entry<bxx> $$1 = (Entry<bxx>)$$0.next();
            int $$2 = $$1.getIntValue() - ((bxx)$$1.getKey()).l;
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

      public void a(bxx $$0) {
         int $$1 = this.a.getInt($$0);
         if ($$1 > $$0.k) {
            this.a.put($$0, $$0.k);
         }

         if ($$1 < 2) {
            this.b($$0);
         }
      }

      public void b(bxx $$0) {
         this.a.removeInt($$0);
      }
   }

   static record b(UUID c, bxx d, int e) {
      public static final Codec<bxw.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(je.a.fieldOf("Target").forGetter(bxw.b::b), bxx.n.fieldOf("Type").forGetter(bxw.b::c), avu.j.fieldOf("Value").forGetter(bxw.b::d))
               .apply($$0, bxw.b::new)
      );
      public static final Codec<List<bxw.b>> b = a.listOf();

      public int a() {
         return this.e * this.d.j;
      }

      public UUID b() {
         return this.c;
      }

      public bxx c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
