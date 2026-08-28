import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Queues;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Deque;
import javax.annotation.Nullable;

public final class azz<T> extends AbstractIterator<T> {
   private static final int a = Integer.MIN_VALUE;
   @Nullable
   private Deque<T> b = null;
   private int c = Integer.MIN_VALUE;
   private final Int2ObjectMap<Deque<T>> d = new Int2ObjectOpenHashMap();

   public void a(T $$0, int $$1) {
      if ($$1 == this.c && this.b != null) {
         this.b.addLast($$0);
      } else {
         Deque<T> $$2 = (Deque<T>)this.d.computeIfAbsent($$1, $$0x -> Queues.newArrayDeque());
         $$2.addLast($$0);
         if ($$1 >= this.c) {
            this.b = $$2;
            this.c = $$1;
         }
      }
   }

   @Nullable
   protected T computeNext() {
      if (this.b == null) {
         return (T)this.endOfData();
      } else {
         T $$0 = this.b.removeFirst();
         if ($$0 == null) {
            return (T)this.endOfData();
         } else {
            if (this.b.isEmpty()) {
               this.a();
            }

            return $$0;
         }
      }
   }

   private void a() {
      int $$0 = Integer.MIN_VALUE;
      Deque<T> $$1 = null;
      ObjectIterator var3 = Int2ObjectMaps.fastIterable(this.d).iterator();

      while (var3.hasNext()) {
         Entry<Deque<T>> $$2 = (Entry<Deque<T>>)var3.next();
         Deque<T> $$3 = (Deque<T>)$$2.getValue();
         int $$4 = $$2.getIntKey();
         if ($$4 > $$0 && !$$3.isEmpty()) {
            $$0 = $$4;
            $$1 = $$3;
            if ($$4 == this.c - 1) {
               break;
            }
         }
      }

      this.c = $$0;
      this.b = $$1;
   }
}
