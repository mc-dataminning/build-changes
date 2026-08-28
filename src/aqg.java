import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aqg {
   private final Object2BooleanMap<aqn> a = new Object2BooleanOpenHashMap();

   public Set<aqn> a() {
      return this.a.keySet();
   }

   public void a(aqn $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(aqn $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(aqn $$0) {
      this.a.replace($$0, true);
   }

   public void c(aqn $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(aqn $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(aqn $$0) {
      return this.a.getBoolean($$0);
   }
}
