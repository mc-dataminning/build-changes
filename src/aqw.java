import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aqw {
   private final Object2BooleanMap<are> a = new Object2BooleanOpenHashMap();

   public Set<are> a() {
      return this.a.keySet();
   }

   public void a(are $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(are $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(are $$0) {
      this.a.replace($$0, true);
   }

   public void c(are $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(are $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(are $$0) {
      return this.a.getBoolean($$0);
   }
}
