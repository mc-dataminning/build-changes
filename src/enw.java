import it.unimi.dsi.fastutil.HashCommon;
import it.unimi.dsi.fastutil.longs.Long2LongLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import java.util.NoSuchElementException;

public class enw extends LongLinkedOpenHashSet {
   private final enw.a a;

   public enw(int $$0, float $$1) {
      super($$0, $$1);
      this.a = new enw.a($$0 / 64, $$1);
   }

   public boolean add(long $$0) {
      return this.a.c($$0);
   }

   public boolean rem(long $$0) {
      return this.a.d($$0);
   }

   public long removeFirstLong() {
      return this.a.a();
   }

   public int size() {
      throw new UnsupportedOperationException();
   }

   public boolean isEmpty() {
      return this.a.isEmpty();
   }

   protected static class a extends Long2LongLinkedOpenHashMap {
      private static final int a = aye.f(60000000);
      private static final int b = aye.f(60000000);
      private static final int c = 64 - a - b;
      private static final int d = 0;
      private static final int e = c;
      private static final int g = c + b;
      private static final long h = 3L << g | 3L | 3L << e;
      private int i = -1;
      private long j;
      private final int k;

      public a(int $$0, float $$1) {
         super($$0, $$1);
         this.k = $$0;
      }

      static long a(long $$0) {
         return $$0 & ~h;
      }

      static int b(long $$0) {
         int $$1 = (int)($$0 >>> g & 3L);
         int $$2 = (int)($$0 >>> 0 & 3L);
         int $$3 = (int)($$0 >>> e & 3L);
         return $$1 << 4 | $$3 << 2 | $$2;
      }

      static long a(long $$0, int $$1) {
         $$0 |= (long)($$1 >>> 4 & 3) << g;
         $$0 |= (long)($$1 >>> 2 & 3) << e;
         return $$0 | (long)($$1 >>> 0 & 3) << 0;
      }

      public boolean c(long $$0) {
         long $$1 = a($$0);
         int $$2 = b($$0);
         long $$3 = 1L << $$2;
         int $$4;
         if ($$1 == 0L) {
            if (this.containsNullKey) {
               return this.a(this.n, $$3);
            }

            this.containsNullKey = true;
            $$4 = this.n;
         } else {
            if (this.i != -1 && $$1 == this.j) {
               return this.a(this.i, $$3);
            }

            long[] $$5 = this.key;
            $$4 = (int)HashCommon.mix($$1) & this.mask;

            for (long $$7 = $$5[$$4]; $$7 != 0L; $$7 = $$5[$$4]) {
               if ($$7 == $$1) {
                  this.i = $$4;
                  this.j = $$1;
                  return this.a($$4, $$3);
               }

               $$4 = $$4 + 1 & this.mask;
            }
         }

         this.key[$$4] = $$1;
         this.value[$$4] = $$3;
         if (this.size == 0) {
            this.first = this.last = $$4;
            this.link[$$4] = -1L;
         } else {
            this.link[this.last] = this.link[this.last] ^ (this.link[this.last] ^ (long)$$4 & 4294967295L) & 4294967295L;
            this.link[$$4] = ((long)this.last & 4294967295L) << 32 | 4294967295L;
            this.last = $$4;
         }

         if (this.size++ >= this.maxFill) {
            this.rehash(HashCommon.arraySize(this.size + 1, this.f));
         }

         return false;
      }

      private boolean a(int $$0, long $$1) {
         boolean $$2 = (this.value[$$0] & $$1) != 0L;
         this.value[$$0] = this.value[$$0] | $$1;
         return $$2;
      }

      public boolean d(long $$0) {
         long $$1 = a($$0);
         int $$2 = b($$0);
         long $$3 = 1L << $$2;
         if ($$1 == 0L) {
            return this.containsNullKey ? this.e($$3) : false;
         } else if (this.i != -1 && $$1 == this.j) {
            return this.b(this.i, $$3);
         } else {
            long[] $$4 = this.key;
            int $$5 = (int)HashCommon.mix($$1) & this.mask;

            for (long $$6 = $$4[$$5]; $$6 != 0L; $$6 = $$4[$$5]) {
               if ($$1 == $$6) {
                  this.i = $$5;
                  this.j = $$1;
                  return this.b($$5, $$3);
               }

               $$5 = $$5 + 1 & this.mask;
            }

            return false;
         }
      }

      private boolean e(long $$0) {
         if ((this.value[this.n] & $$0) == 0L) {
            return false;
         } else {
            this.value[this.n] = this.value[this.n] & ~$$0;
            if (this.value[this.n] != 0L) {
               return true;
            } else {
               this.containsNullKey = false;
               this.size--;
               this.fixPointers(this.n);
               if (this.size < this.maxFill / 4 && this.n > 16) {
                  this.rehash(this.n / 2);
               }

               return true;
            }
         }
      }

      private boolean b(int $$0, long $$1) {
         if ((this.value[$$0] & $$1) == 0L) {
            return false;
         } else {
            this.value[$$0] = this.value[$$0] & ~$$1;
            if (this.value[$$0] != 0L) {
               return true;
            } else {
               this.i = -1;
               this.size--;
               this.fixPointers($$0);
               this.shiftKeys($$0);
               if (this.size < this.maxFill / 4 && this.n > 16) {
                  this.rehash(this.n / 2);
               }

               return true;
            }
         }
      }

      public long a() {
         if (this.size == 0) {
            throw new NoSuchElementException();
         } else {
            int $$0 = this.first;
            long $$1 = this.key[$$0];
            int $$2 = Long.numberOfTrailingZeros(this.value[$$0]);
            this.value[$$0] = this.value[$$0] & ~(1L << $$2);
            if (this.value[$$0] == 0L) {
               this.removeFirstLong();
               this.i = -1;
            }

            return a($$1, $$2);
         }
      }

      protected void rehash(int $$0) {
         if ($$0 > this.k) {
            super.rehash($$0);
         }
      }
   }
}
