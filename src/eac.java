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

public class eac<T extends dzr> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final dzz<T> c;
   private final dzu<T> d;
   private final dzt<T> e;
   final dzw<T> f;
   private final eaa<T> g;
   private final Long2ObjectMap<eae> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<eac.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<dzp<T>> k = Queues.newConcurrentLinkedQueue();

   public eac(Class<T> $$0, dzz<T> $$1, dzu<T> $$2) {
      this.e = new dzt<>();
      this.f = new dzw<>($$0, this.h);
      this.h.defaultReturnValue(eae.a);
      this.i.defaultReturnValue(eac.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new eab<>(this.e, this.f);
   }

   void a(long $$0, dzv<T> $$1) {
      if ($$1.a()) {
         this.f.e($$0);
      }
   }

   private boolean b(T $$0) {
      if (!this.b.add($$0.cI())) {
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
         long $$2 = kj.c($$0.dy());
         dzv<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new eac.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         eae $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends dzr> eae a(T $$0, eae $$1) {
      return $$0.dX() ? eae.c : $$1;
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

   public void a(del $$0, arg $$1) {
      eae $$2 = eae.a($$1);
      this.a($$0, $$2);
   }

   public void a(del $$0, eae $$1) {
      long $$2 = $$0.a();
      if ($$1 == eae.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         eae $$2x = $$1x.a($$1);
         boolean $$3 = $$2x.b();
         boolean $$4 = $$1.b();
         boolean $$5 = $$2x.a();
         boolean $$6 = $$1.a();
         if ($$5 && !$$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dX()).forEach(this::d);
         }

         if ($$3 && !$$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dX()).forEach(this::f);
         } else if (!$$3 && $$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dX()).forEach(this::e);
         }

         if (!$$5 && $$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dX()).forEach(this::c);
         }
      });
   }

   private void b(long $$0) {
      eac.b $$1 = (eac.b)this.i.get($$0);
      if ($$1 == eac.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      eac.b $$2 = (eac.b)this.i.get($$0);
      if ($$2 == eac.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(dzr::dW)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == eac.b.c) {
               this.d.a(new dzp<>(new del($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == eac.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new dzp<>(new del($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, eac.b.b);
      del $$1 = new del($$0);
      this.d.a($$1).thenAccept(this.k::add).exceptionally($$1x -> {
         a.error("Failed to read chunk {}", $$1, $$1x);
         return null;
      });
   }

   private boolean d(long $$0) {
      boolean $$1 = this.a($$0, $$0x -> $$0x.de().forEach(this::g));
      if (!$$1) {
         return false;
      } else {
         this.i.remove($$0);
         return true;
      }
   }

   private void g(dzr $$0) {
      $$0.b(bui.c.c);
      $$0.a(dzs.a);
   }

   private void g() {
      this.j.removeIf($$0 -> this.h.get($$0) != eae.a ? true : this.d($$0));
   }

   private void h() {
      dzp<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), eac.b.c);
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
         Entry<eac.b> $$1 = (Entry<eac.b>)var2.next();
         if ($$1.getValue() == eac.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.i().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == eae.a;
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
            boolean $$1 = this.h.get($$0x) == eae.a;
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

   public eaa<T> d() {
      return this.g;
   }

   public boolean a(jh $$0) {
      return ((eae)this.h.get(del.a($$0))).a();
   }

   public boolean a(del $$0) {
      return ((eae)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == eac.b.c;
   }

   public void a(Writer $$0) throws IOException {
      ayn $$1 = ayn.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         eac.b $$2 = (eac.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            dzv<T> $$3 = this.f.d($$2x);
            if ($$3 != null) {
               try {
                  $$1.a(kj.b($$2x), kj.c($$2x), kj.d($$2x), $$3.c(), $$2, $$3.d());
               } catch (IOException var7) {
                  throw new UncheckedIOException(var7);
               }
            }
         });
      });
   }

   @bau
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   @bau
   public int f() {
      return this.e.b();
   }

   class a implements dzs {
      private final T c;
      private long d;
      private dzv<T> e;

      a(final T $$0, final long $$1, final dzv<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jh $$0 = this.c.dy();
         long $$1 = kj.c($$0);
         if ($$1 != this.d) {
            eae $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               eac.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kj.a(this.d), $$1});
            }

            eac.this.a(this.d, this.e);
            dzv<T> $$3 = eac.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(eae $$0, eae $$1) {
         eae $$2 = eac.a(this.c, $$0);
         eae $$3 = eac.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               eac.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               eac.this.f(this.c);
            } else if (!$$4 && $$5) {
               eac.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               eac.this.d(this.c);
            } else if (!$$6 && $$7) {
               eac.this.c(this.c);
            }

            if ($$5) {
               eac.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(bui.c $$0) {
         if (!this.e.b(this.c)) {
            eac.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kj.a(this.d), $$0});
         }

         eae $$1 = eac.a(this.c, this.e.c());
         if ($$1.a()) {
            eac.this.d(this.c);
         }

         if ($$1.b()) {
            eac.this.f(this.c);
         }

         if ($$0.a()) {
            eac.this.c.f(this.c);
         }

         eac.this.b.remove(this.c.cI());
         this.c.a(a);
         eac.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
