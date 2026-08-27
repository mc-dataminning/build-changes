import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aoq {
   private final Object2BooleanMap<aox> a = new Object2BooleanOpenHashMap();

   public Set<aox> a() {
      return this.a.keySet();
   }

   public void a(aox $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(aox $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(aox $$0) {
      this.a.replace($$0, true);
   }

   public void c(aox $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(aox $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(aox $$0) {
      return this.a.getBoolean($$0);
   }
}
