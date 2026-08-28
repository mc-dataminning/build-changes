import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aru {
   private final Object2BooleanMap<asc> a = new Object2BooleanOpenHashMap();

   public Set<asc> a() {
      return this.a.keySet();
   }

   public void a(asc $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(asc $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(asc $$0) {
      this.a.replace($$0, true);
   }

   public void c(asc $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(asc $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(asc $$0) {
      return this.a.getBoolean($$0);
   }
}
