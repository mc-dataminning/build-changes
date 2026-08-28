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

public class efw<T extends efl> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final eft<T> c;
   private final efo<T> d;
   private final efn<T> e;
   final efq<T> f;
   private final efu<T> g;
   private final Long2ObjectMap<ega> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<efw.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<efj<T>> k = Queues.newConcurrentLinkedQueue();

   public efw(Class<T> $$0, eft<T> $$1, efo<T> $$2) {
      this.e = new efn<>();
      this.f = new efq<>($$0, this.h);
      this.h.defaultReturnValue(ega.a);
      this.i.defaultReturnValue(efw.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new efv<>(this.e, this.f);
   }

   void a(long $$0, efp<T> $$1) {
      if ($$1.a()) {
         this.f.e($$0);
      }
   }

   private boolean b(T $$0) {
      if (!this.b.add($$0.cG())) {
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
         long $$2 = jz.c($$0.dv());
         efp<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new efw.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         ega $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends efl> ega a(T $$0, ega $$1) {
      return $$0.dU() ? ega.c : $$1;
   }

   public boolean a(dje $$0) {
      return ((ega)this.h.get($$0.a())).a();
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

   public void a(dje $$0, ari $$1) {
      ega $$2 = ega.a($$1);
      this.a($$0, $$2);
   }

   public void a(dje $$0, ega $$1) {
      long $$2 = $$0.a();
      if ($$1 == ega.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         ega $$2x = $$1x.a($$1);
         boolean $$3 = $$2x.b();
         boolean $$4 = $$1.b();
         boolean $$5 = $$2x.a();
         boolean $$6 = $$1.a();
         if ($$5 && !$$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dU()).forEach(this::d);
         }

         if ($$3 && !$$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dU()).forEach(this::f);
         } else if (!$$3 && $$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dU()).forEach(this::e);
         }

         if (!$$5 && $$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dU()).forEach(this::c);
         }
      });
   }

   private void b(long $$0) {
      efw.b $$1 = (efw.b)this.i.get($$0);
      if ($$1 == efw.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      efw.b $$2 = (efw.b)this.i.get($$0);
      if ($$2 == efw.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(efl::dT)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == efw.b.c) {
               this.d.a(new efj<>(new dje($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == efw.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new efj<>(new dje($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, efw.b.b);
      dje $$1 = new dje($$0);
      this.d.a($$1).thenAccept(this.k::add).exceptionally($$1x -> {
         a.error("Failed to read chunk {}", $$1, $$1x);
         return null;
      });
   }

   private boolean d(long $$0) {
      boolean $$1 = this.a($$0, $$0x -> $$0x.db().forEach(this::g));
      if (!$$1) {
         return false;
      } else {
         this.i.remove($$0);
         return true;
      }
   }

   private void g(efl $$0) {
      $$0.c(bwv.d.c);
      $$0.a(efm.a);
   }

   private void g() {
      this.j.removeIf($$0 -> this.h.get($$0) != ega.a ? true : this.d($$0));
   }

   private void h() {
      efj<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), efw.b.c);
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
         Entry<efw.b> $$1 = (Entry<efw.b>)var2.next();
         if ($$1.getValue() == efw.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.i().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == ega.a;
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
            boolean $$1 = this.h.get($$0x) == ega.a;
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

   public efu<T> d() {
      return this.g;
   }

   public boolean a(iw $$0) {
      return ((ega)this.h.get(dje.a($$0))).a();
   }

   public boolean b(dje $$0) {
      return ((ega)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == efw.b.c;
   }

   public void a(Writer $$0) throws IOException {
      ayp $$1 = ayp.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         efw.b $$2 = (efw.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            efp<T> $$3 = this.f.d($$2x);
            if ($$3 != null) {
               try {
                  $$1.a(jz.b($$2x), jz.c($$2x), jz.d($$2x), $$3.c(), $$2, $$3.d());
               } catch (IOException var7) {
                  throw new UncheckedIOException(var7);
               }
            }
         });
      });
   }

   @baz
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   @baz
   public int f() {
      return this.e.b();
   }

   class a implements efm {
      private final T c;
      private long d;
      private efp<T> e;

      a(final T $$0, final long $$1, final efp<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iw $$0 = this.c.dv();
         long $$1 = jz.c($$0);
         if ($$1 != this.d) {
            ega $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               efw.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jz.a(this.d), $$1});
            }

            efw.this.a(this.d, this.e);
            efp<T> $$3 = efw.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(ega $$0, ega $$1) {
         ega $$2 = efw.a(this.c, $$0);
         ega $$3 = efw.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               efw.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               efw.this.f(this.c);
            } else if (!$$4 && $$5) {
               efw.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               efw.this.d(this.c);
            } else if (!$$6 && $$7) {
               efw.this.c(this.c);
            }

            if ($$5) {
               efw.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(bwv.d $$0) {
         if (!this.e.b(this.c)) {
            efw.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jz.a(this.d), $$0});
         }

         ega $$1 = efw.a(this.c, this.e.c());
         if ($$1.a()) {
            efw.this.d(this.c);
         }

         if ($$1.b()) {
            efw.this.f(this.c);
         }

         if ($$0.a()) {
            efw.this.c.f(this.c);
         }

         efw.this.b.remove(this.c.cG());
         this.c.a(a);
         efw.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
