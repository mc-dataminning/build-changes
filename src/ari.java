import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class ari {
   private final Object2BooleanMap<arq> a = new Object2BooleanOpenHashMap();

   public Set<arq> a() {
      return this.a.keySet();
   }

   public void a(arq $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(arq $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(arq $$0) {
      this.a.replace($$0, true);
   }

   public void c(arq $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(arq $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(arq $$0) {
      return this.a.getBoolean($$0);
   }
}
