import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.ToIntFunction;
import javax.annotation.Nullable;

public class fkd {
   private static final int a = 256;
   private final ThreadLocal<fkd.b> b = ThreadLocal.withInitial(fkd.b::new);
   private final Long2ObjectLinkedOpenHashMap<fkd.a> c = new Long2ObjectLinkedOpenHashMap(256, 0.25F);
   private final ReentrantReadWriteLock d = new ReentrantReadWriteLock();
   private final ToIntFunction<jg> e;

   public fkd(ToIntFunction<jg> $$0) {
      this.e = $$0;
   }

   public int a(jg $$0) {
      int $$1 = ki.a($$0.u());
      int $$2 = ki.a($$0.w());
      fkd.b $$3 = this.b.get();
      if ($$3.a != $$1 || $$3.b != $$2 || $$3.c == null || $$3.c.a()) {
         $$3.a = $$1;
         $$3.b = $$2;
         $$3.c = this.b($$1, $$2);
      }

      int[] $$4 = $$3.c.a($$0.v());
      int $$5 = $$0.u() & 15;
      int $$6 = $$0.w() & 15;
      int $$7 = $$6 << 4 | $$5;
      int $$8 = $$4[$$7];
      if ($$8 != -1) {
         return $$8;
      } else {
         int $$9 = this.e.applyAsInt($$0);
         $$4[$$7] = $$9;
         return $$9;
      }
   }

   public void a(int $$0, int $$1) {
      try {
         this.d.writeLock().lock();

         for (int $$2 = -1; $$2 <= 1; $$2++) {
            for (int $$3 = -1; $$3 <= 1; $$3++) {
               long $$4 = deb.c($$0 + $$2, $$1 + $$3);
               fkd.a $$5 = (fkd.a)this.c.remove($$4);
               if ($$5 != null) {
                  $$5.b();
               }
            }
         }
      } finally {
         this.d.writeLock().unlock();
      }
   }

   public void a() {
      try {
         this.d.writeLock().lock();
         this.c.values().forEach(fkd.a::b);
         this.c.clear();
      } finally {
         this.d.writeLock().unlock();
      }
   }

   private fkd.a b(int $$0, int $$1) {
      long $$2 = deb.c($$0, $$1);
      this.d.readLock().lock();

      try {
         fkd.a $$3 = (fkd.a)this.c.get($$2);
         if ($$3 != null) {
            return $$3;
         }
      } finally {
         this.d.readLock().unlock();
      }

      this.d.writeLock().lock();

      fkd.a $$5;
      try {
         fkd.a $$4 = (fkd.a)this.c.get($$2);
         if ($$4 == null) {
            $$5 = new fkd.a();
            if (this.c.size() >= 256) {
               fkd.a $$6 = (fkd.a)this.c.removeFirst();
               if ($$6 != null) {
                  $$6.b();
               }
            }

            this.c.put($$2, $$5);
            return $$5;
         }

         $$5 = $$4;
      } finally {
         this.d.writeLock().unlock();
      }

      return $$5;
   }

   static class a {
      private final Int2ObjectArrayMap<int[]> a = new Int2ObjectArrayMap(16);
      private final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
      private static final int c = azj.h(16);
      private volatile boolean d;

      public int[] a(int $$0) {
         this.b.readLock().lock();

         try {
            int[] $$1 = (int[])this.a.get($$0);
            if ($$1 != null) {
               return $$1;
            }
         } finally {
            this.b.readLock().unlock();
         }

         this.b.writeLock().lock();

         int[] var12;
         try {
            var12 = (int[])this.a.computeIfAbsent($$0, $$0x -> this.c());
         } finally {
            this.b.writeLock().unlock();
         }

         return var12;
      }

      private int[] c() {
         int[] $$0 = new int[c];
         Arrays.fill($$0, -1);
         return $$0;
      }

      public boolean a() {
         return this.d;
      }

      public void b() {
         this.d = true;
      }
   }

   static class b {
      public int a = Integer.MIN_VALUE;
      public int b = Integer.MIN_VALUE;
      @Nullable
      fkd.a c;

      private b() {
      }
   }
}
