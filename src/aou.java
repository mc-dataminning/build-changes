import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aou {
   private final Object2BooleanMap<apb> a = new Object2BooleanOpenHashMap();

   public Set<apb> a() {
      return this.a.keySet();
   }

   public void a(apb $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(apb $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(apb $$0) {
      this.a.replace($$0, true);
   }

   public void c(apb $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(apb $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(apb $$0) {
      return this.a.getBoolean($$0);
   }
}
