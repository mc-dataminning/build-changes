import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class ahf {
   private final Map<agg, ahe> a = Maps.newHashMap();

   @Nullable
   public ahe a(agg $$0) {
      return this.a.get($$0);
   }

   public ahe a(agg $$0, ur $$1) {
      ahe $$2 = new ahe($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(ahe $$0) {
      this.a.remove($$0.a());
   }

   public Collection<agg> a() {
      return this.a.keySet();
   }

   public Collection<ahe> b() {
      return this.a.values();
   }

   public rz c() {
      rz $$0 = new rz();

      for (ahe $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(rz $$0) {
      for (String $$1 : $$0.e()) {
         agg $$2 = new agg($$1);
         this.a.put($$2, ahe.a($$0.p($$1), $$2));
      }
   }

   public void a(amb $$0) {
      for (ahe $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(amb $$0) {
      for (ahe $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
