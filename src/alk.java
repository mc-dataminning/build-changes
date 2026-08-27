import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class alk {
   private final Object2BooleanMap<alr> a = new Object2BooleanOpenHashMap();

   public Set<alr> a() {
      return this.a.keySet();
   }

   public void a(alr $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(alr $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(alr $$0) {
      this.a.replace($$0, true);
   }

   public void c(alr $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(alr $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(alr $$0) {
      return this.a.getBoolean($$0);
   }
}
