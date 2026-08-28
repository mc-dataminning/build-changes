import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class arg {
   private final Object2BooleanMap<arn> a = new Object2BooleanOpenHashMap();

   public Set<arn> a() {
      return this.a.keySet();
   }

   public void a(arn $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(arn $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(arn $$0) {
      this.a.replace($$0, true);
   }

   public void c(arn $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(arn $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(arn $$0) {
      return this.a.getBoolean($$0);
   }
}
