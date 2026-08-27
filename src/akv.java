import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class akv {
   private final Map<ajv, aku> a = Maps.newHashMap();

   @Nullable
   public aku a(ajv $$0) {
      return this.a.get($$0);
   }

   public aku a(ajv $$0, wi $$1) {
      aku $$2 = new aku($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(aku $$0) {
      this.a.remove($$0.a());
   }

   public Collection<ajv> a() {
      return this.a.keySet();
   }

   public Collection<aku> b() {
      return this.a.values();
   }

   public to a(ip.a $$0) {
      to $$1 = new to();

      for (aku $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(to $$0, ip.a $$1) {
      for (String $$2 : $$0.e()) {
         ajv $$3 = new ajv($$2);
         this.a.put($$3, aku.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(apv $$0) {
      for (aku $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(apv $$0) {
      for (aku $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
