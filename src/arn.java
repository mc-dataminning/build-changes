import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class arn {
   private final Object2BooleanMap<arv> a = new Object2BooleanOpenHashMap();

   public Set<arv> a() {
      return this.a.keySet();
   }

   public void a(arv $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(arv $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(arv $$0) {
      this.a.replace($$0, true);
   }

   public void c(arv $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(arv $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(arv $$0) {
      return this.a.getBoolean($$0);
   }
}
