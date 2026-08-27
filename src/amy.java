import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class amy {
   private final Object2BooleanMap<anf> a = new Object2BooleanOpenHashMap();

   public Set<anf> a() {
      return this.a.keySet();
   }

   public void a(anf $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(anf $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(anf $$0) {
      this.a.replace($$0, true);
   }

   public void c(anf $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(anf $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(anf $$0) {
      return this.a.getBoolean($$0);
   }
}
