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

public class dxr<T extends dxg> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final dxo<T> c;
   private final dxj<T> d;
   private final dxi<T> e;
   final dxl<T> f;
   private final dxp<T> g;
   private final Long2ObjectMap<dxt> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<dxr.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<dxe<T>> k = Queues.newConcurrentLinkedQueue();

   public dxr(Class<T> $$0, dxo<T> $$1, dxj<T> $$2) {
      this.e = new dxi<>();
      this.f = new dxl<>($$0, this.h);
      this.h.defaultReturnValue(dxt.a);
      this.i.defaultReturnValue(dxr.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new dxq<>(this.e, this.f);
   }

   void a(long $$0, dxk<T> $$1) {
      if ($$1.a()) {
         this.f.e($$0);
      }
   }

   private boolean b(T $$0) {
      if (!this.b.add($$0.cA())) {
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
         long $$2 = kf.c($$0.dp());
         dxk<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new dxr.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         dxt $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends dxg> dxt a(T $$0, dxt $$1) {
      return $$0.dO() ? dxt.c : $$1;
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

   public void a(dcd $$0, aql $$1) {
      dxt $$2 = dxt.a($$1);
      this.a($$0, $$2);
   }

   public void a(dcd $$0, dxt $$1) {
      long $$2 = $$0.a();
      if ($$1 == dxt.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         dxt $$2x = $$1x.a($$1);
         boolean $$3 = $$2x.b();
         boolean $$4 = $$1.b();
         boolean $$5 = $$2x.a();
         boolean $$6 = $$1.a();
         if ($$5 && !$$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dO()).forEach(this::d);
         }

         if ($$3 && !$$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dO()).forEach(this::f);
         } else if (!$$3 && $$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dO()).forEach(this::e);
         }

         if (!$$5 && $$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dO()).forEach(this::c);
         }
      });
   }

   private void b(long $$0) {
      dxr.b $$1 = (dxr.b)this.i.get($$0);
      if ($$1 == dxr.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      dxr.b $$2 = (dxr.b)this.i.get($$0);
      if ($$2 == dxr.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(dxg::dN)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == dxr.b.c) {
               this.d.a(new dxe<>(new dcd($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == dxr.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new dxe<>(new dcd($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, dxr.b.b);
      dcd $$1 = new dcd($$0);
      this.d.a($$1).thenAccept(this.k::add).exceptionally($$1x -> {
         a.error("Failed to read chunk {}", $$1, $$1x);
         return null;
      });
   }

   private boolean d(long $$0) {
      boolean $$1 = this.a($$0, $$0x -> $$0x.cW().forEach(this::g));
      if (!$$1) {
         return false;
      } else {
         this.i.remove($$0);
         return true;
      }
   }

   private void g(dxg $$0) {
      $$0.b(bsr.c.c);
      $$0.a(dxh.a);
   }

   private void g() {
      this.j.removeIf($$0 -> this.h.get($$0) != dxt.a ? true : this.d($$0));
   }

   private void h() {
      dxe<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), dxr.b.c);
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
         Entry<dxr.b> $$1 = (Entry<dxr.b>)var2.next();
         if ($$1.getValue() == dxr.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.i().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == dxt.a;
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
            boolean $$1 = this.h.get($$0x) == dxt.a;
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

   public dxp<T> d() {
      return this.g;
   }

   public boolean a(jd $$0) {
      return ((dxt)this.h.get(dcd.a($$0))).a();
   }

   public boolean a(dcd $$0) {
      return ((dxt)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == dxr.b.c;
   }

   public void a(Writer $$0) throws IOException {
      axn $$1 = axn.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         dxr.b $$2 = (dxr.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            dxk<T> $$3 = this.f.d($$2x);
            if ($$3 != null) {
               try {
                  $$1.a(kf.b($$2x), kf.c($$2x), kf.d($$2x), $$3.c(), $$2, $$3.d());
               } catch (IOException var7) {
                  throw new UncheckedIOException(var7);
               }
            }
         });
      });
   }

   @azt
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   @azt
   public int f() {
      return this.e.b();
   }

   class a implements dxh {
      private final T c;
      private long d;
      private dxk<T> e;

      a(final T $$0, final long $$1, final dxk<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jd $$0 = this.c.dp();
         long $$1 = kf.c($$0);
         if ($$1 != this.d) {
            dxt $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dxr.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kf.a(this.d), $$1});
            }

            dxr.this.a(this.d, this.e);
            dxk<T> $$3 = dxr.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(dxt $$0, dxt $$1) {
         dxt $$2 = dxr.a(this.c, $$0);
         dxt $$3 = dxr.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               dxr.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               dxr.this.f(this.c);
            } else if (!$$4 && $$5) {
               dxr.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               dxr.this.d(this.c);
            } else if (!$$6 && $$7) {
               dxr.this.c(this.c);
            }

            if ($$5) {
               dxr.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(bsr.c $$0) {
         if (!this.e.b(this.c)) {
            dxr.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kf.a(this.d), $$0});
         }

         dxt $$1 = dxr.a(this.c, this.e.c());
         if ($$1.a()) {
            dxr.this.d(this.c);
         }

         if ($$1.b()) {
            dxr.this.f(this.c);
         }

         if ($$0.a()) {
            dxr.this.c.f(this.c);
         }

         dxr.this.b.remove(this.c.cA());
         this.c.a(a);
         dxr.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
