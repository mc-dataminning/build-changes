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

public class dlk<T extends dkz> implements AutoCloseable {
   static final Logger a = LogUtils.getLogger();
   final Set<UUID> b = Sets.newHashSet();
   final dlh<T> c;
   private final dlc<T> d;
   private final dlb<T> e;
   final dle<T> f;
   private final dli<T> g;
   private final Long2ObjectMap<dlm> h = new Long2ObjectOpenHashMap();
   private final Long2ObjectMap<dlk.b> i = new Long2ObjectOpenHashMap();
   private final LongSet j = new LongOpenHashSet();
   private final Queue<dkx<T>> k = Queues.newConcurrentLinkedQueue();

   public dlk(Class<T> $$0, dlh<T> $$1, dlc<T> $$2) {
      this.e = new dlb<>();
      this.f = new dle<>($$0, this.h);
      this.h.defaultReturnValue(dlm.a);
      this.i.defaultReturnValue(dlk.b.a);
      this.c = $$1;
      this.d = $$2;
      this.g = new dlj<>(this.e, this.f);
   }

   void a(long $$0, dld<T> $$1) {
      if ($$1.a()) {
         this.f.e($$0);
      }
   }

   private boolean b(T $$0) {
      if (!this.b.add($$0.cw())) {
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
         long $$2 = iu.c($$0.dn());
         dld<T> $$3 = this.f.c($$2);
         $$3.a($$0);
         $$0.a(new dlk.a($$0, $$2, $$3));
         if (!$$1) {
            this.c.g($$0);
         }

         dlm $$4 = a($$0, $$3.c());
         if ($$4.b()) {
            this.e($$0);
         }

         if ($$4.a()) {
            this.c($$0);
         }

         return true;
      }
   }

   static <T extends dkz> dlm a(T $$0, dlm $$1) {
      return $$0.dM() ? dlm.c : $$1;
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

   public void a(crh $$0, alx $$1) {
      dlm $$2 = dlm.a($$1);
      this.a($$0, $$2);
   }

   public void a(crh $$0, dlm $$1) {
      long $$2 = $$0.a();
      if ($$1 == dlm.a) {
         this.h.remove($$2);
         this.j.add($$2);
      } else {
         this.h.put($$2, $$1);
         this.j.remove($$2);
         this.b($$2);
      }

      this.f.b($$2).forEach($$1x -> {
         dlm $$2x = $$1x.a($$1);
         boolean $$3 = $$2x.b();
         boolean $$4 = $$1.b();
         boolean $$5 = $$2x.a();
         boolean $$6 = $$1.a();
         if ($$5 && !$$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dM()).forEach(this::d);
         }

         if ($$3 && !$$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dM()).forEach(this::f);
         } else if (!$$3 && $$4) {
            $$1x.b().filter($$0xx -> !$$0xx.dM()).forEach(this::e);
         }

         if (!$$5 && $$6) {
            $$1x.b().filter($$0xx -> !$$0xx.dM()).forEach(this::c);
         }
      });
   }

   private void b(long $$0) {
      dlk.b $$1 = (dlk.b)this.i.get($$0);
      if ($$1 == dlk.b.a) {
         this.c($$0);
      }
   }

   private boolean a(long $$0, Consumer<T> $$1) {
      dlk.b $$2 = (dlk.b)this.i.get($$0);
      if ($$2 == dlk.b.b) {
         return false;
      } else {
         List<T> $$3 = this.f.b($$0).flatMap($$0x -> $$0x.b().filter(dkz::dL)).collect(Collectors.toList());
         if ($$3.isEmpty()) {
            if ($$2 == dlk.b.c) {
               this.d.a(new dkx<>(new crh($$0), ImmutableList.of()));
            }

            return true;
         } else if ($$2 == dlk.b.a) {
            this.c($$0);
            return false;
         } else {
            this.d.a(new dkx<>(new crh($$0), $$3));
            $$3.forEach($$1);
            return true;
         }
      }
   }

   private void c(long $$0) {
      this.i.put($$0, dlk.b.b);
      crh $$1 = new crh($$0);
      this.d.a($$1).thenAccept(this.k::add).exceptionally($$1x -> {
         a.error("Failed to read chunk {}", $$1, $$1x);
         return null;
      });
   }

   private boolean d(long $$0) {
      boolean $$1 = this.a($$0, $$0x -> $$0x.cT().forEach(this::g));
      if (!$$1) {
         return false;
      } else {
         this.i.remove($$0);
         return true;
      }
   }

   private void g(dkz $$0) {
      $$0.b(bkq.c.c);
      $$0.a(dla.a);
   }

   private void g() {
      this.j.removeIf($$0 -> this.h.get($$0) != dlm.a ? true : this.d($$0));
   }

   private void h() {
      dkx<T> $$0;
      while (($$0 = this.k.poll()) != null) {
         $$0.b().forEach($$0x -> this.a((T)$$0x, true));
         this.i.put($$0.a().a(), dlk.b.c);
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
         Entry<dlk.b> $$1 = (Entry<dlk.b>)var2.next();
         if ($$1.getValue() == dlk.b.c) {
            $$0.add($$1.getLongKey());
         }
      }

      return $$0;
   }

   public void b() {
      this.i().forEach($$0 -> {
         boolean $$1 = this.h.get($$0) == dlm.a;
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
            boolean $$1 = this.h.get($$0x) == dlm.a;
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

   public dli<T> d() {
      return this.g;
   }

   public boolean a(ht $$0) {
      return ((dlm)this.h.get(crh.a($$0))).a();
   }

   public boolean a(crh $$0) {
      return ((dlm)this.h.get($$0.a())).a();
   }

   public boolean a(long $$0) {
      return this.i.get($$0) == dlk.b.c;
   }

   public void a(Writer $$0) throws IOException {
      asn $$1 = asn.a().a("x").a("y").a("z").a("visibility").a("load_status").a("entity_count").a($$0);
      this.f.a().forEach($$1x -> {
         dlk.b $$2 = (dlk.b)this.i.get($$1x);
         this.f.a($$1x).forEach($$2x -> {
            dld<T> $$3 = this.f.d($$2x);
            if ($$3 != null) {
               try {
                  $$1.a(iu.b($$2x), iu.c($$2x), iu.d($$2x), $$3.c(), $$2, $$3.d());
               } catch (IOException var7) {
                  throw new UncheckedIOException(var7);
               }
            }
         });
      });
   }

   @aup
   public String e() {
      return this.b.size() + "," + this.e.b() + "," + this.f.b() + "," + this.i.size() + "," + this.h.size() + "," + this.k.size() + "," + this.j.size();
   }

   @aup
   public int f() {
      return this.e.b();
   }

   class a implements dla {
      private final T c;
      private long d;
      private dld<T> e;

      a(T $$0, long $$1, dld<T> $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }

      @Override
      public void a() {
         ht $$0 = this.c.dn();
         long $$1 = iu.c($$0);
         if ($$1 != this.d) {
            dlm $$2 = this.e.c();
            if (!this.e.b(this.c)) {
               dlk.a.warn("Entity {} wasn't found in section {} (moving to {})", new Object[]{this.c, iu.a(this.d), $$1});
            }

            dlk.this.a(this.d, this.e);
            dld<T> $$3 = dlk.this.f.c($$1);
            $$3.a(this.c);
            this.e = $$3;
            this.d = $$1;
            this.a($$2, $$3.c());
         }
      }

      private void a(dlm $$0, dlm $$1) {
         dlm $$2 = dlk.a(this.c, $$0);
         dlm $$3 = dlk.a(this.c, $$1);
         if ($$2 == $$3) {
            if ($$3.b()) {
               dlk.this.c.a(this.c);
            }
         } else {
            boolean $$4 = $$2.b();
            boolean $$5 = $$3.b();
            if ($$4 && !$$5) {
               dlk.this.f(this.c);
            } else if (!$$4 && $$5) {
               dlk.this.e(this.c);
            }

            boolean $$6 = $$2.a();
            boolean $$7 = $$3.a();
            if ($$6 && !$$7) {
               dlk.this.d(this.c);
            } else if (!$$6 && $$7) {
               dlk.this.c(this.c);
            }

            if ($$5) {
               dlk.this.c.a(this.c);
            }
         }
      }

      @Override
      public void a(bkq.c $$0) {
         if (!this.e.b(this.c)) {
            dlk.a.warn("Entity {} wasn't found in section {} (destroying due to {})", new Object[]{this.c, iu.a(this.d), $$0});
         }

         dlm $$1 = dlk.a(this.c, this.e.c());
         if ($$1.a()) {
            dlk.this.d(this.c);
         }

         if ($$1.b()) {
            dlk.this.f(this.c);
         }

         if ($$0.a()) {
            dlk.this.c.f(this.c);
         }

         dlk.this.b.remove(this.c.cw());
         this.c.a(a);
         dlk.this.a(this.d, this.e);
      }
   }

   static enum b {
      a,
      b,
      c;
   }
}
