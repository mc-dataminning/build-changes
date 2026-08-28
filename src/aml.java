import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class aml {
   private final Map<ali, amk> a = Maps.newHashMap();

   @Nullable
   public amk a(ali $$0) {
      return this.a.get($$0);
   }

   public amk a(ali $$0, xi $$1) {
      amk $$2 = new amk($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(amk $$0) {
      this.a.remove($$0.a());
   }

   public Collection<ali> a() {
      return this.a.keySet();
   }

   public Collection<amk> b() {
      return this.a.values();
   }

   public uk a(js.a $$0) {
      uk $$1 = new uk();

      for (amk $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(uk $$0, js.a $$1) {
      for (String $$2 : $$0.e()) {
         ali $$3 = ali.a($$2);
         this.a.put($$3, amk.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(aro $$0) {
      for (amk $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aro $$0) {
      for (amk $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
