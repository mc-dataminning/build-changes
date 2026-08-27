import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class axf {
   public static final int a = -1;
   private final Object2IntMap<Class<?>> b = ad.a(new Object2IntOpenHashMap(), $$0 -> $$0.defaultReturnValue(-1));

   public int a(Class<?> $$0) {
      int $$1 = this.b.getInt($$0);
      if ($$1 != -1) {
         return $$1;
      } else {
         Class<?> $$2 = $$0;

         while (($$2 = $$2.getSuperclass()) != Object.class) {
            int $$3 = this.b.getInt($$2);
            if ($$3 != -1) {
               return $$3;
            }
         }

         return -1;
      }
   }

   public int b(Class<?> $$0) {
      return this.a($$0) + 1;
   }

   public int c(Class<?> $$0) {
      int $$1 = this.a($$0);
      int $$2 = $$1 == -1 ? 0 : $$1 + 1;
      this.b.put($$0, $$2);
      return $$2;
   }
}
