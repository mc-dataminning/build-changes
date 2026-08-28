import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class dzd<T extends dys> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final dza<T> c;
   private final dyv<T> d;
   private final dyu<T> e;
   final dyx<T> f;
   private final dzb<T> g;
   private final Long2ObjectMap<dzf> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<dzd.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<dyq<T>> k = Queues.newConcurrentLinkedQueue();

   public dzd(Class<T> $$0, dza<T> $$1, dyv<T> $$2) {
      this.e = new dyu<>();
      this.f = new dyx<>($$0, this.h);
      this.h.defaultReturnValue(dzf.a);
      this.i.defaultReturnValue(dzd.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new dzc<>(this.e, this.f);
   }

   void a(long $$0, dyw<T> $$1) {
      if ($$1.a()) {
         this.f.e($$0);
      }
   }

   private boolean b(T $$0) {
      if (!this.b.add($$0.cD())) {
         a.warn("UUID of added entity already exists: {}", $$0);
         return false;
      } else {
         return true;
      }
   }

   public boolean a(T $$0) {
      return this.a($$0, false);
   }

   private boolean a(T $$0, boolean $$1) {
      if (!this.b($$0)) {
         return false;
      } else {
         long $$2 = kg.c($$0.ds());
         dyw<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new dzd.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         dzf $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends dys> dzf a(T $$0, dzf $$1) {
      return $$0.dR() ? dzf.c : $$1;
   }

   public void a(Stream<T> $$0) {
      $$0.forEach($$0x -> this.a((T)$$0x, true));
   }

   public void b(Stream<T> $$0) {
      $$0.forEach($$0x -> this.a((T)$$0x, false));
   }

   void c(T $$0) {
      this.c.e($$0);
   }

   void d(T $$0) {
      this.c.d($$0);
   }

   void e(T $$0) {
      this.e.a($$0);
      this.c.c($$0);
   }

   void f(T $$0) {
      this.c.b($$0);
      this.e.b($$0);
   }

   public void a(ddm $$0, aqx $$1) {
      dzf $$2 = dzf.a($$1);
      this.a($$0, $$2);
   }

   public void a(ddm $$0, dzf $$1) {
      long $$2 = $$0.a();
      if ($$1 == dzf.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         dzf $$2x = $$1x.a($$1);
         boolean $$3 = $$2x.b();
         boolean $$4 = $$1.b();
         boolean $$5 = $$2x.a();
         boolean $$6 = $$1.a();
         if ($$5 && !$$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dR()).forEach(this::d);
         }

         if ($$3 && !$$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dR()).forEach(this::f);
         } else if (!$$3 && $$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dR()).forEach(this::e);
         }

         if (!$$5 && $$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dR()).forEach(this::c);
         }
      });
   }

   private void b(long $$0) {
      dzd.b $$1 = (dzd.b)this.i.get($$0);
      if ($$1 == dzd.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      dzd.b $$2 = (dzd.b)this.i.get($$0);
      if ($$2 == dzd.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(dys::dQ)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == dzd.b.c) {
               this.d.a(new dyq<>(new ddm($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == dzd.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new dyq<>(new ddm($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, dzd.b.b);
      ddm $$1 = new ddm($$0);
      this.d.a($$1).thenAccept(this.k::add).exceptionally($$1x -> {
         a.error("Failed to read chunk {}", $$1, $$1x);
         return null;
      });
   }

   private boolean d(long $$0) {
      boolean $$1 = this.a($$0, $$0x -> $$0x.cZ().forEach(this::g));
      if (!$$1) {
         return false;
      } else {
         this.i.remove($$0);
         return true;
      }
   }

   private void g(dys $$0) {
      $$0.b(bto.c.c);
      $$0.a(dyt.a);
   }

   private void g() {
      this.j.removeIf($$0 -> this.h.get($$0) != dzf.a ? true : this.d($$0));
   }

   private void h() {
      dyq<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), dzd.b.c);
      }
   }

   public void a() {
      this.h();
      this.g();
   }

   private LongSet i() {
      LongSet $$0 = this.f.a();
      ObjectIterator var2 = Long2ObjectMaps.fastIterable(this.i).iterator();

      while (var2.hasNext()) {
         Entry<dzd.b> $$1 = (Entry<dzd.b>)var2.next();
         if ($$1.getValue() == dzd.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.i().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == dzf.a;
         if ($$1) {
            this.d($$0);
         } else {
            this.a($$0, $$0x -> {
            });
         }
      });
   }

   public void c() {
      LongSet $$0 = this.i();

      while (!$$0.isEmpty()) {
         this.d.a(false);
         this.h();
         $$0.removeIf($$0x -> {
            boolean $$1 = this.h.get($$0x) == dzf.a;
            return $$1 ? this.d($$0x) : this.a($$0x, $$0xx -> {
            });
         });
      }

      this.d.a(true);
   }

   @Override
   public void close() throws IOException {
      this.c();
      this.d.close();
   }

   public boolean a(UUID $$0) {
      return this.b.contains($$0);
   }

   public dzb<T> d() {
      return this.g;
   }

   public boolean a(je $$0) {
      return ((dzf)this.h.get(ddm.a($$0))).a();
   }

   public boolean a(ddm $$0) {
      return ((dzf)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == dzd.b.c;
   }

   public void a(Writer $$0) throws IOException {
      ayd $$1 = ayd.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         dzd.b $$2 = (dzd.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            dyw<T> $$3 = this.f.d($$2x);
            if ($$3 != null) {
               try {
                  $$1.a(kg.b($$2x), kg.c($$2x), kg.d($$2x), $$3.c(), $$2, $$3.d());
               } catch (IOException var7) {
                  throw new UncheckedIOException(var7);
               }
            }
         });
      });
   }

   @baj
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   @baj
   public int f() {
      return this.e.b();
   }

   class a implements dyt {
      private final T c;
      private long d;
      private dyw<T> e;

      a(final T $$0, final long $$1, final dyw<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         je $$0 = this.c.ds();
         long $$1 = kg.c($$0);
         if ($$1 != this.d) {
            dzf $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dzd.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kg.a(this.d), $$1});
            }

            dzd.this.a(this.d, this.e);
            dyw<T> $$3 = dzd.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(dzf $$0, dzf $$1) {
         dzf $$2 = dzd.a(this.c, $$0);
         dzf $$3 = dzd.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               dzd.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               dzd.this.f(this.c);
            } else if (!$$4 && $$5) {
               dzd.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               dzd.this.d(this.c);
            } else if (!$$6 && $$7) {
               dzd.this.c(this.c);
            }

            if ($$5) {
               dzd.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(bto.c $$0) {
         if (!this.e.b(this.c)) {
            dzd.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kg.a(this.d), $$0});
         }

         dzf $$1 = dzd.a(this.c, this.e.c());
         if ($$1.a()) {
            dzd.this.d(this.c);
         }

         if ($$1.b()) {
            dzd.this.f(this.c);
         }

         if ($$0.a()) {
            dzd.this.c.f(this.c);
         }

         dzd.this.b.remove(this.c.cD());
         this.c.a(a);
         dzd.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
