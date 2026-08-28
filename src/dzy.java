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

public class dzy<T extends dzn> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final dzv<T> c;
   private final dzq<T> d;
   private final dzp<T> e;
   final dzs<T> f;
   private final dzw<T> g;
   private final Long2ObjectMap<eaa> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<dzy.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<dzl<T>> k = Queues.newConcurrentLinkedQueue();

   public dzy(Class<T> $$0, dzv<T> $$1, dzq<T> $$2) {
      this.e = new dzp<>();
      this.f = new dzs<>($$0, this.h);
      this.h.defaultReturnValue(eaa.a);
      this.i.defaultReturnValue(dzy.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new dzx<>(this.e, this.f);
   }

   void a(long $$0, dzr<T> $$1) {
      if ($$1.a()) {
         this.f.e($$0);
      }
   }

   private boolean b(T $$0) {
      if (!this.b.add($$0.cH())) {
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
         long $$2 = kj.c($$0.dx());
         dzr<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new dzy.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         eaa $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends dzn> eaa a(T $$0, eaa $$1) {
      return $$0.dW() ? eaa.c : $$1;
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

   public void a(deh $$0, ard $$1) {
      eaa $$2 = eaa.a($$1);
      this.a($$0, $$2);
   }

   public void a(deh $$0, eaa $$1) {
      long $$2 = $$0.a();
      if ($$1 == eaa.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         eaa $$2x = $$1x.a($$1);
         boolean $$3 = $$2x.b();
         boolean $$4 = $$1.b();
         boolean $$5 = $$2x.a();
         boolean $$6 = $$1.a();
         if ($$5 && !$$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dW()).forEach(this::d);
         }

         if ($$3 && !$$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dW()).forEach(this::f);
         } else if (!$$3 && $$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dW()).forEach(this::e);
         }

         if (!$$5 && $$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dW()).forEach(this::c);
         }
      });
   }

   private void b(long $$0) {
      dzy.b $$1 = (dzy.b)this.i.get($$0);
      if ($$1 == dzy.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      dzy.b $$2 = (dzy.b)this.i.get($$0);
      if ($$2 == dzy.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(dzn::dV)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == dzy.b.c) {
               this.d.a(new dzl<>(new deh($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == dzy.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new dzl<>(new deh($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, dzy.b.b);
      deh $$1 = new deh($$0);
      this.d.a($$1).thenAccept(this.k::add).exceptionally($$1x -> {
         a.error("Failed to read chunk {}", $$1, $$1x);
         return null;
      });
   }

   private boolean d(long $$0) {
      boolean $$1 = this.a($$0, $$0x -> $$0x.dd().forEach(this::g));
      if (!$$1) {
         return false;
      } else {
         this.i.remove($$0);
         return true;
      }
   }

   private void g(dzn $$0) {
      $$0.b(bue.c.c);
      $$0.a(dzo.a);
   }

   private void g() {
      this.j.removeIf($$0 -> this.h.get($$0) != eaa.a ? true : this.d($$0));
   }

   private void h() {
      dzl<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), dzy.b.c);
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
         Entry<dzy.b> $$1 = (Entry<dzy.b>)var2.next();
         if ($$1.getValue() == dzy.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.i().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == eaa.a;
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
            boolean $$1 = this.h.get($$0x) == eaa.a;
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

   public dzw<T> d() {
      return this.g;
   }

   public boolean a(jh $$0) {
      return ((eaa)this.h.get(deh.a($$0))).a();
   }

   public boolean a(deh $$0) {
      return ((eaa)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == dzy.b.c;
   }

   public void a(Writer $$0) throws IOException {
      ayk $$1 = ayk.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         dzy.b $$2 = (dzy.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            dzr<T> $$3 = this.f.d($$2x);
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

   @baq
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   @baq
   public int f() {
      return this.e.b();
   }

   class a implements dzo {
      private final T c;
      private long d;
      private dzr<T> e;

      a(final T $$0, final long $$1, final dzr<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         jh $$0 = this.c.dx();
         long $$1 = kj.c($$0);
         if ($$1 != this.d) {
            eaa $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dzy.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kj.a(this.d), $$1});
            }

            dzy.this.a(this.d, this.e);
            dzr<T> $$3 = dzy.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(eaa $$0, eaa $$1) {
         eaa $$2 = dzy.a(this.c, $$0);
         eaa $$3 = dzy.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               dzy.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               dzy.this.f(this.c);
            } else if (!$$4 && $$5) {
               dzy.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               dzy.this.d(this.c);
            } else if (!$$6 && $$7) {
               dzy.this.c(this.c);
            }

            if ($$5) {
               dzy.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(bue.c $$0) {
         if (!this.e.b(this.c)) {
            dzy.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kj.a(this.d), $$0});
         }

         eaa $$1 = dzy.a(this.c, this.e.c());
         if ($$1.a()) {
            dzy.this.d(this.c);
         }

         if ($$1.b()) {
            dzy.this.f(this.c);
         }

         if ($$0.a()) {
            dzy.this.c.f(this.c);
         }

         dzy.this.b.remove(this.c.cH());
         this.c.a(a);
         dzy.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
