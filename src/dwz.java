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

public class dwz<T extends dwo> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final dww<T> c;
   private final dwr<T> d;
   private final dwq<T> e;
   final dwt<T> f;
   private final dwx<T> g;
   private final Long2ObjectMap<dxb> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<dwz.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<dwm<T>> k = Queues.newConcurrentLinkedQueue();

   public dwz(Class<T> $$0, dww<T> $$1, dwr<T> $$2) {
      this.e = new dwq<>();
      this.f = new dwt<>($$0, this.h);
      this.h.defaultReturnValue(dxb.a);
      this.i.defaultReturnValue(dwz.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new dwy<>(this.e, this.f);
   }

   void a(long $$0, dws<T> $$1) {
      if ($$1.a()) {
         this.f.e($$0);
      }
   }

   private boolean b(T $$0) {
      if (!this.b.add($$0.cB())) {
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
         long $$2 = kc.c($$0.dr());
         dws<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new dwz.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         dxb $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends dwo> dxb a(T $$0, dxb $$1) {
      return $$0.dQ() ? dxb.c : $$1;
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

   public void a(dbn $$0, aqd $$1) {
      dxb $$2 = dxb.a($$1);
      this.a($$0, $$2);
   }

   public void a(dbn $$0, dxb $$1) {
      long $$2 = $$0.a();
      if ($$1 == dxb.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         dxb $$2x = $$1x.a($$1);
         boolean $$3 = $$2x.b();
         boolean $$4 = $$1.b();
         boolean $$5 = $$2x.a();
         boolean $$6 = $$1.a();
         if ($$5 && !$$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dQ()).forEach(this::d);
         }

         if ($$3 && !$$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dQ()).forEach(this::f);
         } else if (!$$3 && $$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dQ()).forEach(this::e);
         }

         if (!$$5 && $$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dQ()).forEach(this::c);
         }
      });
   }

   private void b(long $$0) {
      dwz.b $$1 = (dwz.b)this.i.get($$0);
      if ($$1 == dwz.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      dwz.b $$2 = (dwz.b)this.i.get($$0);
      if ($$2 == dwz.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(dwo::dP)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == dwz.b.c) {
               this.d.a(new dwm<>(new dbn($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == dwz.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new dwm<>(new dbn($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, dwz.b.b);
      dbn $$1 = new dbn($$0);
      this.d.a($$1).thenAccept(this.k::add).exceptionally($$1x -> {
         a.error("Failed to read chunk {}", $$1, $$1x);
         return null;
      });
   }

   private boolean d(long $$0) {
      boolean $$1 = this.a($$0, $$0x -> $$0x.cX().forEach(this::g));
      if (!$$1) {
         return false;
      } else {
         this.i.remove($$0);
         return true;
      }
   }

   private void g(dwo $$0) {
      $$0.b(bsh.d.c);
      $$0.a(dwp.a);
   }

   private void g() {
      this.j.removeIf($$0 -> this.h.get($$0) != dxb.a ? true : this.d($$0));
   }

   private void h() {
      dwm<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), dwz.b.c);
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
         Entry<dwz.b> $$1 = (Entry<dwz.b>)var2.next();
         if ($$1.getValue() == dwz.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.i().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == dxb.a;
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
            boolean $$1 = this.h.get($$0x) == dxb.a;
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

   public dwx<T> d() {
      return this.g;
   }

   public boolean a(ja $$0) {
      return ((dxb)this.h.get(dbn.a($$0))).a();
   }

   public boolean a(dbn $$0) {
      return ((dxb)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == dwz.b.c;
   }

   public void a(Writer $$0) throws IOException {
      axf $$1 = axf.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         dwz.b $$2 = (dwz.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            dws<T> $$3 = this.f.d($$2x);
            if ($$3 != null) {
               try {
                  $$1.a(kc.b($$2x), kc.c($$2x), kc.d($$2x), $$3.c(), $$2, $$3.d());
               } catch (IOException var7) {
                  throw new UncheckedIOException(var7);
               }
            }
         });
      });
   }

   @azl
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   @azl
   public int f() {
      return this.e.b();
   }

   class a implements dwp {
      private final T c;
      private long d;
      private dws<T> e;

      a(final T $$0, final long $$1, final dws<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ja $$0 = this.c.dr();
         long $$1 = kc.c($$0);
         if ($$1 != this.d) {
            dxb $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dwz.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kc.a(this.d), $$1});
            }

            dwz.this.a(this.d, this.e);
            dws<T> $$3 = dwz.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(dxb $$0, dxb $$1) {
         dxb $$2 = dwz.a(this.c, $$0);
         dxb $$3 = dwz.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               dwz.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               dwz.this.f(this.c);
            } else if (!$$4 && $$5) {
               dwz.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               dwz.this.d(this.c);
            } else if (!$$6 && $$7) {
               dwz.this.c(this.c);
            }

            if ($$5) {
               dwz.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(bsh.d $$0) {
         if (!this.e.b(this.c)) {
            dwz.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kc.a(this.d), $$0});
         }

         dxb $$1 = dwz.a(this.c, this.e.c());
         if ($$1.a()) {
            dwz.this.d(this.c);
         }

         if ($$1.b()) {
            dwz.this.f(this.c);
         }

         if ($$0.a()) {
            dwz.this.c.f(this.c);
         }

         dwz.this.b.remove(this.c.cB());
         this.c.a(a);
         dwz.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
