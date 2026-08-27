import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class asd {
   protected final Object2IntMap<arz<?>> a = Object2IntMaps.synchronize(new Object2IntOpenHashMap());

   public asd() {
      this.a.defaultReturnValue(0);
   }

   public void b(cfi $$0, arz<?> $$1, int $$2) {
      int $$3 = (int)Math.min((long)this.a($$1) + (long)$$2, 2147483647L);
      this.a($$0, $$1, $$3);
   }

   public void a(cfi $$0, arz<?> $$1, int $$2) {
      this.a.put($$1, $$2);
   }

   public <T> int a(asb<T> $$0, T $$1) {
      return $$0.a($$1) ? this.a($$0.b($$1)) : 0;
   }

   public int a(arz<?> $$0) {
      return this.a.getInt($$0);
   }
}
