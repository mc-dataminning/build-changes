import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Arrays;
import javax.annotation.Nullable;

public abstract class eso<M extends esi<M>, S extends esl<M>> implements esk {
   public static final int a = 15;
   protected static final int b = 1;
   protected static final long c = eso.a.a(1);
   private static final int g = 512;
   protected static final jn[] d = jn.values();
   protected final dzd e;
   protected final S f;
   private final LongOpenHashSet h = new LongOpenHashSet(512, 0.5F);
   private final LongArrayFIFOQueue i = new LongArrayFIFOQueue();
   private final LongArrayFIFOQueue j = new LongArrayFIFOQueue();
   private static final int k = 2;
   private final long[] l = new long[2];
   private final dzc[] m = new dzc[2];

   protected eso(dzd $$0, S $$1) {
      this.e = $$0;
      this.f = $$1;
      this.c();
   }

   public static boolean a(dwv $$0, dwv $$1) {
      return $$1 == $$0 ? false : $$1.g() != $$0.g() || $$1.k() != $$0.k() || $$1.j() || $$0.j();
   }

   public static int a(dwv $$0, dwv $$1, jn $$2, int $$3) {
      boolean $$4 = a($$0);
      boolean $$5 = a($$1);
      if ($$4 && $$5) {
         return $$3;
      } else {
         fbs $$6 = $$4 ? fbp.a() : $$0.h();
         fbs $$7 = $$5 ? fbp.a() : $$1.h();
         return fbp.b($$6, $$7, $$2) ? 16 : $$3;
      }
   }

   public static fbs a(dwv $$0, jn $$1) {
      return a($$0) ? fbp.a() : $$0.a($$1);
   }

   protected static boolean a(dwv $$0) {
      return !$$0.t() || !$$0.j();
   }

   protected dwv c(ji $$0) {
      int $$1 = kk.a($$0.u());
      int $$2 = kk.a($$0.w());
      dzc $$3 = this.a($$1, $$2);
      return $$3 == null ? djm.I.m() : $$3.a_($$0);
   }

   protected int b(dwv $$0) {
      return Math.max(1, $$0.g());
   }

   protected boolean a(dwv $$0, dwv $$1, jn $$2) {
      fbs $$3 = a($$0, $$2);
      fbs $$4 = a($$1, $$2.g());
      return fbp.b($$3, $$4);
   }

   @Nullable
   protected dzc a(int $$0, int $$1) {
      long $$2 = dfm.c($$0, $$1);

      for (int $$3 = 0; $$3 < 2; $$3++) {
         if ($$2 == this.l[$$3]) {
            return this.m[$$3];
         }
      }

      dzc $$4 = this.e.c($$0, $$1);

      for (int $$5 = 1; $$5 > 0; $$5--) {
         this.l[$$5] = this.l[$$5 - 1];
         this.m[$$5] = this.m[$$5 - 1];
      }

      this.l[0] = $$2;
      this.m[0] = $$4;
      return $$4;
   }

   private void c() {
      Arrays.fill(this.l, dfm.c);
      Arrays.fill(this.m, null);
   }

   @Override
   public void a(ji $$0) {
      this.h.add($$0.a());
   }

   public void a(long $$0, @Nullable dyv $$1) {
      this.f.a($$0, $$1);
   }

   public void b(dfm $$0, boolean $$1) {
      this.f.c(kk.b($$0.h, $$0.i), $$1);
   }

   @Override
   public void a(kk $$0, boolean $$1) {
      this.f.d($$0.s(), $$1);
   }

   @Override
   public void a(dfm $$0, boolean $$1) {
      this.f.b(kk.b($$0.h, $$0.i), $$1);
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
         int $$4 = eso.a.a($$2);
         if (eso.a.c($$2) && $$3 < $$4) {
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
   public dyv a(kk $$0) {
      return this.f.d($$0.s());
   }

   @Override
   public int b(ji $$0) {
      return this.f.a($$0.a());
   }

   public String b(long $$0) {
      return this.c($$0).a();
   }

   public esl.b c(long $$0) {
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

      public static long a(int $$0, jn $$1) {
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

      public static long a(int $$0, boolean $$1, jn $$2) {
         long $$3 = c(1008L, $$2);
         if ($$1) {
            $$3 |= 1024L;
         }

         return a($$3, $$0);
      }

      public static long b(int $$0, boolean $$1, jn $$2) {
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
            $$5 = b($$5, jn.a);
         }

         if ($$1) {
            $$5 = b($$5, jn.c);
         }

         if ($$2) {
            $$5 = b($$5, jn.d);
         }

         if ($$3) {
            $$5 = b($$5, jn.e);
         }

         if ($$4) {
            $$5 = b($$5, jn.f);
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

      public static boolean a(long $$0, jn $$1) {
         return ($$0 & 1L << $$1.ordinal() + 4) != 0L;
      }

      private static long a(long $$0, int $$1) {
         return $$0 & -16L | (long)$$1 & 15L;
      }

      private static long b(long $$0, jn $$1) {
         return $$0 | 1L << $$1.ordinal() + 4;
      }

      private static long c(long $$0, jn $$1) {
         return $$0 & ~(1L << $$1.ordinal() + 4);
      }
   }
}
