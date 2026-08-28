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

public class eex<T extends eem> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final eeu<T> c;
   private final eep<T> d;
   private final eeo<T> e;
   final eer<T> f;
   private final eev<T> g;
   private final Long2ObjectMap<efb> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<eex.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<eek<T>> k = Queues.newConcurrentLinkedQueue();

   public eex(Class<T> $$0, eeu<T> $$1, eep<T> $$2) {
      this.e = new eeo<>();
      this.f = new eer<>($$0, this.h);
      this.h.defaultReturnValue(efb.a);
      this.i.defaultReturnValue(eex.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new eew<>(this.e, this.f);
   }

   void a(long $$0, eeq<T> $$1) {
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
         long $$2 = jx.c($$0.dv());
         eeq<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new eex.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         efb $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends eem> efb a(T $$0, efb $$1) {
      return $$0.dU() ? efb.c : $$1;
   }

   public boolean a(dih $$0) {
      return ((efb)this.h.get($$0.a())).a();
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

   public void a(dih $$0, are $$1) {
      efb $$2 = efb.a($$1);
      this.a($$0, $$2);
   }

   public void a(dih $$0, efb $$1) {
      long $$2 = $$0.a();
      if ($$1 == efb.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         efb $$2x = $$1x.a($$1);
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
      eex.b $$1 = (eex.b)this.i.get($$0);
      if ($$1 == eex.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      eex.b $$2 = (eex.b)this.i.get($$0);
      if ($$2 == eex.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(eem::dT)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == eex.b.c) {
               this.d.a(new eek<>(new dih($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == eex.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new eek<>(new dih($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, eex.b.b);
      dih $$1 = new dih($$0);
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

   private void g(eem $$0) {
      $$0.c(bwf.e.c);
      $$0.a(een.a);
   }

   private void g() {
      this.j.removeIf($$0 -> this.h.get($$0) != efb.a ? true : this.d($$0));
   }

   private void h() {
      eek<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), eex.b.c);
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
         Entry<eex.b> $$1 = (Entry<eex.b>)var2.next();
         if ($$1.getValue() == eex.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.i().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == efb.a;
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
            boolean $$1 = this.h.get($$0x) == efb.a;
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

   public eev<T> d() {
      return this.g;
   }

   public boolean a(iu $$0) {
      return ((efb)this.h.get(dih.a($$0))).a();
   }

   public boolean b(dih $$0) {
      return ((efb)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == eex.b.c;
   }

   public void a(Writer $$0) throws IOException {
      ayl $$1 = ayl.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         eex.b $$2 = (eex.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            eeq<T> $$3 = this.f.d($$2x);
            if ($$3 != null) {
               try {
                  $$1.a(jx.b($$2x), jx.c($$2x), jx.d($$2x), $$3.c(), $$2, $$3.d());
               } catch (IOException var7) {
                  throw new UncheckedIOException(var7);
               }
            }
         });
      });
   }

   @bav
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   @bav
   public int f() {
      return this.e.b();
   }

   class a implements een {
      private final T c;
      private long d;
      private eeq<T> e;

      a(final T $$0, final long $$1, final eeq<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         iu $$0 = this.c.dv();
         long $$1 = jx.c($$0);
         if ($$1 != this.d) {
            efb $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               eex.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, jx.a(this.d), $$1});
            }

            eex.this.a(this.d, this.e);
            eeq<T> $$3 = eex.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(efb $$0, efb $$1) {
         efb $$2 = eex.a(this.c, $$0);
         efb $$3 = eex.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               eex.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               eex.this.f(this.c);
            } else if (!$$4 && $$5) {
               eex.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               eex.this.d(this.c);
            } else if (!$$6 && $$7) {
               eex.this.c(this.c);
            }

            if ($$5) {
               eex.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(bwf.e $$0) {
         if (!this.e.b(this.c)) {
            eex.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, jx.a(this.d), $$0});
         }

         efb $$1 = eex.a(this.c, this.e.c());
         if ($$1.a()) {
            eex.this.d(this.c);
         }

         if ($$1.b()) {
            eex.this.f(this.c);
         }

         if ($$0.a()) {
            eex.this.c.f(this.c);
         }

         eex.this.b.remove(this.c.cG());
         this.c.a(a);
         eex.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
