import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class awk<T> extends AbstractList<T> implements Serializable, Cloneable, Deque<T>, RandomAccess {
   private static final int a = 1;
   private Object[] b;
   private int c;
   private int d;

   public awk() {
      this(1);
   }

   public awk(int $$0) {
      this.b = new Object[$$0];
      this.c = 0;
      this.d = 0;
   }

   @Override
   public int size() {
      return this.d;
   }

   @VisibleForTesting
   public int a() {
      return this.b.length;
   }

   private int a(int $$0) {
      return ($$0 + this.c) % this.b.length;
   }

   @Override
   public T get(int $$0) {
      this.b($$0);
      return this.c(this.a($$0));
   }

   private static void a(int $$0, int $$1) {
      if ($$0 < 0 || $$0 >= $$1) {
         throw new IndexOutOfBoundsException($$0);
      }
   }

   private void b(int $$0) {
      a($$0, this.d);
   }

   private T c(int $$0) {
      return (T)this.b[$$0];
   }

   @Override
   public T set(int $$0, T $$1) {
      this.b($$0);
      Objects.requireNonNull($$1);
      int $$2 = this.a($$0);
      T $$3 = this.c($$2);
      this.b[$$2] = $$1;
      return $$3;
   }

   @Override
   public void add(int $$0, T $$1) {
      a($$0, this.d + 1);
      Objects.requireNonNull($$1);
      if (this.d == this.b.length) {
         this.b();
      }

      int $$2 = this.a($$0);
      if ($$0 == this.d) {
         this.b[$$2] = $$1;
      } else if ($$0 == 0) {
         this.c--;
         if (this.c < 0) {
            this.c = this.c + this.b.length;
         }

         this.b[this.a(0)] = $$1;
      } else {
         for (int $$3 = this.d - 1; $$3 >= $$0; $$3--) {
            this.b[this.a($$3 + 1)] = this.b[this.a($$3)];
         }

         this.b[$$2] = $$1;
      }

      this.modCount++;
      this.d++;
   }

   private void b() {
      int $$0 = this.b.length + Math.max(this.b.length >> 1, 1);
      Object[] $$1 = new Object[$$0];
      this.a($$1, this.d);
      this.c = 0;
      this.b = $$1;
   }

   @Override
   public T remove(int $$0) {
      this.b($$0);
      int $$1 = this.a($$0);
      T $$2 = this.c($$1);
      if ($$0 == 0) {
         this.b[$$1] = null;
         this.c++;
      } else if ($$0 == this.d - 1) {
         this.b[$$1] = null;
      } else {
         for (int $$3 = $$0 + 1; $$3 < this.d; $$3++) {
            this.b[this.a($$3 - 1)] = this.get($$3);
         }

         this.b[this.a(this.d - 1)] = null;
      }

      this.modCount++;
      this.d--;
      return $$2;
   }

   @Override
   public boolean removeIf(Predicate<? super T> $$0) {
      int $$1 = 0;

      for (int $$2 = 0; $$2 < this.d; $$2++) {
         T $$3 = this.get($$2);
         if ($$0.test($$3)) {
            $$1++;
         } else if ($$1 != 0) {
            this.b[this.a($$2 - $$1)] = $$3;
            this.b[this.a($$2)] = null;
         }
      }

      this.modCount += $$1;
      this.d -= $$1;
      return $$1 != 0;
   }

   private void a(Object[] $$0, int $$1) {
      for (int $$2 = 0; $$2 < $$1; $$2++) {
         $$0[$$2] = this.get($$2);
      }
   }

   @Override
   public void replaceAll(UnaryOperator<T> $$0) {
      for (int $$1 = 0; $$1 < this.d; $$1++) {
         int $$2 = this.a($$1);
         this.b[$$2] = Objects.requireNonNull($$0.apply(this.c($$1)));
      }
   }

   @Override
   public void forEach(Consumer<? super T> $$0) {
      for (int $$1 = 0; $$1 < this.d; $$1++) {
         $$0.accept(this.get($$1));
      }
   }

   @Override
   public void addFirst(T $$0) {
      this.add(0, $$0);
   }

   @Override
   public void addLast(T $$0) {
      this.add(this.d, $$0);
   }

   @Override
   public boolean offerFirst(T $$0) {
      this.addFirst($$0);
      return true;
   }

   @Override
   public boolean offerLast(T $$0) {
      this.addLast($$0);
      return true;
   }

   @Override
   public T removeFirst() {
      if (this.d == 0) {
         throw new NoSuchElementException();
      } else {
         return this.remove(0);
      }
   }

   @Override
   public T removeLast() {
      if (this.d == 0) {
         throw new NoSuchElementException();
      } else {
         return this.remove(this.d - 1);
      }
   }

   @Nullable
   @Override
   public T pollFirst() {
      return this.d == 0 ? null : this.removeFirst();
   }

   @Nullable
   @Override
   public T pollLast() {
      return this.d == 0 ? null : this.removeLast();
   }

   @Override
   public T getFirst() {
      if (this.d == 0) {
         throw new NoSuchElementException();
      } else {
         return this.get(0);
      }
   }

   @Override
   public T getLast() {
      if (this.d == 0) {
         throw new NoSuchElementException();
      } else {
         return this.get(this.d - 1);
      }
   }

   @Nullable
   @Override
   public T peekFirst() {
      return this.d == 0 ? null : this.getFirst();
   }

   @Nullable
   @Override
   public T peekLast() {
      return this.d == 0 ? null : this.getLast();
   }

   @Override
   public boolean removeFirstOccurrence(Object $$0) {
      for (int $$1 = 0; $$1 < this.d; $$1++) {
         T $$2 = this.get($$1);
         if (Objects.equals($$0, $$2)) {
            this.remove($$1);
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean removeLastOccurrence(Object $$0) {
      for (int $$1 = this.d - 1; $$1 >= 0; $$1--) {
         T $$2 = this.get($$1);
         if (Objects.equals($$0, $$2)) {
            this.remove($$1);
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean offer(T $$0) {
      return this.offerLast($$0);
   }

   @Override
   public T remove() {
      return this.removeFirst();
   }

   @Nullable
   @Override
   public T poll() {
      return this.pollFirst();
   }

   @Override
   public T element() {
      return this.getFirst();
   }

   @Nullable
   @Override
   public T peek() {
      return this.peekFirst();
   }

   @Override
   public void push(T $$0) {
      this.addFirst($$0);
   }

   @Override
   public T pop() {
      return this.removeFirst();
   }

   @Override
   public Iterator<T> descendingIterator() {
      return new awk.a();
   }

   class a implements Iterator<T> {
      private int b = awk.this.size() - 1;

      public a() {
      }

      @Override
      public boolean hasNext() {
         return this.b >= 0;
      }

      @Override
      public T next() {
         return awk.this.get(this.b--);
      }

      @Override
      public void remove() {
         awk.this.remove(this.b + 1);
      }
   }
}
