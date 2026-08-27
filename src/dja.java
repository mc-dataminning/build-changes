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

public class dja<T extends dip> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final dix<T> c;
   private final dis<T> d;
   private final dir<T> e;
   final diu<T> f;
   private final diy<T> g;
   private final Long2ObjectMap<djc> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<dja.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<din<T>> k = Queues.newConcurrentLinkedQueue();

   public dja(Class<T> $$0, dix<T> $$1, dis<T> $$2) {
      this.e = new dir<>();
      this.f = new diu<>($$0, this.h);
      this.h.defaultReturnValue(djc.a);
      this.i.defaultReturnValue(dja.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new diz<>(this.e, this.f);
   }

   void a(long $$0, dit<T> $$1) {
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
         long $$2 = hy.c($$0.dk());
         dit<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new dja.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         djc $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends dip> djc a(T $$0, djc $$1) {
      return $$0.dJ() ? djc.c : $$1;
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

   public void a(cor $$0, akb $$1) {
      djc $$2 = djc.a($$1);
      this.a($$0, $$2);
   }

   public void a(cor $$0, djc $$1) {
      long $$2 = $$0.a();
      if ($$1 == djc.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         djc $$2x = $$1x.a($$1);
         boolean $$3 = $$2x.b();
         boolean $$4 = $$1.b();
         boolean $$5 = $$2x.a();
         boolean $$6 = $$1.a();
         if ($$5 && !$$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dJ()).forEach(this::d);
         }

         if ($$3 && !$$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dJ()).forEach(this::f);
         } else if (!$$3 && $$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dJ()).forEach(this::e);
         }

         if (!$$5 && $$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dJ()).forEach(this::c);
         }
      });
   }

   private void b(long $$0) {
      dja.b $$1 = (dja.b)this.i.get($$0);
      if ($$1 == dja.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      dja.b $$2 = (dja.b)this.i.get($$0);
      if ($$2 == dja.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(dip::dI)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == dja.b.c) {
               this.d.a(new din<>(new cor($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == dja.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new din<>(new cor($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, dja.b.b);
      cor $$1 = new cor($$0);
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

   private void g(dip $$0) {
      $$0.b(big.c.c);
      $$0.a(diq.a);
   }

   private void f() {
      this.j.removeIf($$0 -> this.h.get($$0) != djc.a ? true : this.d($$0));
   }

   private void g() {
      din<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), dja.b.c);
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
         Entry<dja.b> $$1 = (Entry<dja.b>)var2.next();
         if ($$1.getValue() == dja.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.h().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == djc.a;
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
            boolean $$1 = this.h.get($$0x) == djc.a;
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

   public diy<T> d() {
      return this.g;
   }

   public boolean a(gv $$0) {
      return ((djc)this.h.get(cor.a($$0))).a();
   }

   public boolean a(cor $$0) {
      return ((djc)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == dja.b.c;
   }

   public void a(Writer $$0) throws IOException {
      aqp $$1 = aqp.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         dja.b $$2 = (dja.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            dit<T> $$3 = this.f.d($$2x);
            if ($$3 != null) {
               try {
                  $$1.a(hy.b($$2x), hy.c($$2x), hy.d($$2x), $$3.c(), $$2, $$3.d());
               } catch (IOException var7) {
                  throw new UncheckedIOException(var7);
               }
            }
         });
      });
   }

   @aso
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   class a implements diq {
      private final T c;
      private long d;
      private dit<T> e;

      a(T $$0, long $$1, dit<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         gv $$0 = this.c.dk();
         long $$1 = hy.c($$0);
         if ($$1 != this.d) {
            djc $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dja.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, hy.a(this.d), $$1});
            }

            dja.this.a(this.d, this.e);
            dit<T> $$3 = dja.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(djc $$0, djc $$1) {
         djc $$2 = dja.a(this.c, $$0);
         djc $$3 = dja.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               dja.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               dja.this.f(this.c);
            } else if (!$$4 && $$5) {
               dja.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               dja.this.d(this.c);
            } else if (!$$6 && $$7) {
               dja.this.c(this.c);
            }

            if ($$5) {
               dja.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(big.c $$0) {
         if (!this.e.b(this.c)) {
            dja.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, hy.a(this.d), $$0});
         }

         djc $$1 = dja.a(this.c, this.e.c());
         if ($$1.a()) {
            dja.this.d(this.c);
         }

         if ($$1.b()) {
            dja.this.f(this.c);
         }

         if ($$0.a()) {
            dja.this.c.f(this.c);
         }

         dja.this.b.remove(this.c.cv());
         this.c.a(a);
         dja.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
