import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.Set;

public final class akl {
   private final Object2BooleanMap<aks> a = new Object2BooleanOpenHashMap();

   public Set<aks> a() {
      return this.a.keySet();
   }

   public void a(aks $$0, boolean $$1) {
      this.a.put($$0, $$1);
   }

   public void a(aks $$0) {
      this.a.removeBoolean($$0);
   }

   public void b(aks $$0) {
      this.a.replace($$0, true);
   }

   public void c(aks $$0) {
      this.a.replace($$0, false);
   }

   public boolean d(aks $$0) {
      return this.a.getOrDefault($$0, true);
   }

   public boolean e(aks $$0) {
      return this.a.getBoolean($$0);
   }
}
