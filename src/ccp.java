import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Streams;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ccp {
   @VisibleForTesting
   protected static final int a = 2;
   @VisibleForTesting
   protected static final int b = 150;
   private static final int f = 1;
   private int g = ati.b(ato.a(), 0, 2);
   int h;
   private static final Codec<Pair<UUID, Integer>> i = RecordCodecBuilder.create(
      $$0 -> $$0.group(iv.a.fieldOf("uuid").forGetter(Pair::getFirst), asq.i.fieldOf("anger").forGetter(Pair::getSecond)).apply($$0, Pair::of)
   );
   private final Predicate<bki> j;
   @VisibleForTesting
   protected final ArrayList<bki> c;
   private final ccp.a k;
   @VisibleForTesting
   protected final Object2IntMap<bki> d;
   @VisibleForTesting
   protected final Object2IntMap<UUID> e;

   public static Codec<ccp> a(Predicate<bki> $$0) {
      return RecordCodecBuilder.create(
         $$1 -> $$1.group(i.listOf().fieldOf("suspects").orElse(Collections.emptyList()).forGetter(ccp::b)).apply($$1, $$1x -> new ccp($$0, $$1x))
      );
   }

   public ccp(Predicate<bki> $$0, List<Pair<UUID, Integer>> $$1) {
      this.j = $$0;
      this.c = new ArrayList<>();
      this.k = new ccp.a(this);
      this.d = new Object2IntOpenHashMap();
      this.e = new Object2IntOpenHashMap($$1.size());
      $$1.forEach($$0x -> this.e.put((UUID)$$0x.getFirst(), (Integer)$$0x.getSecond()));
   }

   private List<Pair<UUID, Integer>> b() {
      return Streams.concat(
            new Stream[]{
               this.c.stream().map($$0 -> Pair.of($$0.cv(), this.d.getInt($$0))),
               this.e.object2IntEntrySet().stream().map($$0 -> Pair.of((UUID)$$0.getKey(), $$0.getIntValue()))
            }
         )
         .collect(Collectors.toList());
   }

   public void a(ama $$0, Predicate<bki> $$1) {
      this.g--;
      if (this.g <= 0) {
         this.a($$0);
         this.g = 2;
      }

      ObjectIterator<Entry<UUID>> $$2 = this.e.object2IntEntrySet().iterator();

      while ($$2.hasNext()) {
         Entry<UUID> $$3 = (Entry<UUID>)$$2.next();
         int $$4 = $$3.getIntValue();
         if ($$4 <= 1) {
            $$2.remove();
         } else {
            $$3.setValue($$4 - 1);
         }
      }

      ObjectIterator<Entry<bki>> $$5 = this.d.object2IntEntrySet().iterator();

      while ($$5.hasNext()) {
         Entry<bki> $$6 = (Entry<bki>)$$5.next();
         int $$7 = $$6.getIntValue();
         bki $$8 = (bki)$$6.getKey();
         bki.c $$9 = $$8.dH();
         if ($$7 > 1 && $$1.test($$8) && $$9 == null) {
            $$6.setValue($$7 - 1);
         } else {
            this.c.remove($$8);
            $$5.remove();
            if ($$7 > 1 && $$9 != null) {
               switch ($$9) {
                  case e:
                  case c:
                  case d:
                     this.e.put($$8.cv(), $$7 - 1);
               }
            }
         }
      }

      this.c();
   }

   private void c() {
      this.h = 0;
      this.c.sort(this.k);
      if (this.c.size() == 1) {
         this.h = this.d.getInt(this.c.get(0));
      }
   }

   private void a(ama $$0) {
      ObjectIterator<Entry<UUID>> $$1 = this.e.object2IntEntrySet().iterator();

      while ($$1.hasNext()) {
         Entry<UUID> $$2 = (Entry<UUID>)$$1.next();
         int $$3 = $$2.getIntValue();
         bki $$4 = $$0.a((UUID)$$2.getKey());
         if ($$4 != null) {
            this.d.put($$4, $$3);
            this.c.add($$4);
            $$1.remove();
         }
      }
   }

   public int a(bki $$0, int $$1) {
      boolean $$2 = !this.d.containsKey($$0);
      int $$3 = this.d.computeInt($$0, ($$1x, $$2x) -> Math.min(150, ($$2x == null ? 0 : $$2x) + $$1));
      if ($$2) {
         int $$4 = this.e.removeInt($$0.cv());
         $$3 += $$4;
         this.d.put($$0, $$3);
         this.c.add($$0);
      }

      this.c();
      return $$3;
   }

   public void a(bki $$0) {
      this.d.removeInt($$0);
      this.c.remove($$0);
      this.c();
   }

   @Nullable
   private bki d() {
      return this.c.stream().filter(this.j).findFirst().orElse(null);
   }

   public int b(@Nullable bki $$0) {
      return $$0 == null ? this.h : this.d.getInt($$0);
   }

   public Optional<bky> a() {
      return Optional.ofNullable(this.d()).filter($$0 -> $$0 instanceof bky).map($$0 -> (bky)$$0);
   }

   @VisibleForTesting
   protected static record a(ccp a) implements Comparator<bki> {
      public int a(bki $$0, bki $$1) {
         if ($$0.equals($$1)) {
            return 0;
         } else {
            int $$2 = this.a.d.getOrDefault($$0, 0);
            int $$3 = this.a.d.getOrDefault($$1, 0);
            this.a.h = Math.max(this.a.h, Math.max($$2, $$3));
            boolean $$4 = cco.a($$2).d();
            boolean $$5 = cco.a($$3).d();
            if ($$4 != $$5) {
               return $$4 ? -1 : 1;
            } else {
               boolean $$6 = $$0 instanceof cdm;
               boolean $$7 = $$1 instanceof cdm;
               if ($$6 != $$7) {
                  return $$6 ? -1 : 1;
               } else {
                  return Integer.compare($$3, $$2);
               }
            }
         }
      }
   }
}
