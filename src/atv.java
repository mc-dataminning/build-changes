import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class atv {
   protected final Object2IntMap<atr<?>> a = Object2IntMaps.synchronize(new Object2IntOpenHashMap());

   public atv() {
      this.a.defaultReturnValue(0);
   }

   public void b(chh $$0, atr<?> $$1, int $$2) {
      int $$3 = (int)Math.min((long)this.a($$1) + (long)$$2, 2147483647L);
      this.a($$0, $$1, $$3);
   }

   public void a(chh $$0, atr<?> $$1, int $$2) {
      this.a.put($$1, $$2);
   }

   public <T> int a(att<T> $$0, T $$1) {
      return $$0.a($$1) ? this.a($$0.b($$1)) : 0;
   }

   public int a(atr<?> $$0) {
      return this.a.getInt($$0);
   }
}
