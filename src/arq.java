import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class arq {
   private final Object2BooleanMap<ary> a = new Object2BooleanOpenHashMap();

   public Set<ary> a() {
      return this.a.keySet();
   }

   public void a(ary $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(ary $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(ary $$0) {
      this.a.replace($$0, true);
   }

   public void c(ary $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(ary $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(ary $$0) {
      return this.a.getBoolean($$0);
   }
}
