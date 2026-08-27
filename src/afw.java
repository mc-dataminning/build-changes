import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class afw {
   private final Map<aex, afv> a = Maps.newHashMap();

   @Nullable
   public afv a(aex $$0) {
      return this.a.get($$0);
   }

   public afv a(aex $$0, tm $$1) {
      afv $$2 = new afv($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(afv $$0) {
      this.a.remove($$0.a());
   }

   public Collection<aex> a() {
      return this.a.keySet();
   }

   public Collection<afv> b() {
      return this.a.values();
   }

   public qy c() {
      qy $$0 = new qy();

      for (afv $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(qy $$0) {
      for (String $$1 : $$0.e()) {
         aex $$2 = new aex($$1);
         this.a.put($$2, afv.a($$0.p($$1), $$2));
      }
   }

   public void a(aks $$0) {
      for (afv $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aks $$0) {
      for (afv $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
