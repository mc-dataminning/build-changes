import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.Nullable;

public class bai<T> extends AbstractSet<T> {
   private static final int a = 10;
   private final Comparator<T> b;
   T[] c;
   int d;

   private bai(int $$0, Comparator<T> $$1) {
      this.b = $$1;
      if ($$0 < 0) {
         throw new IllegalArgumentException("Initial capacity (" + $$0 + ") is negative");
      } else {
         this.c = (T[])a(new Object[$$0]);
      }
   }

   public static <T extends Comparable<T>> bai<T> a() {
      return a(10);
   }

   public static <T extends Comparable<T>> bai<T> a(int $$0) {
      return new bai<>($$0, Comparator.naturalOrder());
   }

   public static <T> bai<T> a(Comparator<T> $$0) {
      return a($$0, 10);
   }

   public static <T> bai<T> a(Comparator<T> $$0, int $$1) {
      return new bai<>($$1, $$0);
   }

   private static <T> T[] a(Object[] $$0) {
      return (T[])$$0;
   }

   private int c(T $$0) {
      return Arrays.binarySearch(this.c, 0, this.d, $$0, this.b);
   }

   private static int b(int $$0) {
      return -$$0 - 1;
   }

   @Override
   public boolean add(T $$0) {
      int $$1 = this.c($$0);
      if ($$1 >= 0) {
         return false;
      } else {
         int $$2 = b($$1);
         this.a($$0, $$2);
         return true;
      }
   }

   private void c(int $$0) {
      if ($$0 > this.c.length) {
         if (this.c != ObjectArrays.DEFAULT_EMPTY_ARRAY) {
            $$0 = ag.a(this.c.length, $$0);
         } else if ($$0 < 10) {
            $$0 = 10;
         }

         Object[] $$1 = new Object[$$0];
         System.arraycopy(this.c, 0, $$1, 0, this.d);
         this.c = (T[])a($$1);
      }
   }

   private void a(T $$0, int $$1) {
      this.c(this.d + 1);
      if ($$1 != this.d) {
         System.arraycopy(this.c, $$1, this.c, $$1 + 1, this.d - $$1);
      }

      this.c[$$1] = $$0;
      this.d++;
   }

   void d(int $$0) {
      this.d--;
      if ($$0 != this.d) {
         System.arraycopy(this.c, $$0 + 1, this.c, $$0, this.d - $$0);
      }

      this.c[this.d] = null;
   }

   private T e(int $$0) {
      return this.c[$$0];
   }

   public T a(T $$0) {
      int $$1 = this.c($$0);
      if ($$1 >= 0) {
         return this.e($$1);
      } else {
         this.a($$0, b($$1));
         return $$0;
      }
   }

   @Override
   public boolean remove(Object $$0) {
      int $$1 = this.c((T)$$0);
      if ($$1 >= 0) {
         this.d($$1);
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   public T b(T $$0) {
      int $$1 = this.c($$0);
      return $$1 >= 0 ? this.e($$1) : null;
   }

   public T b() {
      return this.e(0);
   }

   public T c() {
      return this.e(this.d - 1);
   }

   @Override
   public boolean contains(Object $$0) {
      int $$1 = this.c((T)$$0);
      return $$1 >= 0;
   }

   @Override
   public Iterator<T> iterator() {
      return new bai.a();
   }

   @Override
   public int size() {
      return this.d;
   }

   @Override
   public Object[] toArray() {
      return Arrays.copyOf(this.c, this.d, Object[].class);
   }

   @Override
   public <U> U[] toArray(U[] $$0) {
      if ($$0.length < this.d) {
         return (U[])Arrays.copyOf(this.c, this.d, (Class<? extends T[]>)$$0.getClass());
      } else {
         System.arraycopy(this.c, 0, $$0, 0, this.d);
         if ($$0.length > this.d) {
            $$0[this.d] = null;
         }

         return $$0;
      }
   }

   @Override
   public void clear() {
      Arrays.fill(this.c, 0, this.d, null);
      this.d = 0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof bai<?> $$1 && this.b.equals($$1.b)) {
            return this.d == $$1.d && Arrays.equals(this.c, $$1.c);
         }

         return super.equals($$0);
      }
   }

   class a implements Iterator<T> {
      private int b;
      private int c = -1;

      @Override
      public boolean hasNext() {
         return this.b < bai.this.d;
      }

      @Override
      public T next() {
         if (this.b >= bai.this.d) {
            throw new NoSuchElementException();
         } else {
            this.c = this.b++;
            return bai.this.c[this.c];
         }
      }

      @Override
      public void remove() {
         if (this.c == -1) {
            throw new IllegalStateException();
         } else {
            bai.this.d(this.c);
            this.b--;
            this.c = -1;
         }
      }
   }
}
