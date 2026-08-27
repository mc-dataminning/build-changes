import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class apo {
   private final Object2BooleanMap<apv> a = new Object2BooleanOpenHashMap();

   public Set<apv> a() {
      return this.a.keySet();
   }

   public void a(apv $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(apv $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(apv $$0) {
      this.a.replace($$0, true);
   }

   public void c(apv $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(apv $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(apv $$0) {
      return this.a.getBoolean($$0);
   }
}
