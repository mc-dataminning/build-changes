import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class apy {
   private final Object2BooleanMap<aqf> a = new Object2BooleanOpenHashMap();

   public Set<aqf> a() {
      return this.a.keySet();
   }

   public void a(aqf $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(aqf $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(aqf $$0) {
      this.a.replace($$0, true);
   }

   public void c(aqf $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(aqf $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(aqf $$0) {
      return this.a.getBoolean($$0);
   }
}
