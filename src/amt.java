import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class amt {
   private final Object2BooleanMap<ana> a = new Object2BooleanOpenHashMap();

   public Set<ana> a() {
      return this.a.keySet();
   }

   public void a(ana $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(ana $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(ana $$0) {
      this.a.replace($$0, true);
   }

   public void c(ana $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(ana $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(ana $$0) {
      return this.a.getBoolean($$0);
   }
}
