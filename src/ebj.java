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

public class ebj<T extends eay> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final ebg<T> c;
   private final ebb<T> d;
   private final eba<T> e;
   final ebd<T> f;
   private final ebh<T> g;
   private final Long2ObjectMap<ebl> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<ebj.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<eaw<T>> k = Queues.newConcurrentLinkedQueue();

   public ebj(Class<T> $$0, ebg<T> $$1, ebb<T> $$2) {
      this.e = new eba<>();
      this.f = new ebd<>($$0, this.h);
      this.h.defaultReturnValue(ebl.a);
      this.i.defaultReturnValue(ebj.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new ebi<>(this.e, this.f);
   }

   void a(long $$0, ebc<T> $$1) {
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
         long $$2 = kk.c($$0.dw());
         ebc<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new ebj.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         ebl $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends eay> ebl a(T $$0, ebl $$1) {
      return $$0.dV() ? ebl.c : $$1;
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

   public void a(dfm $$0, aqr $$1) {
      ebl $$2 = ebl.a($$1);
      this.a($$0, $$2);
   }

   public void a(dfm $$0, ebl $$1) {
      long $$2 = $$0.a();
      if ($$1 == ebl.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         ebl $$2x = $$1x.a($$1);
         boolean $$3 = $$2x.b();
         boolean $$4 = $$1.b();
         boolean $$5 = $$2x.a();
         boolean $$6 = $$1.a();
         if ($$5 && !$$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dV()).forEach(this::d);
         }

         if ($$3 && !$$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dV()).forEach(this::f);
         } else if (!$$3 && $$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dV()).forEach(this::e);
         }

         if (!$$5 && $$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dV()).forEach(this::c);
         }
      });
   }

   private void b(long $$0) {
      ebj.b $$1 = (ebj.b)this.i.get($$0);
      if ($$1 == ebj.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      ebj.b $$2 = (ebj.b)this.i.get($$0);
      if ($$2 == ebj.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(eay::dU)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == ebj.b.c) {
               this.d.a(new eaw<>(new dfm($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == ebj.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new eaw<>(new dfm($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, ebj.b.b);
      dfm $$1 = new dfm($$0);
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

   private void g(eay $$0) {
      $$0.c(buj.d.c);
      $$0.a(eaz.a);
   }

   private void g() {
      this.j.removeIf($$0 -> this.h.get($$0) != ebl.a ? true : this.d($$0));
   }

   private void h() {
      eaw<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), ebj.b.c);
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
         Entry<ebj.b> $$1 = (Entry<ebj.b>)var2.next();
         if ($$1.getValue() == ebj.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.i().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == ebl.a;
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
            boolean $$1 = this.h.get($$0x) == ebl.a;
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

   public ebh<T> d() {
      return this.g;
   }

   public boolean a(ji $$0) {
      return ((ebl)this.h.get(dfm.a($$0))).a();
   }

   public boolean a(dfm $$0) {
      return ((ebl)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == ebj.b.c;
   }

   public void a(Writer $$0) throws IOException {
      axy $$1 = axy.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         ebj.b $$2 = (ebj.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            ebc<T> $$3 = this.f.d($$2x);
            if ($$3 != null) {
               try {
                  $$1.a(kk.b($$2x), kk.c($$2x), kk.d($$2x), $$3.c(), $$2, $$3.d());
               } catch (IOException var7) {
                  throw new UncheckedIOException(var7);
               }
            }
         });
      });
   }

   @baf
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   @baf
   public int f() {
      return this.e.b();
   }

   class a implements eaz {
      private final T c;
      private long d;
      private ebc<T> e;

      a(final T $$0, final long $$1, final ebc<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ji $$0 = this.c.dw();
         long $$1 = kk.c($$0);
         if ($$1 != this.d) {
            ebl $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               ebj.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kk.a(this.d), $$1});
            }

            ebj.this.a(this.d, this.e);
            ebc<T> $$3 = ebj.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(ebl $$0, ebl $$1) {
         ebl $$2 = ebj.a(this.c, $$0);
         ebl $$3 = ebj.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               ebj.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               ebj.this.f(this.c);
            } else if (!$$4 && $$5) {
               ebj.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               ebj.this.d(this.c);
            } else if (!$$6 && $$7) {
               ebj.this.c(this.c);
            }

            if ($$5) {
               ebj.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(buj.d $$0) {
         if (!this.e.b(this.c)) {
            ebj.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kk.a(this.d), $$0});
         }

         ebl $$1 = ebj.a(this.c, this.e.c());
         if ($$1.a()) {
            ebj.this.d(this.c);
         }

         if ($$1.b()) {
            ebj.this.f(this.c);
         }

         if ($$0.a()) {
            ebj.this.c.f(this.c);
         }

         ebj.this.b.remove(this.c.cG());
         this.c.a(a);
         ebj.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
