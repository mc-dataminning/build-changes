import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class alu {
   private final Object2BooleanMap<amb> a = new Object2BooleanOpenHashMap();

   public Set<amb> a() {
      return this.a.keySet();
   }

   public void a(amb $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(amb $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(amb $$0) {
      this.a.replace($$0, true);
   }

   public void c(amb $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(amb $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(amb $$0) {
      return this.a.getBoolean($$0);
   }
}
