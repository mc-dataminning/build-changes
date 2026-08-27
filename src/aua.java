import com.google.common.collect.AbstractIterator;
import com.google.common.collect.Queues;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Comparator;
import java.util.Deque;
import java.util.Optional;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public final class aua<T> extends AbstractIterator<T> {
   private final Int2ObjectMap<Deque<T>> a = new Int2ObjectOpenHashMap();

   public void a(T $$0, int $$1) {
      ((Deque)this.a.computeIfAbsent($$1, $$0x -> Queues.newArrayDeque())).addLast($$0);
   }

   @Nullable
   protected T computeNext() {
      Optional<Deque<T>> $$0 = this.a
         .int2ObjectEntrySet()
         .stream()
         .filter($$0x -> !((Deque)$$0x.getValue()).isEmpty())
         .max(Comparator.comparingInt(Entry::getKey))
         .map(Entry::getValue);
      return $$0.map(Deque::removeFirst).orElseGet(() -> (T)this.endOfData());
   }
}
