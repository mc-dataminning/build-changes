import java.io.Serializable;
import java.util.Deque;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.Nullable;

public interface ayz<T> extends Serializable, Cloneable, Deque<T>, List<T>, RandomAccess {
   ayz<T> b();

   @Override
   T getFirst();

   @Override
   T getLast();

   @Override
   void addFirst(T var1);

   @Override
   void addLast(T var1);

   @Override
   T removeFirst();

   @Override
   T removeLast();

   @Override
   default boolean offer(T $$0) {
      return this.offerLast($$0);
   }

   @Override
   default T remove() {
      return this.removeFirst();
   }

   @Nullable
   @Override
   default T poll() {
      return this.pollFirst();
   }

   @Override
   default T element() {
      return this.getFirst();
   }

   @Nullable
   @Override
   default T peek() {
      return this.peekFirst();
   }

   @Override
   default void push(T $$0) {
      this.addFirst($$0);
   }

   @Override
   default T pop() {
      return this.removeFirst();
   }
}
