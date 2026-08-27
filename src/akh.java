import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class akh {
   private final Map<ajh, akg> a = Maps.newHashMap();

   @Nullable
   public akg a(ajh $$0) {
      return this.a.get($$0);
   }

   public akg a(ajh $$0, vu $$1) {
      akg $$2 = new akg($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(akg $$0) {
      this.a.remove($$0.a());
   }

   public Collection<ajh> a() {
      return this.a.keySet();
   }

   public Collection<akg> b() {
      return this.a.values();
   }

   public ta c() {
      ta $$0 = new ta();

      for (akg $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(ta $$0) {
      for (String $$1 : $$0.e()) {
         ajh $$2 = new ajh($$1);
         this.a.put($$2, akg.a($$0.p($$1), $$2));
      }
   }

   public void a(apg $$0) {
      for (akg $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(apg $$0) {
      for (akg $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
