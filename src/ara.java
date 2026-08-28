import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class ara {
   private final Object2BooleanMap<arh> a = new Object2BooleanOpenHashMap();

   public Set<arh> a() {
      return this.a.keySet();
   }

   public void a(arh $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(arh $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(arh $$0) {
      this.a.replace($$0, true);
   }

   public void c(arh $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(arh $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(arh $$0) {
      return this.a.getBoolean($$0);
   }
}
