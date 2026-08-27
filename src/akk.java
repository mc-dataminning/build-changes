import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class akk {
   private final Object2BooleanMap<akr> a = new Object2BooleanOpenHashMap();

   public Set<akr> a() {
      return this.a.keySet();
   }

   public void a(akr $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(akr $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(akr $$0) {
      this.a.replace($$0, true);
   }

   public void c(akr $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(akr $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(akr $$0) {
      return this.a.getBoolean($$0);
   }
}
