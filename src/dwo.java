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

public class dwo<T extends dwd> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final dwl<T> c;
   private final dwg<T> d;
   private final dwf<T> e;
   final dwi<T> f;
   private final dwm<T> g;
   private final Long2ObjectMap<dwq> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<dwo.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<dwb<T>> k = Queues.newConcurrentLinkedQueue();

   public dwo(Class<T> $$0, dwl<T> $$1, dwg<T> $$2) {
      this.e = new dwf<>();
      this.f = new dwi<>($$0, this.h);
      this.h.defaultReturnValue(dwq.a);
      this.i.defaultReturnValue(dwo.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new dwn<>(this.e, this.f);
   }

   void a(long $$0, dwh<T> $$1) {
      if ($$1.a()) {
         this.f.e($$0);
      }
   }

   private boolean b(T $$0) {
      if (!this.b.add($$0.cz())) {
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
         long $$2 = kb.c($$0.dp());
         dwh<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new dwo.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         dwq $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends dwd> dwq a(T $$0, dwq $$1) {
      return $$0.dO() ? dwq.c : $$1;
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

   public void a(dbg $$0, aqy $$1) {
      dwq $$2 = dwq.a($$1);
      this.a($$0, $$2);
   }

   public void a(dbg $$0, dwq $$1) {
      long $$2 = $$0.a();
      if ($$1 == dwq.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         dwq $$2x = $$1x.a($$1);
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
      dwo.b $$1 = (dwo.b)this.i.get($$0);
      if ($$1 == dwo.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      dwo.b $$2 = (dwo.b)this.i.get($$0);
      if ($$2 == dwo.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(dwd::dN)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == dwo.b.c) {
               this.d.a(new dwb<>(new dbg($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == dwo.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new dwb<>(new dbg($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, dwo.b.b);
      dbg $$1 = new dbg($$0);
      this.d.a($$1).thenAccept(this.k::add).exceptionally($$1x -> {
         a.error("Failed to read chunk {}", $$1, $$1x);
         return null;
      });
   }

   private boolean d(long $$0) {
      boolean $$1 = this.a($$0, $$0x -> $$0x.cV().forEach(this::g));
      if (!$$1) {
         return false;
      } else {
         this.i.remove($$0);
         return true;
      }
   }

   private void g(dwd $$0) {
      $$0.b(bsv.c.c);
      $$0.a(dwe.a);
   }

   private void g() {
      this.j.removeIf($$0 -> this.h.get($$0) != dwq.a ? true : this.d($$0));
   }

   private void h() {
      dwb<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), dwo.b.c);
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
         Entry<dwo.b> $$1 = (Entry<dwo.b>)var2.next();
         if ($$1.getValue() == dwo.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.i().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == dwq.a;
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
            boolean $$1 = this.h.get($$0x) == dwq.a;
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

   public dwm<T> d() {
      return this.g;
   }

   public boolean a(iz $$0) {
      return ((dwq)this.h.get(dbg.a($$0))).a();
   }

   public boolean a(dbg $$0) {
      return ((dwq)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == dwo.b.c;
   }

   public void a(Writer $$0) throws IOException {
      axy $$1 = axy.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         dwo.b $$2 = (dwo.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            dwh<T> $$3 = this.f.d($$2x);
            if ($$3 != null) {
               try {
                  $$1.a(kb.b($$2x), kb.c($$2x), kb.d($$2x), $$3.c(), $$2, $$3.d());
               } catch (IOException var7) {
                  throw new UncheckedIOException(var7);
               }
            }
         });
      });
   }

   @bad
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   @bad
   public int f() {
      return this.e.b();
   }

   class a implements dwe {
      private final T c;
      private long d;
      private dwh<T> e;

      a(final T $$0, final long $$1, final dwh<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iz $$0 = this.c.dp();
         long $$1 = kb.c($$0);
         if ($$1 != this.d) {
            dwq $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dwo.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, kb.a(this.d), $$1});
            }

            dwo.this.a(this.d, this.e);
            dwh<T> $$3 = dwo.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(dwq $$0, dwq $$1) {
         dwq $$2 = dwo.a(this.c, $$0);
         dwq $$3 = dwo.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               dwo.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               dwo.this.f(this.c);
            } else if (!$$4 && $$5) {
               dwo.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               dwo.this.d(this.c);
            } else if (!$$6 && $$7) {
               dwo.this.c(this.c);
            }

            if ($$5) {
               dwo.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(bsv.c $$0) {
         if (!this.e.b(this.c)) {
            dwo.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, kb.a(this.d), $$0});
         }

         dwq $$1 = dwo.a(this.c, this.e.c());
         if ($$1.a()) {
            dwo.this.d(this.c);
         }

         if ($$1.b()) {
            dwo.this.f(this.c);
         }

         if ($$0.a()) {
            dwo.this.c.f(this.c);
         }

         dwo.this.b.remove(this.c.cz());
         this.c.a(a);
         dwo.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
