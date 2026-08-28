import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class asa {
   private final Object2BooleanMap<asi> a = new Object2BooleanOpenHashMap();

   public Set<asi> a() {
      return this.a.keySet();
   }

   public void a(asi $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(asi $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(asi $$0) {
      this.a.replace($$0, true);
   }

   public void c(asi $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(asi $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(asi $$0) {
      return this.a.getBoolean($$0);
   }
}
