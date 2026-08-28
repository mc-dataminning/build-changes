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

public class ecb<T extends ebq> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final eby<T> c;
   private final ebt<T> d;
   private final ebs<T> e;
   final ebv<T> f;
   private final ebz<T> g;
   private final Long2ObjectMap<ecd> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<ecb.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<ebo<T>> k = Queues.newConcurrentLinkedQueue();

   public ecb(Class<T> $$0, eby<T> $$1, ebt<T> $$2) {
      this.e = new ebs<>();
      this.f = new ebv<>($$0, this.h);
      this.h.defaultReturnValue(ecd.a);
      this.i.defaultReturnValue(ecb.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new eca<>(this.e, this.f);
   }

   void a(long $$0, ebu<T> $$1) {
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
         long $$2 = kj.c($$0.dv());
         ebu<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new ecb.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         ecd $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends ebq> ecd a(T $$0, ecd $$1) {
      return $$0.dU() ? ecd.c : $$1;
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

   public void a(dgg $$0, arw $$1) {
      ecd $$2 = ecd.a($$1);
      this.a($$0, $$2);
   }

   public void a(dgg $$0, ecd $$1) {
      long $$2 = $$0.a();
      if ($$1 == ecd.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         ecd $$2x = $$1x.a($$1);
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
      ecb.b $$1 = (ecb.b)this.i.get($$0);
      if ($$1 == ecb.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      ecb.b $$2 = (ecb.b)this.i.get($$0);
      if ($$2 == ecb.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(ebq::dT)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == ecb.b.c) {
               this.d.a(new ebo<>(new dgg($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == ecb.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new ebo<>(new dgg($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, ecb.b.b);
      dgg $$1 = new dgg($$0);
      this.d.a($$1).thenAccept(this.k::add).exceptionally($$1x -> {
         a.error("Failed to read chunk {}", $$1, $$1x);
         return null;
      });
   }

   private boolean d(long $$0) {
      boolean $$1 = this.a($$0, $$0x -> $$0x.dc().forEach(this::g));
      if (!$$1) {
         return false;
      } else {
         this.i.remove($$0);
         return true;
      }
   }

   private void g(ebq $$0) {
      $$0.c(bvf.c.c);
      $$0.a(ebr.a);
   }

   private void g() {
      this.j.removeIf($$0 -> this.h.get($$0) != ecd.a ? true : this.d($$0));
   }

   private void h() {
      ebo<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), ecb.b.c);
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
         Entry<ecb.b> $$1 = (Entry<ecb.b>)var2.next();
         if ($$1.getValue() == ecb.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.i().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == ecd.a;
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
            boolean $$1 = this.h.get($$0x) == ecd.a;
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

   public ebz<T> d() {
      return this.g;
   }

   public boolean a(jh $$0) {
      return ((ecd)this.h.get(dgg.a($$0))).a();
   }

   public boolean a(dgg $$0) {
      return ((ecd)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == ecb.b.c;
   }

   public void a(Writer $$0) throws IOException {
      aze $$1 = aze.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         ecb.b $$2 = (ecb.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            ebu<T> $$3 = this.f.d($$2x);
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

   @bbl
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   @bbl
   public int f() {
      return this.e.b();
   }

   class a implements ebr {
      private final T c;
      private long d;
      private ebu<T> e;

      a(final T $$0, final long $$1, final ebu<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jh $$0 = this.c.dv();
         long $$1 = kj.c($$0);
         if ($$1 != this.d) {
            ecd $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               ecb.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kj.a(this.d), $$1});
            }

            ecb.this.a(this.d, this.e);
            ebu<T> $$3 = ecb.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(ecd $$0, ecd $$1) {
         ecd $$2 = ecb.a(this.c, $$0);
         ecd $$3 = ecb.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               ecb.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               ecb.this.f(this.c);
            } else if (!$$4 && $$5) {
               ecb.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               ecb.this.d(this.c);
            } else if (!$$6 && $$7) {
               ecb.this.c(this.c);
            }

            if ($$5) {
               ecb.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(bvf.c $$0) {
         if (!this.e.b(this.c)) {
            ecb.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kj.a(this.d), $$0});
         }

         ecd $$1 = ecb.a(this.c, this.e.c());
         if ($$1.a()) {
            ecb.this.d(this.c);
         }

         if ($$1.b()) {
            ecb.this.f(this.c);
         }

         if ($$0.a()) {
            ecb.this.c.f(this.c);
         }

         ecb.this.b.remove(this.c.cG());
         this.c.a(a);
         ecb.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
