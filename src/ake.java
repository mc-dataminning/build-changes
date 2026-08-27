import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class ake {
   private final Object2BooleanMap<akl> a = new Object2BooleanOpenHashMap();

   public Set<akl> a() {
      return this.a.keySet();
   }

   public void a(akl $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(akl $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(akl $$0) {
      this.a.replace($$0, true);
   }

   public void c(akl $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(akl $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(akl $$0) {
      return this.a.getBoolean($$0);
   }
}
