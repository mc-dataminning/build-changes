import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class amx {
   private final Object2BooleanMap<ane> a = new Object2BooleanOpenHashMap();

   public Set<ane> a() {
      return this.a.keySet();
   }

   public void a(ane $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(ane $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(ane $$0) {
      this.a.replace($$0, true);
   }

   public void c(ane $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(ane $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(ane $$0) {
      return this.a.getBoolean($$0);
   }
}
