import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class amo {
   private final Map<all, amn> a = Maps.newHashMap();

   @Nullable
   public amn a(all $$0) {
      return this.a.get($$0);
   }

   public amn a(all $$0, xl $$1) {
      amn $$2 = new amn($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(amn $$0) {
      this.a.remove($$0.a());
   }

   public Collection<all> a() {
      return this.a.keySet();
   }

   public Collection<amn> b() {
      return this.a.values();
   }

   public un a(js.a $$0) {
      un $$1 = new un();

      for (amn $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(un $$0, js.a $$1) {
      for (String $$2 : $$0.e()) {
         all $$3 = all.a($$2);
         this.a.put($$3, amn.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(arr $$0) {
      for (amn $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(arr $$0) {
      for (amn $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
