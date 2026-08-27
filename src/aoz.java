import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aoz {
   private final Object2BooleanMap<apg> a = new Object2BooleanOpenHashMap();

   public Set<apg> a() {
      return this.a.keySet();
   }

   public void a(apg $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(apg $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(apg $$0) {
      this.a.replace($$0, true);
   }

   public void c(apg $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(apg $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(apg $$0) {
      return this.a.getBoolean($$0);
   }
}
