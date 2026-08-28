import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class amm {
   private final Map<alj, aml> a = Maps.newHashMap();

   @Nullable
   public aml a(alj $$0) {
      return this.a.get($$0);
   }

   public aml a(alj $$0, xj $$1) {
      aml $$2 = new aml($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(aml $$0) {
      this.a.remove($$0.a());
   }

   public Collection<alj> a() {
      return this.a.keySet();
   }

   public Collection<aml> b() {
      return this.a.values();
   }

   public ul a(js.a $$0) {
      ul $$1 = new ul();

      for (aml $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(ul $$0, js.a $$1) {
      for (String $$2 : $$0.e()) {
         alj $$3 = alj.a($$2);
         this.a.put($$3, aml.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(arq $$0) {
      for (aml $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(arq $$0) {
      for (aml $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
