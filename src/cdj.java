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

public class cdj {
   private static final Logger b = LogUtils.getLogger();
   public static final int a = 2;
   private final Map<UUID, cdj.a> c = Maps.newHashMap();

   @baj
   public Map<UUID, Object2IntMap<cdk>> a() {
      Map<UUID, Object2IntMap<cdk>> $$0 = Maps.newHashMap();
      this.c.keySet().forEach($$1 -> {
         cdj.a $$2 = this.c.get($$1);
         $$0.put($$1, $$2.a);
      });
      return $$0;
   }

   public void b() {
      Iterator<cdj.a> $$0 = this.c.values().iterator();

      while ($$0.hasNext()) {
         cdj.a $$1 = $$0.next();
         $$1.a();
         if ($$1.b()) {
            $$0.remove();
         }
      }
   }

   private Stream<cdj.b> c() {
      return this.c.entrySet().stream().flatMap($$0 -> $$0.getValue().a($$0.getKey()));
   }

   private Collection<cdj.b> a(azl $$0, int $$1) {
      List<cdj.b> $$2 = this.c().toList();
      if ($$2.isEmpty()) {
         return Collections.emptyList();
      } else {
         int[] $$3 = new int[$$2.size()];
         int $$4 = 0;

         for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
            cdj.b $$6 = $$2.get($$5);
            $$4 += Math.abs($$6.a());
            $$3[$$5] = $$4 - 1;
         }

         Set<cdj.b> $$7 = Sets.newIdentityHashSet();

         for (int $$8 = 0; $$8 < $$1; $$8++) {
            int $$9 = $$0.a($$4);
            int $$10 = Arrays.binarySearch($$3, $$9);
            $$7.add($$2.get($$10 < 0 ? -$$10 - 1 : $$10));
         }

         return $$7;
      }
   }

   private cdj.a a(UUID $$0) {
      return this.c.computeIfAbsent($$0, $$0x -> new cdj.a());
   }

   public void a(cdj $$0, azl $$1, int $$2) {
      Collection<cdj.b> $$3 = $$0.a($$1, $$2);
      $$3.forEach($$0x -> {
         int $$1x = $$0x.e - $$0x.d.m;
         if ($$1x >= 2) {
            this.a($$0x.c).a.mergeInt($$0x.d, $$1x, cdj::a);
         }
      });
   }

   public int a(UUID $$0, Predicate<cdk> $$1) {
      cdj.a $$2 = this.c.get($$0);
      return $$2 != null ? $$2.a($$1) : 0;
   }

   public long a(cdk $$0, DoublePredicate $$1) {
      return this.c.values().stream().filter($$2 -> $$1.test((double)($$2.a.getOrDefault($$0, 0) * $$0.j))).count();
   }

   public void a(UUID $$0, cdk $$1, int $$2) {
      cdj.a $$3 = this.a($$0);
      $$3.a.mergeInt($$1, $$2, ($$1x, $$2x) -> this.a($$1, $$1x, $$2x));
      $$3.a($$1);
      if ($$3.b()) {
         this.c.remove($$0);
      }
   }

   public void b(UUID $$0, cdk $$1, int $$2) {
      this.a($$0, $$1, -$$2);
   }

   public void a(UUID $$0, cdk $$1) {
      cdj.a $$2 = this.c.get($$0);
      if ($$2 != null) {
         $$2.b($$1);
         if ($$2.b()) {
            this.c.remove($$0);
         }
      }
   }

   public void a(cdk $$0) {
      Iterator<cdj.a> $$1 = this.c.values().iterator();

      while ($$1.hasNext()) {
         cdj.a $$2 = $$1.next();
         $$2.b($$0);
         if ($$2.b()) {
            $$1.remove();
         }
      }
   }

   public <T> T a(DynamicOps<T> $$0) {
      return (T)cdj.b.b.encodeStart($$0, this.c().toList()).resultOrPartial($$0x -> b.warn("Failed to serialize gossips: {}", $$0x)).orElseGet($$0::emptyList);
   }

   public void a(Dynamic<?> $$0) {
      cdj.b.b
         .decode($$0)
         .resultOrPartial($$0x -> b.warn("Failed to deserialize gossips: {}", $$0x))
         .stream()
         .flatMap($$0x -> ((List)$$0x.getFirst()).stream())
         .forEach($$0x -> this.a($$0x.c).a.put($$0x.d, $$0x.e));
   }

   private static int a(int $$0, int $$1) {
      return Math.max($$0, $$1);
   }

   private int a(cdk $$0, int $$1, int $$2) {
      int $$3 = $$1 + $$2;
      return $$3 > $$0.k ? Math.max($$0.k, $$1) : $$3;
   }

   static class a {
      final Object2IntMap<cdk> a = new Object2IntOpenHashMap();

      public int a(Predicate<cdk> $$0) {
         return this.a
            .object2IntEntrySet()
            .stream()
            .filter($$1 -> $$0.test((cdk)$$1.getKey()))
            .mapToInt($$0x -> $$0x.getIntValue() * ((cdk)$$0x.getKey()).j)
            .sum();
      }

      public Stream<cdj.b> a(UUID $$0) {
         return this.a.object2IntEntrySet().stream().map($$1 -> new cdj.b($$0, (cdk)$$1.getKey(), $$1.getIntValue()));
      }

      public void a() {
         ObjectIterator<Entry<cdk>> $$0 = this.a.object2IntEntrySet().iterator();

         while ($$0.hasNext()) {
            Entry<cdk> $$1 = (Entry<cdk>)$$0.next();
            int $$2 = $$1.getIntValue() - ((cdk)$$1.getKey()).l;
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

      public void a(cdk $$0) {
         int $$1 = this.a.getInt($$0);
         if ($$1 > $$0.k) {
            this.a.put($$0, $$0.k);
         }

         if ($$1 < 2) {
            this.b($$0);
         }
      }

      public void b(cdk $$0) {
         this.a.removeInt($$0);
      }
   }

   static record b(UUID c, cdk d, int e) {
      public static final Codec<cdj.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(kh.a.fieldOf("Target").forGetter(cdj.b::b), cdk.n.fieldOf("Type").forGetter(cdj.b::c), aym.l.fieldOf("Value").forGetter(cdj.b::d))
               .apply($$0, cdj.b::new)
      );
      public static final Codec<List<cdj.b>> b = a.listOf();

      public int a() {
         return this.e * this.d.j;
      }

      public UUID b() {
         return this.c;
      }

      public cdk c() {
         return this.d;
      }

      public int d() {
         return this.e;
      }
   }
}
