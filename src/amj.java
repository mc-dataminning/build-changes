import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class amj {
   private final Object2BooleanMap<amq> a = new Object2BooleanOpenHashMap();

   public Set<amq> a() {
      return this.a.keySet();
   }

   public void a(amq $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(amq $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(amq $$0) {
      this.a.replace($$0, true);
   }

   public void c(amq $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(amq $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(amq $$0) {
      return this.a.getBoolean($$0);
   }
}
