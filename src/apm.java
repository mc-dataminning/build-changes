import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class apm {
   private final Object2BooleanMap<apt> a = new Object2BooleanOpenHashMap();

   public Set<apt> a() {
      return this.a.keySet();
   }

   public void a(apt $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(apt $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(apt $$0) {
      this.a.replace($$0, true);
   }

   public void c(apt $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(apt $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(apt $$0) {
      return this.a.getBoolean($$0);
   }
}
