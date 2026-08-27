import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aop {
   private final Object2BooleanMap<aow> a = new Object2BooleanOpenHashMap();

   public Set<aow> a() {
      return this.a.keySet();
   }

   public void a(aow $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(aow $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(aow $$0) {
      this.a.replace($$0, true);
   }

   public void c(aow $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(aow $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(aow $$0) {
      return this.a.getBoolean($$0);
   }
}
