import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class ams {
   private final Map<alp, amr> a = Maps.newHashMap();

   @Nullable
   public amr a(alp $$0) {
      return this.a.get($$0);
   }

   public amr a(alp $$0, xk $$1) {
      amr $$2 = new amr($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(amr $$0) {
      this.a.remove($$0.a());
   }

   public Collection<alp> a() {
      return this.a.keySet();
   }

   public Collection<amr> b() {
      return this.a.values();
   }

   public um a(js.a $$0) {
      um $$1 = new um();

      for (amr $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(um $$0, js.a $$1) {
      for (String $$2 : $$0.e()) {
         alp $$3 = alp.a($$2);
         this.a.put($$3, amr.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(ary $$0) {
      for (amr $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(ary $$0) {
      for (amr $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
