import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dkw extends ezc {
   private static final int c = 4;
   private static final Logger d = LogUtils.getLogger();
   private static final Codec<Pair<dje, asa>> e = Codec.mapPair(dje.a.fieldOf("chunk_pos"), asa.a).codec();
   public static final Codec<dkw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(e.listOf().optionalFieldOf("tickets", List.of()).forGetter(dkw::h)).apply($$0, dkw::a)
   );
   public static final ezd<dkw> b = new ezd<>("chunks", dkw::new, a, bbf.i);
   private final Long2ObjectOpenHashMap<List<asa>> f;
   private final Long2ObjectOpenHashMap<List<asa>> g;
   private LongSet h = new LongOpenHashSet();
   @Nullable
   private dkw.a i;
   @Nullable
   private dkw.a j;

   private dkw(Long2ObjectOpenHashMap<List<asa>> $$0, Long2ObjectOpenHashMap<List<asa>> $$1) {
      this.f = $$0;
      this.g = $$1;
      this.i();
   }

   public dkw() {
      this(new Long2ObjectOpenHashMap(4), new Long2ObjectOpenHashMap());
   }

   private static dkw a(List<Pair<dje, asa>> $$0) {
      Long2ObjectOpenHashMap<List<asa>> $$1 = new Long2ObjectOpenHashMap();

      for (Pair<dje, asa> $$2 : $$0) {
         dje $$3 = (dje)$$2.getFirst();
         List<asa> $$4 = (List<asa>)$$1.computeIfAbsent($$3.a(), $$0x -> new ObjectArrayList(4));
         $$4.add((asa)$$2.getSecond());
      }

      return new dkw(new Long2ObjectOpenHashMap(4), $$1);
   }

   private List<Pair<dje, asa>> h() {
      List<Pair<dje, asa>> $$0 = new ArrayList<>();
      this.a((BiConsumer<dje, asa>)(($$1, $$2) -> {
         if ($$2.a().e()) {
            $$0.add(new Pair($$1, $$2));
         }
      }));
      return $$0;
   }

   private void a(BiConsumer<dje, asa> $$0) {
      a($$0, this.f);
      a($$0, this.g);
   }

   private static void a(BiConsumer<dje, asa> $$0, Long2ObjectOpenHashMap<List<asa>> $$1) {
      ObjectIterator var2 = Long2ObjectMaps.fastIterable($$1).iterator();

      while (var2.hasNext()) {
         Entry<List<asa>> $$2 = (Entry<List<asa>>)var2.next();
         dje $$3 = new dje($$2.getLongKey());

         for (asa $$4 : (List)$$2.getValue()) {
            $$0.accept($$3, $$4);
         }
      }
   }

   public void a() {
      ObjectIterator var1 = Long2ObjectMaps.fastIterable(this.g).iterator();

      while (var1.hasNext()) {
         Entry<List<asa>> $$0 = (Entry<List<asa>>)var1.next();

         for (asa $$1 : (List)$$0.getValue()) {
            this.a($$0.getLongKey(), $$1);
         }
      }

      this.g.clear();
   }

   public void a(@Nullable dkw.a $$0) {
      this.i = $$0;
   }

   public void b(@Nullable dkw.a $$0) {
      this.j = $$0;
   }

   public boolean b() {
      return !this.f.isEmpty();
   }

   public List<asa> a(long $$0) {
      return (List<asa>)this.f.getOrDefault($$0, List.of());
   }

   private List<asa> b(long $$0) {
      return (List<asa>)this.f.computeIfAbsent($$0, $$0x -> new ObjectArrayList(4));
   }

   public void a(asb $$0, dje $$1, int $$2) {
      asa $$3 = new asa($$0, aqx.a(ari.b) - $$2);
      this.a($$1.a(), $$3);
   }

   public void a(asa $$0, dje $$1) {
      this.a($$1.a(), $$0);
   }

   public boolean a(long $$0, asa $$1) {
      List<asa> $$2 = this.b($$0);

      for (asa $$3 : $$2) {
         if (a($$1, $$3)) {
            $$3.c();
            this.f();
            return false;
         }
      }

      int $$4 = a($$2, true);
      int $$5 = a($$2, false);
      $$2.add($$1);
      if ($$1.a().b() && $$1.b() < $$4 && this.j != null) {
         this.j.update($$0, $$1.b(), true);
      }

      if ($$1.a().a() && $$1.b() < $$5 && this.i != null) {
         this.i.update($$0, $$1.b(), true);
      }

      if ($$1.a().equals(asb.f)) {
         this.h.add($$0);
      }

      this.f();
      return true;
   }

   private static boolean a(asa $$0, asa $$1) {
      return $$1.a() == $$0.a() && $$1.b() == $$0.b();
   }

   public int a(long $$0, boolean $$1) {
      return a(this.a($$0), $$1);
   }

   private static int a(List<asa> $$0, boolean $$1) {
      asa $$2 = b($$0, $$1);
      return $$2 == null ? aqx.b + 1 : $$2.b();
   }

   @Nullable
   private static asa b(@Nullable List<asa> $$0, boolean $$1) {
      if ($$0 == null) {
         return null;
      } else {
         asa $$2 = null;

         for (asa $$3 : $$0) {
            if ($$2 == null || $$3.b() < $$2.b()) {
               if ($$1 && $$3.a().b()) {
                  $$2 = $$3;
               } else if (!$$1 && $$3.a().a()) {
                  $$2 = $$3;
               }
            }
         }

         return $$2;
      }
   }

   public void b(asb $$0, dje $$1, int $$2) {
      asa $$3 = new asa($$0, aqx.a(ari.b) - $$2);
      this.b($$1.a(), $$3);
   }

   public void b(asa $$0, dje $$1) {
      this.b($$1.a(), $$0);
   }

   public boolean b(long $$0, asa $$1) {
      List<asa> $$2 = (List<asa>)this.f.get($$0);
      if ($$2 == null) {
         return false;
      } else {
         boolean $$3 = false;
         Iterator<asa> $$4 = $$2.iterator();

         while ($$4.hasNext()) {
            asa $$5 = $$4.next();
            if (a($$1, $$5)) {
               $$4.remove();
               $$3 = true;
               break;
            }
         }

         if (!$$3) {
            return false;
         } else {
            if ($$2.isEmpty()) {
               this.f.remove($$0);
            }

            if ($$1.a().b() && this.j != null) {
               this.j.update($$0, a($$2, true), false);
            }

            if ($$1.a().a() && this.i != null) {
               this.i.update($$0, a($$2, false), false);
            }

            if ($$1.a().equals(asb.f)) {
               this.i();
            }

            this.f();
            return true;
         }
      }
   }

   private void i() {
      this.h = this.a((Predicate<asa>)($$0 -> $$0.a().equals(asb.f)));
   }

   public String b(long $$0, boolean $$1) {
      List<asa> $$2 = this.a($$0);
      asa $$3 = b($$2, $$1);
      return $$3 == null ? "no_ticket" : $$3.toString();
   }

   public void c() {
      this.a($$0 -> {
         $$0.d();
         return $$0.e();
      }, null);
      this.f();
   }

   public void d() {
      this.a($$0 -> $$0.a() != asb.i, this.g);
   }

   public void a(Predicate<asa> $$0, @Nullable Long2ObjectOpenHashMap<List<asa>> $$1) {
      ObjectIterator<Entry<List<asa>>> $$2 = this.f.long2ObjectEntrySet().fastIterator();
      boolean $$3 = false;

      while ($$2.hasNext()) {
         Entry<List<asa>> $$4 = (Entry<List<asa>>)$$2.next();
         Iterator<asa> $$5 = ((List)$$4.getValue()).iterator();
         boolean $$6 = false;
         boolean $$7 = false;

         while ($$5.hasNext()) {
            asa $$8 = $$5.next();
            if ($$0.test($$8)) {
               if ($$1 != null) {
                  List<asa> $$9 = (List<asa>)$$1.computeIfAbsent($$4.getLongKey(), $$1x -> new ObjectArrayList(((List)$$4.getValue()).size()));
                  $$9.add($$8);
               }

               $$5.remove();
               if ($$8.a().a()) {
                  $$7 = true;
               }

               if ($$8.a().b()) {
                  $$6 = true;
               }

               if ($$8.a().equals(asb.f)) {
                  $$3 = true;
               }
            }
         }

         if ($$7 || $$6) {
            if ($$7 && this.i != null) {
               this.i.update($$4.getLongKey(), a((List<asa>)$$4.getValue(), false), false);
            }

            if ($$6 && this.j != null) {
               this.j.update($$4.getLongKey(), a((List<asa>)$$4.getValue(), true), false);
            }

            this.f();
            if (((List)$$4.getValue()).isEmpty()) {
               $$2.remove();
            }
         }
      }

      if ($$3) {
         this.i();
      }
   }

   public void a(int $$0, asb $$1) {
      List<Pair<asa, Long>> $$2 = new ArrayList<>();
      ObjectIterator var4 = this.f.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<List<asa>> $$3 = (Entry<List<asa>>)var4.next();

         for (asa $$4 : (List)$$3.getValue()) {
            if ($$4.a() == $$1) {
               $$2.add(Pair.of($$4, $$3.getLongKey()));
            }
         }
      }

      for (Pair<asa, Long> $$5 : $$2) {
         Long $$6 = (Long)$$5.getSecond();
         asa $$7 = (asa)$$5.getFirst();
         this.b($$6, $$7);
         asb $$8 = $$7.a();
         this.a($$6, new asa($$8, $$0));
      }
   }

   public boolean a(dje $$0, boolean $$1) {
      asa $$2 = new asa(asb.f, aqy.c);
      return $$1 ? this.a($$0.a(), $$2) : this.b($$0.a(), $$2);
   }

   public LongSet e() {
      return this.h;
   }

   private LongSet a(Predicate<asa> $$0) {
      LongOpenHashSet $$1 = new LongOpenHashSet();
      ObjectIterator var3 = Long2ObjectMaps.fastIterable(this.f).iterator();

      while (var3.hasNext()) {
         Entry<List<asa>> $$2 = (Entry<List<asa>>)var3.next();

         for (asa $$3 : (List)$$2.getValue()) {
            if ($$0.test($$3)) {
               $$1.add($$2.getLongKey());
               break;
            }
         }
      }

      return $$1;
   }

   @FunctionalInterface
   public interface a {
      void update(long var1, int var3, boolean var4);
   }
}
