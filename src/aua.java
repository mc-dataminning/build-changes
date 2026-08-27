import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class aua {
   protected final Object2IntMap<atw<?>> a = Object2IntMaps.synchronize(new Object2IntOpenHashMap());

   public aua() {
      this.a.defaultReturnValue(0);
   }

   public void b(cia $$0, atw<?> $$1, int $$2) {
      int $$3 = (int)Math.min((long)this.a($$1) + (long)$$2, 2147483647L);
      this.a($$0, $$1, $$3);
   }

   public void a(cia $$0, atw<?> $$1, int $$2) {
      this.a.put($$1, $$2);
   }

   public <T> int a(aty<T> $$0, T $$1) {
      return $$0.a($$1) ? this.a($$0.b($$1)) : 0;
   }

   public int a(atw<?> $$0) {
      return this.a.getInt($$0);
   }
}
