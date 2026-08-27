import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class akn {
   private final Object2BooleanMap<aku> a = new Object2BooleanOpenHashMap();

   public Set<aku> a() {
      return this.a.keySet();
   }

   public void a(aku $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(aku $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(aku $$0) {
      this.a.replace($$0, true);
   }

   public void c(aku $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(aku $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(aku $$0) {
      return this.a.getBoolean($$0);
   }
}
