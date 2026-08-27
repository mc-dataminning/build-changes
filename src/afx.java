import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class afx {
   private final Map<aey, afw> a = Maps.newHashMap();

   @Nullable
   public afw a(aey $$0) {
      return this.a.get($$0);
   }

   public afw a(aey $$0, tn $$1) {
      afw $$2 = new afw($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(afw $$0) {
      this.a.remove($$0.a());
   }

   public Collection<aey> a() {
      return this.a.keySet();
   }

   public Collection<afw> b() {
      return this.a.values();
   }

   public qy c() {
      qy $$0 = new qy();

      for (afw $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(qy $$0) {
      for (String $$1 : $$0.e()) {
         aey $$2 = new aey($$1);
         this.a.put($$2, afw.a($$0.p($$1), $$2));
      }
   }

   public void a(akt $$0) {
      for (afw $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(akt $$0) {
      for (afw $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
