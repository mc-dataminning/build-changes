import com.mojang.logging.LogUtils;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.EncoderException;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;

public class aih {
   private static final Logger a = LogUtils.getLogger();
   private static final Object2IntMap<Class<? extends bnq>> b = new Object2IntOpenHashMap();
   private static final int c = 254;
   private final bnq d;
   private final Int2ObjectMap<aih.a<?>> e = new Int2ObjectOpenHashMap();
   private final ReadWriteLock f = new ReentrantReadWriteLock();
   private boolean g;

   public aih(bnq $$0) {
      this.d = $$0;
   }

   public static <T> aie<T> a(Class<? extends bnq> $$0, aif<T> $$1) {
      if (a.isDebugEnabled()) {
         try {
            Class<?> $$2 = Class.forName(Thread.currentThread().getStackTrace()[2].getClassName());
            if (!$$2.equals($$0)) {
               a.debug("defineId called for: {} from {}", new Object[]{$$0, $$2, new RuntimeException()});
            }
         } catch (ClassNotFoundException var5) {
         }
      }

      int $$3;
      if (b.containsKey($$0)) {
         $$3 = b.getInt($$0) + 1;
      } else {
         int $$4 = 0;
         Class<?> $$5 = $$0;

         while ($$5 != bnq.class) {
            $$5 = $$5.getSuperclass();
            if (b.containsKey($$5)) {
               $$4 = b.getInt($$5) + 1;
               break;
            }
         }

         $$3 = $$4;
      }

      if ($$3 > 254) {
         throw new IllegalArgumentException("Data value id is too big with " + $$3 + "! (Max is 254)");
      } else {
         b.put($$0, $$3);
         return $$1.a($$3);
      }
   }

   public <T> void a(aie<T> $$0, T $$1) {
      int $$2 = $$0.a();
      if ($$2 > 254) {
         throw new IllegalArgumentException("Data value id is too big with " + $$2 + "! (Max is 254)");
      } else if (this.e.containsKey($$2)) {
         throw new IllegalArgumentException("Duplicate id value for " + $$2 + "!");
      } else if (aig.b($$0.b()) < 0) {
         throw new IllegalArgumentException("Unregistered serializer " + $$0.b() + " for " + $$2 + "!");
      } else {
         this.c($$0, $$1);
      }
   }

   private <T> void c(aie<T> $$0, T $$1) {
      aih.a<T> $$2 = new aih.a<>($$0, $$1);
      this.f.writeLock().lock();
      this.e.put($$0.a(), $$2);
      this.f.writeLock().unlock();
   }

   public <T> boolean a(aie<T> $$0) {
      return this.e.containsKey($$0.a());
   }

   private <T> aih.a<T> c(aie<T> $$0) {
      this.f.readLock().lock();

      aih.a<T> $$1;
      try {
         $$1 = (aih.a<T>)this.e.get($$0.a());
      } catch (Throwable var9) {
         o $$3 = o.a(var9, "Getting synched entity data");
         p $$4 = $$3.a("Synched entity data");
         $$4.a("Data ID", $$0);
         throw new y($$3);
      } finally {
         this.f.readLock().unlock();
      }

      return $$1;
   }

   public <T> T b(aie<T> $$0) {
      return this.c($$0).b();
   }

   public <T> void b(aie<T> $$0, T $$1) {
      this.a($$0, $$1, false);
   }

   public <T> void a(aie<T> $$0, T $$1, boolean $$2) {
      aih.a<T> $$3 = this.c($$0);
      if ($$2 || ObjectUtils.notEqual($$1, $$3.b())) {
         $$3.a($$1);
         this.d.a($$0);
         $$3.a(true);
         this.g = true;
      }
   }

   public boolean a() {
      return this.g;
   }

   @Nullable
   public List<aih.b<?>> b() {
      List<aih.b<?>> $$0 = null;
      if (this.g) {
         this.f.readLock().lock();
         ObjectIterator var2 = this.e.values().iterator();

         while (var2.hasNext()) {
            aih.a<?> $$1 = (aih.a<?>)var2.next();
            if ($$1.c()) {
               $$1.a(false);
               if ($$0 == null) {
                  $$0 = new ArrayList<>();
               }

               $$0.add($$1.e());
            }
         }

         this.f.readLock().unlock();
      }

      this.g = false;
      return $$0;
   }

   @Nullable
   public List<aih.b<?>> c() {
      List<aih.b<?>> $$0 = null;
      this.f.readLock().lock();
      ObjectIterator var2 = this.e.values().iterator();

      while (var2.hasNext()) {
         aih.a<?> $$1 = (aih.a<?>)var2.next();
         if (!$$1.d()) {
            if ($$0 == null) {
               $$0 = new ArrayList<>();
            }

            $$0.add($$1.e());
         }
      }

      this.f.readLock().unlock();
      return $$0;
   }

   public void a(List<aih.b<?>> $$0) {
      this.f.writeLock().lock();

      try {
         for (aih.b<?> $$1 : $$0) {
            aih.a<?> $$2 = (aih.a<?>)this.e.get($$1.a);
            if ($$2 != null) {
               this.a($$2, $$1);
               this.d.a($$2.a());
            }
         }
      } finally {
         this.f.writeLock().unlock();
      }

      this.d.b($$0);
   }

   private <T> void a(aih.a<T> $$0, aih.b<?> $$1) {
      if (!Objects.equals($$1.b(), $$0.a.b())) {
         throw new IllegalStateException(
            String.format(
               Locale.ROOT,
               "Invalid entity data item type for field %d on entity %s: old=%s(%s), new=%s(%s)",
               $$0.a.a(),
               this.d,
               $$0.b,
               $$0.b.getClass(),
               $$1.c,
               $$1.c.getClass()
            )
         );
      } else {
         $$0.a((T)$$1.c);
      }
   }

   public boolean d() {
      return this.e.isEmpty();
   }

   public static class a<T> {
      final aie<T> a;
      T b;
      private final T c;
      private boolean d;

      public a(aie<T> $$0, T $$1) {
         this.a = $$0;
         this.c = $$1;
         this.b = $$1;
      }

      public aie<T> a() {
         return this.a;
      }

      public void a(T $$0) {
         this.b = $$0;
      }

      public T b() {
         return this.b;
      }

      public boolean c() {
         return this.d;
      }

      public void a(boolean $$0) {
         this.d = $$0;
      }

      public boolean d() {
         return this.c.equals(this.b);
      }

      public aih.b<T> e() {
         return aih.b.a(this.a, this.b);
      }
   }

   public static record b<T>(int a, aif<T> b, T c) {

      public static <T> aih.b<T> a(aie<T> $$0, T $$1) {
         aif<T> $$2 = $$0.b();
         return new aih.b<>($$0.a(), $$2, $$2.copy($$1));
      }

      public void a(vb $$0) {
         int $$1 = aig.b(this.b);
         if ($$1 < 0) {
            throw new EncoderException("Unknown serializer type " + this.b);
         } else {
            $$0.k(this.a);
            $$0.c($$1);
            this.b.codec().encode($$0, this.c);
         }
      }

      public static aih.b<?> a(vb $$0, int $$1) {
         int $$2 = $$0.n();
         aif<?> $$3 = aig.a($$2);
         if ($$3 == null) {
            throw new DecoderException("Unknown serializer type " + $$2);
         } else {
            return a($$0, $$1, $$3);
         }
      }

      private static <T> aih.b<T> a(vb $$0, int $$1, aif<T> $$2) {
         return new aih.b<>($$1, $$2, $$2.codec().decode($$0));
      }
   }
}
