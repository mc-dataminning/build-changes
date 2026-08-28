import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Arrays;
import javax.annotation.Nullable;

public abstract class etn<M extends eth<M>, S extends etk<M>> implements etj {
   public static final int a = 15;
   protected static final int b = 1;
   protected static final long c = etn.a.a(1);
   private static final int g = 512;
   protected static final jm[] d = jm.values();
   protected final eac e;
   protected final S f;
   private final LongOpenHashSet h = new LongOpenHashSet(512, 0.5F);
   private final LongArrayFIFOQueue i = new LongArrayFIFOQueue();
   private final LongArrayFIFOQueue j = new LongArrayFIFOQueue();
   private static final int k = 2;
   private final long[] l = new long[2];
   private final eab[] m = new eab[2];

   protected etn(eac $$0, S $$1) {
      this.e = $$0;
      this.f = $$1;
      this.c();
   }

   public static boolean a(dxu $$0, dxu $$1) {
      return $$1 == $$0 ? false : $$1.g() != $$0.g() || $$1.k() != $$0.k() || $$1.j() || $$0.j();
   }

   public static int a(dxu $$0, dxu $$1, jm $$2, int $$3) {
      boolean $$4 = a($$0);
      boolean $$5 = a($$1);
      if ($$4 && $$5) {
         return $$3;
      } else {
         fcr $$6 = $$4 ? fco.a() : $$0.h();
         fcr $$7 = $$5 ? fco.a() : $$1.h();
         return fco.b($$6, $$7, $$2) ? 16 : $$3;
      }
   }

   public static fcr a(dxu $$0, jm $$1) {
      return a($$0) ? fco.a() : $$0.a($$1);
   }

   protected static boolean a(dxu $$0) {
      return !$$0.t() || !$$0.j();
   }

   protected dxu c(jh $$0) {
      int $$1 = kj.a($$0.u());
      int $$2 = kj.a($$0.w());
      eab $$3 = this.a($$1, $$2);
      return $$3 == null ? dkn.I.m() : $$3.a_($$0);
   }

   protected int b(dxu $$0) {
      return Math.max(1, $$0.g());
   }

   protected boolean a(dxu $$0, dxu $$1, jm $$2) {
      fcr $$3 = a($$0, $$2);
      fcr $$4 = a($$1, $$2.g());
      return fco.b($$3, $$4);
   }

   @Nullable
   protected eab a(int $$0, int $$1) {
      long $$2 = dgn.c($$0, $$1);

      for (int $$3 = 0; $$3 < 2; $$3++) {
         if ($$2 == this.l[$$3]) {
            return this.m[$$3];
         }
      }

      eab $$4 = this.e.c($$0, $$1);

      for (int $$5 = 1; $$5 > 0; $$5--) {
         this.l[$$5] = this.l[$$5 - 1];
         this.m[$$5] = this.m[$$5 - 1];
      }

      this.l[0] = $$2;
      this.m[0] = $$4;
      return $$4;
   }

   private void c() {
      Arrays.fill(this.l, dgn.c);
      Arrays.fill(this.m, null);
   }

   @Override
   public void a(jh $$0) {
      this.h.add($$0.a());
   }

   public void a(long $$0, @Nullable dzu $$1) {
      this.f.a($$0, $$1);
   }

   public void b(dgn $$0, boolean $$1) {
      this.f.c(kj.b($$0.h, $$0.i), $$1);
   }

   @Override
   public void a(kj $$0, boolean $$1) {
      this.f.d($$0.s(), $$1);
   }

   @Override
   public void a(dgn $$0, boolean $$1) {
      this.f.b(kj.b($$0.h, $$0.i), $$1);
   }

   @Override
   public int a() {
      LongIterator $$0 = this.h.iterator();

      while ($$0.hasNext()) {
         this.a($$0.nextLong());
      }

      this.h.clear();
      this.h.trim(512);
      int $$1 = 0;
      $$1 += this.e();
      $$1 += this.d();
      this.c();
      this.f.a(this);
      this.f.b();
      return $$1;
   }

   private int d() {
      int $$0;
      for ($$0 = 0; !this.j.isEmpty(); $$0++) {
         long $$1 = this.j.dequeueLong();
         long $$2 = this.j.dequeueLong();
         int $$3 = this.f.e($$1);
         int $$4 = etn.a.a($$2);
         if (etn.a.c($$2) && $$3 < $$4) {
            this.f.a($$1, $$4);
            $$3 = $$4;
         }

         if ($$3 == $$4) {
            this.a($$1, $$2, $$3);
         }
      }

      return $$0;
   }

   private int e() {
      int $$0;
      for ($$0 = 0; !this.i.isEmpty(); $$0++) {
         long $$1 = this.i.dequeueLong();
         long $$2 = this.i.dequeueLong();
         this.a($$1, $$2);
      }

      return $$0;
   }

   protected void b(long $$0, long $$1) {
      this.i.enqueue($$0);
      this.i.enqueue($$1);
   }

   protected void c(long $$0, long $$1) {
      this.j.enqueue($$0);
      this.j.enqueue($$1);
   }

   @Override
   public boolean N_() {
      return this.f.a() || !this.h.isEmpty() || !this.i.isEmpty() || !this.j.isEmpty();
   }

   @Nullable
   @Override
   public dzu a(kj $$0) {
      return this.f.d($$0.s());
   }

   @Override
   public int b(jh $$0) {
      return this.f.a($$0.a());
   }

   public String b(long $$0) {
      return this.c($$0).a();
   }

   public etk.b c(long $$0) {
      return this.f.l($$0);
   }

   protected abstract void a(long var1);

   protected abstract void a(long var1, long var3, int var5);

   protected abstract void a(long var1, long var3);

   public static class a {
      private static final int a = 4;
      private static final int b = 6;
      private static final long c = 15L;
      private static final long d = 1008L;
      private static final long e = 1024L;
      private static final long f = 2048L;

      public static long a(int $$0, jm $$1) {
         long $$2 = c(1008L, $$1);
         return a($$2, $$0);
      }

      public static long a(int $$0) {
         return a(1008L, $$0);
      }

      public static long a(int $$0, boolean $$1) {
         long $$2 = 1008L;
         $$2 |= 2048L;
         if ($$1) {
            $$2 |= 1024L;
         }

         return a($$2, $$0);
      }

      public static long a(int $$0, boolean $$1, jm $$2) {
         long $$3 = c(1008L, $$2);
         if ($$1) {
            $$3 |= 1024L;
         }

         return a($$3, $$0);
      }

      public static long b(int $$0, boolean $$1, jm $$2) {
         long $$3 = 0L;
         if ($$1) {
            $$3 |= 1024L;
         }

         $$3 = b($$3, $$2);
         return a($$3, $$0);
      }

      public static long a(boolean $$0, boolean $$1, boolean $$2, boolean $$3, boolean $$4) {
         long $$5 = a(0L, 15);
         if ($$0) {
            $$5 = b($$5, jm.a);
         }

         if ($$1) {
            $$5 = b($$5, jm.c);
         }

         if ($$2) {
            $$5 = b($$5, jm.d);
         }

         if ($$3) {
            $$5 = b($$5, jm.e);
         }

         if ($$4) {
            $$5 = b($$5, jm.f);
         }

         return $$5;
      }

      public static int a(long $$0) {
         return (int)($$0 & 15L);
      }

      public static boolean b(long $$0) {
         return ($$0 & 1024L) != 0L;
      }

      public static boolean c(long $$0) {
         return ($$0 & 2048L) != 0L;
      }

      public static boolean a(long $$0, jm $$1) {
         return ($$0 & 1L << $$1.ordinal() + 4) != 0L;
      }

      private static long a(long $$0, int $$1) {
         return $$0 & -16L | (long)$$1 & 15L;
      }

      private static long b(long $$0, jm $$1) {
         return $$0 | 1L << $$1.ordinal() + 4;
      }

      private static long c(long $$0, jm $$1) {
         return $$0 & ~(1L << $$1.ordinal() + 4);
      }
   }
}
