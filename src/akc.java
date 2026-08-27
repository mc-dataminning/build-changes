import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class akc {
   private final Map<ajc, akb> a = Maps.newHashMap();

   @Nullable
   public akb a(ajc $$0) {
      return this.a.get($$0);
   }

   public akb a(ajc $$0, vs $$1) {
      akb $$2 = new akb($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(akb $$0) {
      this.a.remove($$0.a());
   }

   public Collection<ajc> a() {
      return this.a.keySet();
   }

   public Collection<akb> b() {
      return this.a.values();
   }

   public sy c() {
      sy $$0 = new sy();

      for (akb $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(sy $$0) {
      for (String $$1 : $$0.e()) {
         ajc $$2 = new ajc($$1);
         this.a.put($$2, akb.a($$0.p($$1), $$2));
      }
   }

   public void a(apb $$0) {
      for (akb $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(apb $$0) {
      for (akb $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
