import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class ard<T> {
   private final AtomicReferenceArray<T> a;
   private final AtomicInteger b;

   public ard(int $$0) {
      this.a = new AtomicReferenceArray<>($$0);
      this.b = new AtomicInteger(0);
   }

   public void a(T $$0) {
      int $$1 = this.a.length();

      int $$2;
      int $$3;
      do {
         $$2 = this.b.get();
         $$3 = ($$2 + 1) % $$1;
      } while (!this.b.compareAndSet($$2, $$3));

      this.a.set($$3, $$0);
   }

   public List<T> a() {
      int $$0 = this.b.get();
      Builder<T> $$1 = ImmutableList.builder();

      for (int $$2 = 0; $$2 < this.a.length(); $$2++) {
         int $$3 = Math.floorMod($$0 - $$2, this.a.length());
         T $$4 = this.a.get($$3);
         if ($$4 != null) {
            $$1.add($$4);
         }
      }

      return $$1.build();
   }
}
