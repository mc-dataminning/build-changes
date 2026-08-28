import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
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
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dhw extends evi {
   private static final int b = 4;
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "chunks";
   private static final String d = "tickets";
   private static final String e = "chunk_pos";
   private final Long2ObjectOpenHashMap<List<arj>> f;
   private final Long2ObjectOpenHashMap<List<arj>> g;
   private LongSet h = new LongOpenHashSet();
   @Nullable
   private dhw.a i;
   @Nullable
   private dhw.a j;

   public static evi.a<dhw> a() {
      return new evi.a<>(dhw::new, dhw::b, bam.i);
   }

   private dhw(Long2ObjectOpenHashMap<List<arj>> $$0, Long2ObjectOpenHashMap<List<arj>> $$1) {
      this.f = $$0;
      this.g = $$1;
      this.i();
   }

   public dhw() {
      this(new Long2ObjectOpenHashMap(4), new Long2ObjectOpenHashMap());
   }

   public static dhw b(tq $$0, jt.a $$1) {
      Long2ObjectOpenHashMap<List<arj>> $$2 = new Long2ObjectOpenHashMap();
      tw $$3 = $$0.c("tickets", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         tq $$5 = $$3.a($$4);
         arj $$6 = arj.a($$5);
         if ($$6 == null) {
            c.warn("Failed to load invalid saved ticket: {} ", $$5);
         } else {
            dgg $$7 = new dgg($$5.i("chunk_pos"));
            List<arj> $$8 = (List<arj>)$$2.computeIfAbsent($$7.a(), $$0x -> new ObjectArrayList(4));
            $$8.add($$6);
         }
      }

      return new dhw(new Long2ObjectOpenHashMap(4), $$2);
   }

   @Override
   public tq a(tq $$0, jt.a $$1) {
      tw $$2 = new tw();
      this.f.forEach(($$1x, $$2x) -> a($$2, $$1x.longValue(), $$2x));
      this.g.forEach(($$1x, $$2x) -> a($$2, $$1x.longValue(), $$2x));
      $$0.a("tickets", $$2);
      return $$0;
   }

   private static void a(tw $$0, long $$1, List<arj> $$2) {
      for (arj $$3 : $$2) {
         if ($$3.a().e()) {
            tq $$4 = new tq();
            $$4.a("chunk_pos", $$1);
            $$3.b($$4);
            $$0.add($$4);
         }
      }
   }

   public void b() {
      ObjectIterator var1 = Long2ObjectMaps.fastIterable(this.g).iterator();

      while (var1.hasNext()) {
         Entry<List<arj>> $$0 = (Entry<List<arj>>)var1.next();

         for (arj $$1 : (List)$$0.getValue()) {
            this.a($$0.getLongKey(), $$1);
         }
      }

      this.g.clear();
   }

   public void a(@Nullable dhw.a $$0) {
      this.i = $$0;
   }

   public void b(@Nullable dhw.a $$0) {
      this.j = $$0;
   }

   public boolean c() {
      return !this.f.isEmpty();
   }

   public List<arj> a(long $$0) {
      return (List<arj>)this.f.getOrDefault($$0, List.of());
   }

   private List<arj> b(long $$0) {
      return (List<arj>)this.f.computeIfAbsent($$0, $$0x -> new ObjectArrayList(4));
   }

   public void a(ark $$0, dgg $$1, int $$2) {
      arj $$3 = new arj($$0, aqg.a(aqr.b) - $$2);
      this.a($$1.a(), $$3);
   }

   public void a(arj $$0, dgg $$1) {
      this.a($$1.a(), $$0);
   }

   public boolean a(long $$0, arj $$1) {
      List<arj> $$2 = this.b($$0);

      for (arj $$3 : $$2) {
         if (a($$1, $$3)) {
            $$3.c();
            this.g();
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

      if ($$1.a().equals(ark.f)) {
         this.h.add($$0);
      }

      this.g();
      return true;
   }

   private static boolean a(arj $$0, arj $$1) {
      return $$1.a() == $$0.a() && $$1.b() == $$0.b();
   }

   public int a(long $$0, boolean $$1) {
      return a(this.a($$0), $$1);
   }

   private static int a(List<arj> $$0, boolean $$1) {
      arj $$2 = b($$0, $$1);
      return $$2 == null ? aqg.b + 1 : $$2.b();
   }

   @Nullable
   private static arj b(@Nullable List<arj> $$0, boolean $$1) {
      if ($$0 == null) {
         return null;
      } else {
         arj $$2 = null;

         for (arj $$3 : $$0) {
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

   public void b(ark $$0, dgg $$1, int $$2) {
      arj $$3 = new arj($$0, aqg.a(aqr.b) - $$2);
      this.b($$1.a(), $$3);
   }

   public void b(arj $$0, dgg $$1) {
      this.b($$1.a(), $$0);
   }

   public boolean b(long $$0, arj $$1) {
      List<arj> $$2 = (List<arj>)this.f.get($$0);
      if ($$2 == null) {
         return false;
      } else {
         boolean $$3 = false;
         Iterator<arj> $$4 = $$2.iterator();

         while ($$4.hasNext()) {
            arj $$5 = $$4.next();
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

            if ($$1.a().equals(ark.f)) {
               this.i();
            }

            this.g();
            return true;
         }
      }
   }

   private void i() {
      this.h = this.a($$0 -> $$0.a().equals(ark.f));
   }

   public String b(long $$0, boolean $$1) {
      List<arj> $$2 = this.a($$0);
      arj $$3 = b($$2, $$1);
      return $$3 == null ? "no_ticket" : $$3.toString();
   }

   public void d() {
      this.a($$0 -> {
         $$0.d();
         return $$0.e();
      }, null);
      this.g();
   }

   public void e() {
      this.a($$0 -> $$0.a() != ark.i, this.g);
   }

   public void a(Predicate<arj> $$0, @Nullable Long2ObjectOpenHashMap<List<arj>> $$1) {
      ObjectIterator<Entry<List<arj>>> $$2 = this.f.long2ObjectEntrySet().fastIterator();
      boolean $$3 = false;

      while ($$2.hasNext()) {
         Entry<List<arj>> $$4 = (Entry<List<arj>>)$$2.next();
         Iterator<arj> $$5 = ((List)$$4.getValue()).iterator();
         boolean $$6 = false;
         boolean $$7 = false;

         while ($$5.hasNext()) {
            arj $$8 = $$5.next();
            if ($$0.test($$8)) {
               if ($$1 != null) {
                  List<arj> $$9 = (List<arj>)$$1.computeIfAbsent($$4.getLongKey(), $$1x -> new ObjectArrayList(((List)$$4.getValue()).size()));
                  $$9.add($$8);
               }

               $$5.remove();
               if ($$8.a().a()) {
                  $$7 = true;
               }

               if ($$8.a().b()) {
                  $$6 = true;
               }

               if ($$8.a().equals(ark.f)) {
                  $$3 = true;
               }
            }
         }

         if ($$7 || $$6) {
            if ($$7 && this.i != null) {
               this.i.update($$4.getLongKey(), a((List<arj>)$$4.getValue(), false), false);
            }

            if ($$6 && this.j != null) {
               this.j.update($$4.getLongKey(), a((List<arj>)$$4.getValue(), true), false);
            }

            this.g();
            if (((List)$$4.getValue()).isEmpty()) {
               $$2.remove();
            }
         }
      }

      if ($$3) {
         this.i();
      }
   }

   public void a(int $$0, ark $$1) {
      List<Pair<arj, Long>> $$2 = new ArrayList<>();
      ObjectIterator var4 = this.f.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<List<arj>> $$3 = (Entry<List<arj>>)var4.next();

         for (arj $$4 : (List)$$3.getValue()) {
            if ($$4.a() == $$1) {
               $$2.add(Pair.of($$4, $$3.getLongKey()));
            }
         }
      }

      for (Pair<arj, Long> $$5 : $$2) {
         Long $$6 = (Long)$$5.getSecond();
         arj $$7 = (arj)$$5.getFirst();
         this.b($$6, $$7);
         ark $$8 = $$7.a();
         this.a($$6, new arj($$8, $$0));
      }
   }

   public boolean a(dgg $$0, boolean $$1) {
      arj $$2 = new arj(ark.f, aqh.c);
      return $$1 ? this.a($$0.a(), $$2) : this.b($$0.a(), $$2);
   }

   public LongSet f() {
      return this.h;
   }

   private LongSet a(Predicate<arj> $$0) {
      LongOpenHashSet $$1 = new LongOpenHashSet();
      ObjectIterator var3 = Long2ObjectMaps.fastIterable(this.f).iterator();

      while (var3.hasNext()) {
         Entry<List<arj>> $$2 = (Entry<List<arj>>)var3.next();

         for (arj $$3 : (List)$$2.getValue()) {
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
