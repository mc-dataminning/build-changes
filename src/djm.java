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

public class djm extends exh {
   private static final int b = 4;
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "chunks";
   private static final String d = "tickets";
   private static final String e = "chunk_pos";
   private final Long2ObjectOpenHashMap<List<aru>> f;
   private final Long2ObjectOpenHashMap<List<aru>> g;
   private LongSet h = new LongOpenHashSet();
   @Nullable
   private djm.a i;
   @Nullable
   private djm.a j;

   public static exh.a<djm> a() {
      return new exh.a<>(djm::new, djm::b, baz.i);
   }

   private djm(Long2ObjectOpenHashMap<List<aru>> $$0, Long2ObjectOpenHashMap<List<aru>> $$1) {
      this.f = $$0;
      this.g = $$1;
      this.i();
   }

   public djm() {
      this(new Long2ObjectOpenHashMap(4), new Long2ObjectOpenHashMap());
   }

   public static djm b(tx $$0, jg.a $$1) {
      Long2ObjectOpenHashMap<List<aru>> $$2 = new Long2ObjectOpenHashMap();
      ud $$3 = $$0.c("tickets", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         tx $$5 = $$3.a($$4);
         aru $$6 = aru.a($$5);
         if ($$6 == null) {
            c.warn("Failed to load invalid saved ticket: {} ", $$5);
         } else {
            dhw $$7 = new dhw($$5.i("chunk_pos"));
            List<aru> $$8 = (List<aru>)$$2.computeIfAbsent($$7.a(), $$0x -> new ObjectArrayList(4));
            $$8.add($$6);
         }
      }

      return new djm(new Long2ObjectOpenHashMap(4), $$2);
   }

   @Override
   public tx a(tx $$0, jg.a $$1) {
      ud $$2 = new ud();
      this.f.forEach(($$1x, $$2x) -> a($$2, $$1x.longValue(), $$2x));
      this.g.forEach(($$1x, $$2x) -> a($$2, $$1x.longValue(), $$2x));
      $$0.a("tickets", $$2);
      return $$0;
   }

   private static void a(ud $$0, long $$1, List<aru> $$2) {
      for (aru $$3 : $$2) {
         if ($$3.a().e()) {
            tx $$4 = new tx();
            $$4.a("chunk_pos", $$1);
            $$3.b($$4);
            $$0.add($$4);
         }
      }
   }

   public void b() {
      ObjectIterator var1 = Long2ObjectMaps.fastIterable(this.g).iterator();

      while (var1.hasNext()) {
         Entry<List<aru>> $$0 = (Entry<List<aru>>)var1.next();

         for (aru $$1 : (List)$$0.getValue()) {
            this.a($$0.getLongKey(), $$1);
         }
      }

      this.g.clear();
   }

   public void a(@Nullable djm.a $$0) {
      this.i = $$0;
   }

   public void b(@Nullable djm.a $$0) {
      this.j = $$0;
   }

   public boolean c() {
      return !this.f.isEmpty();
   }

   public List<aru> a(long $$0) {
      return (List<aru>)this.f.getOrDefault($$0, List.of());
   }

   private List<aru> b(long $$0) {
      return (List<aru>)this.f.computeIfAbsent($$0, $$0x -> new ObjectArrayList(4));
   }

   public void a(arv $$0, dhw $$1, int $$2) {
      aru $$3 = new aru($$0, aqr.a(arc.b) - $$2);
      this.a($$1.a(), $$3);
   }

   public void a(aru $$0, dhw $$1) {
      this.a($$1.a(), $$0);
   }

   public boolean a(long $$0, aru $$1) {
      List<aru> $$2 = this.b($$0);

      for (aru $$3 : $$2) {
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

      if ($$1.a().equals(arv.f)) {
         this.h.add($$0);
      }

      this.g();
      return true;
   }

   private static boolean a(aru $$0, aru $$1) {
      return $$1.a() == $$0.a() && $$1.b() == $$0.b();
   }

   public int a(long $$0, boolean $$1) {
      return a(this.a($$0), $$1);
   }

   private static int a(List<aru> $$0, boolean $$1) {
      aru $$2 = b($$0, $$1);
      return $$2 == null ? aqr.b + 1 : $$2.b();
   }

   @Nullable
   private static aru b(@Nullable List<aru> $$0, boolean $$1) {
      if ($$0 == null) {
         return null;
      } else {
         aru $$2 = null;

         for (aru $$3 : $$0) {
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

   public void b(arv $$0, dhw $$1, int $$2) {
      aru $$3 = new aru($$0, aqr.a(arc.b) - $$2);
      this.b($$1.a(), $$3);
   }

   public void b(aru $$0, dhw $$1) {
      this.b($$1.a(), $$0);
   }

   public boolean b(long $$0, aru $$1) {
      List<aru> $$2 = (List<aru>)this.f.get($$0);
      if ($$2 == null) {
         return false;
      } else {
         boolean $$3 = false;
         Iterator<aru> $$4 = $$2.iterator();

         while ($$4.hasNext()) {
            aru $$5 = $$4.next();
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

            if ($$1.a().equals(arv.f)) {
               this.i();
            }

            this.g();
            return true;
         }
      }
   }

   private void i() {
      this.h = this.a($$0 -> $$0.a().equals(arv.f));
   }

   public String b(long $$0, boolean $$1) {
      List<aru> $$2 = this.a($$0);
      aru $$3 = b($$2, $$1);
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
      this.a($$0 -> $$0.a() != arv.i, this.g);
   }

   public void a(Predicate<aru> $$0, @Nullable Long2ObjectOpenHashMap<List<aru>> $$1) {
      ObjectIterator<Entry<List<aru>>> $$2 = this.f.long2ObjectEntrySet().fastIterator();
      boolean $$3 = false;

      while ($$2.hasNext()) {
         Entry<List<aru>> $$4 = (Entry<List<aru>>)$$2.next();
         Iterator<aru> $$5 = ((List)$$4.getValue()).iterator();
         boolean $$6 = false;
         boolean $$7 = false;

         while ($$5.hasNext()) {
            aru $$8 = $$5.next();
            if ($$0.test($$8)) {
               if ($$1 != null) {
                  List<aru> $$9 = (List<aru>)$$1.computeIfAbsent($$4.getLongKey(), $$1x -> new ObjectArrayList(((List)$$4.getValue()).size()));
                  $$9.add($$8);
               }

               $$5.remove();
               if ($$8.a().a()) {
                  $$7 = true;
               }

               if ($$8.a().b()) {
                  $$6 = true;
               }

               if ($$8.a().equals(arv.f)) {
                  $$3 = true;
               }
            }
         }

         if ($$7 || $$6) {
            if ($$7 && this.i != null) {
               this.i.update($$4.getLongKey(), a((List<aru>)$$4.getValue(), false), false);
            }

            if ($$6 && this.j != null) {
               this.j.update($$4.getLongKey(), a((List<aru>)$$4.getValue(), true), false);
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

   public void a(int $$0, arv $$1) {
      List<Pair<aru, Long>> $$2 = new ArrayList<>();
      ObjectIterator var4 = this.f.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<List<aru>> $$3 = (Entry<List<aru>>)var4.next();

         for (aru $$4 : (List)$$3.getValue()) {
            if ($$4.a() == $$1) {
               $$2.add(Pair.of($$4, $$3.getLongKey()));
            }
         }
      }

      for (Pair<aru, Long> $$5 : $$2) {
         Long $$6 = (Long)$$5.getSecond();
         aru $$7 = (aru)$$5.getFirst();
         this.b($$6, $$7);
         arv $$8 = $$7.a();
         this.a($$6, new aru($$8, $$0));
      }
   }

   public boolean a(dhw $$0, boolean $$1) {
      aru $$2 = new aru(arv.f, aqs.c);
      return $$1 ? this.a($$0.a(), $$2) : this.b($$0.a(), $$2);
   }

   public LongSet f() {
      return this.h;
   }

   private LongSet a(Predicate<aru> $$0) {
      LongOpenHashSet $$1 = new LongOpenHashSet();
      ObjectIterator var3 = Long2ObjectMaps.fastIterable(this.f).iterator();

      while (var3.hasNext()) {
         Entry<List<aru>> $$2 = (Entry<List<aru>>)var3.next();

         for (aru $$3 : (List)$$2.getValue()) {
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
