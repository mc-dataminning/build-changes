import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class alt {
   private final Map<akr, als> a = Maps.newHashMap();

   @Nullable
   public als a(akr $$0) {
      return this.a.get($$0);
   }

   public als a(akr $$0, wz $$1) {
      als $$2 = new als($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(als $$0) {
      this.a.remove($$0.a());
   }

   public Collection<akr> a() {
      return this.a.keySet();
   }

   public Collection<als> b() {
      return this.a.values();
   }

   public ub a(jo.a $$0) {
      ub $$1 = new ub();

      for (als $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(ub $$0, jo.a $$1) {
      for (String $$2 : $$0.e()) {
         akr $$3 = akr.a($$2);
         this.a.put($$3, als.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(aqv $$0) {
      for (als $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aqv $$0) {
      for (als $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
