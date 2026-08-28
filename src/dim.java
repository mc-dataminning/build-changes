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

public class dim extends ewf {
   private static final int b = 4;
   private static final Logger c = LogUtils.getLogger();
   public static final String a = "chunks";
   private static final String d = "tickets";
   private static final String e = "chunk_pos";
   private final Long2ObjectOpenHashMap<List<art>> f;
   private final Long2ObjectOpenHashMap<List<art>> g;
   private LongSet h = new LongOpenHashSet();
   @Nullable
   private dim.a i;
   @Nullable
   private dim.a j;

   public static ewf.a<dim> a() {
      return new ewf.a<>(dim::new, dim::b, bax.i);
   }

   private dim(Long2ObjectOpenHashMap<List<art>> $$0, Long2ObjectOpenHashMap<List<art>> $$1) {
      this.f = $$0;
      this.g = $$1;
      this.i();
   }

   public dim() {
      this(new Long2ObjectOpenHashMap(4), new Long2ObjectOpenHashMap());
   }

   public static dim b(tw $$0, ju.a $$1) {
      Long2ObjectOpenHashMap<List<art>> $$2 = new Long2ObjectOpenHashMap();
      uc $$3 = $$0.c("tickets", 10);

      for (int $$4 = 0; $$4 < $$3.size(); $$4++) {
         tw $$5 = $$3.a($$4);
         art $$6 = art.a($$5);
         if ($$6 == null) {
            c.warn("Failed to load invalid saved ticket: {} ", $$5);
         } else {
            dgw $$7 = new dgw($$5.i("chunk_pos"));
            List<art> $$8 = (List<art>)$$2.computeIfAbsent($$7.a(), $$0x -> new ObjectArrayList(4));
            $$8.add($$6);
         }
      }

      return new dim(new Long2ObjectOpenHashMap(4), $$2);
   }

   @Override
   public tw a(tw $$0, ju.a $$1) {
      uc $$2 = new uc();
      this.f.forEach(($$1x, $$2x) -> a($$2, $$1x.longValue(), $$2x));
      this.g.forEach(($$1x, $$2x) -> a($$2, $$1x.longValue(), $$2x));
      $$0.a("tickets", $$2);
      return $$0;
   }

   private static void a(uc $$0, long $$1, List<art> $$2) {
      for (art $$3 : $$2) {
         if ($$3.a().e()) {
            tw $$4 = new tw();
            $$4.a("chunk_pos", $$1);
            $$3.b($$4);
            $$0.add($$4);
         }
      }
   }

   public void b() {
      ObjectIterator var1 = Long2ObjectMaps.fastIterable(this.g).iterator();

      while (var1.hasNext()) {
         Entry<List<art>> $$0 = (Entry<List<art>>)var1.next();

         for (art $$1 : (List)$$0.getValue()) {
            this.a($$0.getLongKey(), $$1);
         }
      }

      this.g.clear();
   }

   public void a(@Nullable dim.a $$0) {
      this.i = $$0;
   }

   public void b(@Nullable dim.a $$0) {
      this.j = $$0;
   }

   public boolean c() {
      return !this.f.isEmpty();
   }

   public List<art> a(long $$0) {
      return (List<art>)this.f.getOrDefault($$0, List.of());
   }

   private List<art> b(long $$0) {
      return (List<art>)this.f.computeIfAbsent($$0, $$0x -> new ObjectArrayList(4));
   }

   public void a(aru $$0, dgw $$1, int $$2) {
      art $$3 = new art($$0, aqq.a(arb.b) - $$2);
      this.a($$1.a(), $$3);
   }

   public void a(art $$0, dgw $$1) {
      this.a($$1.a(), $$0);
   }

   public boolean a(long $$0, art $$1) {
      List<art> $$2 = this.b($$0);

      for (art $$3 : $$2) {
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

      if ($$1.a().equals(aru.f)) {
         this.h.add($$0);
      }

      this.g();
      return true;
   }

   private static boolean a(art $$0, art $$1) {
      return $$1.a() == $$0.a() && $$1.b() == $$0.b();
   }

   public int a(long $$0, boolean $$1) {
      return a(this.a($$0), $$1);
   }

   private static int a(List<art> $$0, boolean $$1) {
      art $$2 = b($$0, $$1);
      return $$2 == null ? aqq.b + 1 : $$2.b();
   }

   @Nullable
   private static art b(@Nullable List<art> $$0, boolean $$1) {
      if ($$0 == null) {
         return null;
      } else {
         art $$2 = null;

         for (art $$3 : $$0) {
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

   public void b(aru $$0, dgw $$1, int $$2) {
      art $$3 = new art($$0, aqq.a(arb.b) - $$2);
      this.b($$1.a(), $$3);
   }

   public void b(art $$0, dgw $$1) {
      this.b($$1.a(), $$0);
   }

   public boolean b(long $$0, art $$1) {
      List<art> $$2 = (List<art>)this.f.get($$0);
      if ($$2 == null) {
         return false;
      } else {
         boolean $$3 = false;
         Iterator<art> $$4 = $$2.iterator();

         while ($$4.hasNext()) {
            art $$5 = $$4.next();
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

            if ($$1.a().equals(aru.f)) {
               this.i();
            }

            this.g();
            return true;
         }
      }
   }

   private void i() {
      this.h = this.a($$0 -> $$0.a().equals(aru.f));
   }

   public String b(long $$0, boolean $$1) {
      List<art> $$2 = this.a($$0);
      art $$3 = b($$2, $$1);
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
      this.a($$0 -> $$0.a() != aru.i, this.g);
   }

   public void a(Predicate<art> $$0, @Nullable Long2ObjectOpenHashMap<List<art>> $$1) {
      ObjectIterator<Entry<List<art>>> $$2 = this.f.long2ObjectEntrySet().fastIterator();
      boolean $$3 = false;

      while ($$2.hasNext()) {
         Entry<List<art>> $$4 = (Entry<List<art>>)$$2.next();
         Iterator<art> $$5 = ((List)$$4.getValue()).iterator();
         boolean $$6 = false;
         boolean $$7 = false;

         while ($$5.hasNext()) {
            art $$8 = $$5.next();
            if ($$0.test($$8)) {
               if ($$1 != null) {
                  List<art> $$9 = (List<art>)$$1.computeIfAbsent($$4.getLongKey(), $$1x -> new ObjectArrayList(((List)$$4.getValue()).size()));
                  $$9.add($$8);
               }

               $$5.remove();
               if ($$8.a().a()) {
                  $$7 = true;
               }

               if ($$8.a().b()) {
                  $$6 = true;
               }

               if ($$8.a().equals(aru.f)) {
                  $$3 = true;
               }
            }
         }

         if ($$7 || $$6) {
            if ($$7 && this.i != null) {
               this.i.update($$4.getLongKey(), a((List<art>)$$4.getValue(), false), false);
            }

            if ($$6 && this.j != null) {
               this.j.update($$4.getLongKey(), a((List<art>)$$4.getValue(), true), false);
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

   public void a(int $$0, aru $$1) {
      List<Pair<art, Long>> $$2 = new ArrayList<>();
      ObjectIterator var4 = this.f.long2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry<List<art>> $$3 = (Entry<List<art>>)var4.next();

         for (art $$4 : (List)$$3.getValue()) {
            if ($$4.a() == $$1) {
               $$2.add(Pair.of($$4, $$3.getLongKey()));
            }
         }
      }

      for (Pair<art, Long> $$5 : $$2) {
         Long $$6 = (Long)$$5.getSecond();
         art $$7 = (art)$$5.getFirst();
         this.b($$6, $$7);
         aru $$8 = $$7.a();
         this.a($$6, new art($$8, $$0));
      }
   }

   public boolean a(dgw $$0, boolean $$1) {
      art $$2 = new art(aru.f, aqr.c);
      return $$1 ? this.a($$0.a(), $$2) : this.b($$0.a(), $$2);
   }

   public LongSet f() {
      return this.h;
   }

   private LongSet a(Predicate<art> $$0) {
      LongOpenHashSet $$1 = new LongOpenHashSet();
      ObjectIterator var3 = Long2ObjectMaps.fastIterable(this.f).iterator();

      while (var3.hasNext()) {
         Entry<List<art>> $$2 = (Entry<List<art>>)var3.next();

         for (art $$3 : (List)$$2.getValue()) {
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
