import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class akm {
   private final Object2BooleanMap<akt> a = new Object2BooleanOpenHashMap();

   public Set<akt> a() {
      return this.a.keySet();
   }

   public void a(akt $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(akt $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(akt $$0) {
      this.a.replace($$0, true);
   }

   public void c(akt $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(akt $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(akt $$0) {
      return this.a.getBoolean($$0);
   }
}
