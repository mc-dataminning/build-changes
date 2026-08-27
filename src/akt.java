import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class akt {
   private final Map<ajt, aks> a = Maps.newHashMap();

   @Nullable
   public aks a(ajt $$0) {
      return this.a.get($$0);
   }

   public aks a(ajt $$0, wg $$1) {
      aks $$2 = new aks($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(aks $$0) {
      this.a.remove($$0.a());
   }

   public Collection<ajt> a() {
      return this.a.keySet();
   }

   public Collection<aks> b() {
      return this.a.values();
   }

   public tm a(in.a $$0) {
      tm $$1 = new tm();

      for (aks $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(tm $$0, in.a $$1) {
      for (String $$2 : $$0.e()) {
         ajt $$3 = new ajt($$2);
         this.a.put($$3, aks.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(apt $$0) {
      for (aks $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(apt $$0) {
      for (aks $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
