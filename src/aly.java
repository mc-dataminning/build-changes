import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class aly {
   private final Object2BooleanMap<amf> a = new Object2BooleanOpenHashMap();

   public Set<amf> a() {
      return this.a.keySet();
   }

   public void a(amf $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(amf $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(amf $$0) {
      this.a.replace($$0, true);
   }

   public void c(amf $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(amf $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(amf $$0) {
      return this.a.getBoolean($$0);
   }
}
