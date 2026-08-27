import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class akc {
   private final Object2BooleanMap<akj> a = new Object2BooleanOpenHashMap();

   public Set<akj> a() {
      return this.a.keySet();
   }

   public void a(akj $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(akj $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(akj $$0) {
      this.a.replace($$0, true);
   }

   public void c(akj $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(akj $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(akj $$0) {
      return this.a.getBoolean($$0);
   }
}
