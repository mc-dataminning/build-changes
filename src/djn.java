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

public class djn<T extends djc> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final djk<T> c;
   private final djf<T> d;
   private final dje<T> e;
   final djh<T> f;
   private final djl<T> g;
   private final Long2ObjectMap<djp> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<djn.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<dja<T>> k = Queues.newConcurrentLinkedQueue();

   public djn(Class<T> $$0, djk<T> $$1, djf<T> $$2) {
      this.e = new dje<>();
      this.f = new djh<>($$0, this.h);
      this.h.defaultReturnValue(djp.a);
      this.i.defaultReturnValue(djn.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new djm<>(this.e, this.f);
   }

   void a(long $$0, djg<T> $$1) {
      if ($$1.a()) {
         this.f.e($$0);
      }
   }

   private boolean b(T $$0) {
      if (!this.b.add($$0.cv())) {
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
         long $$2 = hz.c($$0.dl());
         djg<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new djn.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         djp $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends djc> djp a(T $$0, djp $$1) {
      return $$0.dK() ? djp.c : $$1;
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

   public void a(cpe $$0, akl $$1) {
      djp $$2 = djp.a($$1);
      this.a($$0, $$2);
   }

   public void a(cpe $$0, djp $$1) {
      long $$2 = $$0.a();
      if ($$1 == djp.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         djp $$2x = $$1x.a($$1);
         boolean $$3 = $$2x.b();
         boolean $$4 = $$1.b();
         boolean $$5 = $$2x.a();
         boolean $$6 = $$1.a();
         if ($$5 && !$$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dK()).forEach(this::d);
         }

         if ($$3 && !$$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dK()).forEach(this::f);
         } else if (!$$3 && $$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dK()).forEach(this::e);
         }

         if (!$$5 && $$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dK()).forEach(this::c);
         }
      });
   }

   private void b(long $$0) {
      djn.b $$1 = (djn.b)this.i.get($$0);
      if ($$1 == djn.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      djn.b $$2 = (djn.b)this.i.get($$0);
      if ($$2 == djn.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(djc::dJ)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == djn.b.c) {
               this.d.a(new dja<>(new cpe($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == djn.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new dja<>(new cpe($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, djn.b.b);
      cpe $$1 = new cpe($$0);
      this.d.a($$1).thenAccept(this.k::add).exceptionally($$1x -> {
         a.error("Failed to read chunk {}", $$1, $$1x);
         return null;
      });
   }

   private boolean d(long $$0) {
      boolean $$1 = this.a($$0, $$0x -> $$0x.cS().forEach(this::g));
      if (!$$1) {
         return false;
      } else {
         this.i.remove($$0);
         return true;
      }
   }

   private void g(djc $$0) {
      $$0.b(bis.c.c);
      $$0.a(djd.a);
   }

   private void f() {
      this.j.removeIf($$0 -> this.h.get($$0) != djp.a ? true : this.d($$0));
   }

   private void g() {
      dja<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), djn.b.c);
      }
   }

   public void a() {
      this.g();
      this.f();
   }

   private LongSet h() {
      LongSet $$0 = this.f.a();
      ObjectIterator var2 = Long2ObjectMaps.fastIterable(this.i).iterator();

      while (var2.hasNext()) {
         Entry<djn.b> $$1 = (Entry<djn.b>)var2.next();
         if ($$1.getValue() == djn.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.h().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == djp.a;
         if ($$1) {
            this.d($$0);
         } else {
            this.a($$0, $$0x -> {
            });
         }
      });
   }

   public void c() {
      LongSet $$0 = this.h();

      while (!$$0.isEmpty()) {
         this.d.a(false);
         this.g();
         $$0.removeIf($$0x -> {
            boolean $$1 = this.h.get($$0x) == djp.a;
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

   public djl<T> d() {
      return this.g;
   }

   public boolean a(gw $$0) {
      return ((djp)this.h.get(cpe.a($$0))).a();
   }

   public boolean a(cpe $$0) {
      return ((djp)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == djn.b.c;
   }

   public void a(Writer $$0) throws IOException {
      ara $$1 = ara.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         djn.b $$2 = (djn.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            djg<T> $$3 = this.f.d($$2x);
            if ($$3 != null) {
               try {
                  $$1.a(hz.b($$2x), hz.c($$2x), hz.d($$2x), $$3.c(), $$2, $$3.d());
               } catch (IOException var7) {
                  throw new UncheckedIOException(var7);
               }
            }
         });
      });
   }

   @ata
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   class a implements djd {
      private final T c;
      private long d;
      private djg<T> e;

      a(T $$0, long $$1, djg<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         gw $$0 = this.c.dl();
         long $$1 = hz.c($$0);
         if ($$1 != this.d) {
            djp $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               djn.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, hz.a(this.d), $$1});
            }

            djn.this.a(this.d, this.e);
            djg<T> $$3 = djn.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(djp $$0, djp $$1) {
         djp $$2 = djn.a(this.c, $$0);
         djp $$3 = djn.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               djn.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               djn.this.f(this.c);
            } else if (!$$4 && $$5) {
               djn.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               djn.this.d(this.c);
            } else if (!$$6 && $$7) {
               djn.this.c(this.c);
            }

            if ($$5) {
               djn.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(bis.c $$0) {
         if (!this.e.b(this.c)) {
            djn.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, hz.a(this.d), $$0});
         }

         djp $$1 = djn.a(this.c, this.e.c());
         if ($$1.a()) {
            djn.this.d(this.c);
         }

         if ($$1.b()) {
            djn.this.f(this.c);
         }

         if ($$0.a()) {
            djn.this.c.f(this.c);
         }

         djn.this.b.remove(this.c.cv());
         this.c.a(a);
         djn.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
