import it.unimi.dsi.fastutil.longs.LongArrayFIFOQueue;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.Arrays;
import javax.annotation.Nullable;

public abstract class eks<M extends ekm<M>, S extends ekp<M>> implements eko {
   public static final int a = 15;
   protected static final int b = 1;
   protected static final long c = eks.a.a(1);
   private static final int g = 512;
   protected static final ij[] d = ij.values();
   protected final drr e;
   protected final S f;
   private final LongOpenHashSet h = new LongOpenHashSet(512, 0.5F);
   private final LongArrayFIFOQueue i = new LongArrayFIFOQueue();
   private final LongArrayFIFOQueue j = new LongArrayFIFOQueue();
   private final id.a k = new id.a();
   private static final int l = 2;
   private final long[] m = new long[2];
   private final drq[] n = new drq[2];

   protected eks(drr $$0, S $$1) {
      this.e = $$0;
      this.f = $$1;
      this.c();
   }

   public static boolean a(cym $$0, id $$1, dpi $$2, dpi $$3) {
      return $$3 == $$2 ? false : $$3.b($$0, $$1) != $$2.b($$0, $$1) || $$3.h() != $$2.h() || $$3.g() || $$2.g();
   }

   public static int a(cym $$0, dpi $$1, id $$2, dpi $$3, id $$4, ij $$5, int $$6) {
      boolean $$7 = a($$1);
      boolean $$8 = a($$3);
      if ($$7 && $$8) {
         return $$6;
      } else {
         etc $$9 = $$7 ? esz.a() : $$1.c($$0, $$2);
         etc $$10 = $$8 ? esz.a() : $$3.c($$0, $$4);
         return esz.b($$9, $$10, $$5) ? 16 : $$6;
      }
   }

   public static etc a(cym $$0, id $$1, dpi $$2, ij $$3) {
      return a($$2) ? esz.a() : $$2.a($$0, $$1, $$3);
   }

   protected static boolean a(dpi $$0) {
      return !$$0.p() || !$$0.g();
   }

   protected dpi c(id $$0) {
      int $$1 = jg.a($$0.u());
      int $$2 = jg.a($$0.w());
      drq $$3 = this.a($$1, $$2);
      return $$3 == null ? dcj.F.n() : $$3.a_($$0);
   }

   protected int a(dpi $$0, id $$1) {
      return Math.max(1, $$0.b(this.e.q(), $$1));
   }

   protected boolean a(long $$0, dpi $$1, long $$2, dpi $$3, ij $$4) {
      etc $$5 = this.a($$1, $$0, $$4);
      etc $$6 = this.a($$3, $$2, $$4.g());
      return esz.b($$5, $$6);
   }

   protected etc a(dpi $$0, long $$1, ij $$2) {
      return a(this.e.q(), this.k.f($$1), $$0, $$2);
   }

   @Nullable
   protected drq a(int $$0, int $$1) {
      long $$2 = cyn.c($$0, $$1);

      for (int $$3 = 0; $$3 < 2; $$3++) {
         if ($$2 == this.m[$$3]) {
            return this.n[$$3];
         }
      }

      drq $$4 = this.e.c($$0, $$1);

      for (int $$5 = 1; $$5 > 0; $$5--) {
         this.m[$$5] = this.m[$$5 - 1];
         this.n[$$5] = this.n[$$5 - 1];
      }

      this.m[0] = $$2;
      this.n[0] = $$4;
      return $$4;
   }

   private void c() {
      Arrays.fill(this.m, cyn.a);
      Arrays.fill(this.n, null);
   }

   @Override
   public void a(id $$0) {
      this.h.add($$0.a());
   }

   public void a(long $$0, @Nullable drj $$1) {
      this.f.a($$0, $$1);
   }

   public void b(cyn $$0, boolean $$1) {
      this.f.c(jg.b($$0.e, $$0.f), $$1);
   }

   @Override
   public void a(jg $$0, boolean $$1) {
      this.f.d($$0.s(), $$1);
   }

   @Override
   public void a(cyn $$0, boolean $$1) {
      this.f.b(jg.b($$0.e, $$0.f), $$1);
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
         int $$4 = eks.a.a($$2);
         if (eks.a.c($$2) && $$3 < $$4) {
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
   public boolean K_() {
      return this.f.a() || !this.h.isEmpty() || !this.i.isEmpty() || !this.j.isEmpty();
   }

   @Nullable
   @Override
   public drj a(jg $$0) {
      return this.f.d($$0.s());
   }

   @Override
   public int b(id $$0) {
      return this.f.a($$0.a());
   }

   public String b(long $$0) {
      return this.c($$0).a();
   }

   public ekp.b c(long $$0) {
      return this.f.k($$0);
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

      public static long a(int $$0, ij $$1) {
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

      public static long a(int $$0, boolean $$1, ij $$2) {
         long $$3 = c(1008L, $$2);
         if ($$1) {
            $$3 |= 1024L;
         }

         return a($$3, $$0);
      }

      public static long b(int $$0, boolean $$1, ij $$2) {
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
            $$5 = b($$5, ij.a);
         }

         if ($$1) {
            $$5 = b($$5, ij.c);
         }

         if ($$2) {
            $$5 = b($$5, ij.d);
         }

         if ($$3) {
            $$5 = b($$5, ij.e);
         }

         if ($$4) {
            $$5 = b($$5, ij.f);
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

      public static boolean a(long $$0, ij $$1) {
         return ($$0 & 1L << $$1.ordinal() + 4) != 0L;
      }

      private static long a(long $$0, int $$1) {
         return $$0 & -16L | (long)$$1 & 15L;
      }

      private static long b(long $$0, ij $$1) {
         return $$0 | 1L << $$1.ordinal() + 4;
      }

      private static long c(long $$0, ij $$1) {
         return $$0 & ~(1L << $$1.ordinal() + 4);
      }
   }
}
