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

public class djg<T extends div> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final djd<T> c;
   private final diy<T> d;
   private final dix<T> e;
   final dja<T> f;
   private final dje<T> g;
   private final Long2ObjectMap<dji> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<djg.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<dit<T>> k = Queues.newConcurrentLinkedQueue();

   public djg(Class<T> $$0, djd<T> $$1, diy<T> $$2) {
      this.e = new dix<>();
      this.f = new dja<>($$0, this.h);
      this.h.defaultReturnValue(dji.a);
      this.i.defaultReturnValue(djg.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new djf<>(this.e, this.f);
   }

   void a(long $$0, diz<T> $$1) {
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
         long $$2 = hz.c($$0.dk());
         diz<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new djg.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         dji $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends div> dji a(T $$0, dji $$1) {
      return $$0.dJ() ? dji.c : $$1;
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

   public void a(cox $$0, akg $$1) {
      dji $$2 = dji.a($$1);
      this.a($$0, $$2);
   }

   public void a(cox $$0, dji $$1) {
      long $$2 = $$0.a();
      if ($$1 == dji.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         dji $$2x = $$1x.a($$1);
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
      djg.b $$1 = (djg.b)this.i.get($$0);
      if ($$1 == djg.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      djg.b $$2 = (djg.b)this.i.get($$0);
      if ($$2 == djg.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(div::dI)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == djg.b.c) {
               this.d.a(new dit<>(new cox($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == djg.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new dit<>(new cox($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, djg.b.b);
      cox $$1 = new cox($$0);
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

   private void g(div $$0) {
      $$0.b(bil.c.c);
      $$0.a(diw.a);
   }

   private void f() {
      this.j.removeIf($$0 -> this.h.get($$0) != dji.a ? true : this.d($$0));
   }

   private void g() {
      dit<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), djg.b.c);
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
         Entry<djg.b> $$1 = (Entry<djg.b>)var2.next();
         if ($$1.getValue() == djg.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.h().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == dji.a;
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
            boolean $$1 = this.h.get($$0x) == dji.a;
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

   public dje<T> d() {
      return this.g;
   }

   public boolean a(gw $$0) {
      return ((dji)this.h.get(cox.a($$0))).a();
   }

   public boolean a(cox $$0) {
      return ((dji)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == djg.b.c;
   }

   public void a(Writer $$0) throws IOException {
      aqu $$1 = aqu.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         djg.b $$2 = (djg.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            diz<T> $$3 = this.f.d($$2x);
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

   @ast
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   class a implements diw {
      private final T c;
      private long d;
      private diz<T> e;

      a(T $$0, long $$1, diz<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         gw $$0 = this.c.dk();
         long $$1 = hz.c($$0);
         if ($$1 != this.d) {
            dji $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               djg.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, hz.a(this.d), $$1});
            }

            djg.this.a(this.d, this.e);
            diz<T> $$3 = djg.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(dji $$0, dji $$1) {
         dji $$2 = djg.a(this.c, $$0);
         dji $$3 = djg.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               djg.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               djg.this.f(this.c);
            } else if (!$$4 && $$5) {
               djg.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               djg.this.d(this.c);
            } else if (!$$6 && $$7) {
               djg.this.c(this.c);
            }

            if ($$5) {
               djg.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(bil.c $$0) {
         if (!this.e.b(this.c)) {
            djg.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, hz.a(this.d), $$0});
         }

         dji $$1 = djg.a(this.c, this.e.c());
         if ($$1.a()) {
            djg.this.d(this.c);
         }

         if ($$1.b()) {
            djg.this.f(this.c);
         }

         if ($$0.a()) {
            djg.this.c.f(this.c);
         }

         djg.this.b.remove(this.c.cv());
         this.c.a(a);
         djg.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
