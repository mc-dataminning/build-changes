import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class ajy {
   private final Map<aiy, ajx> a = Maps.newHashMap();

   @Nullable
   public ajx a(aiy $$0) {
      return this.a.get($$0);
   }

   public ajx a(aiy $$0, vq $$1) {
      ajx $$2 = new ajx($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(ajx $$0) {
      this.a.remove($$0.a());
   }

   public Collection<aiy> a() {
      return this.a.keySet();
   }

   public Collection<ajx> b() {
      return this.a.values();
   }

   public sw c() {
      sw $$0 = new sw();

      for (ajx $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(sw $$0) {
      for (String $$1 : $$0.e()) {
         aiy $$2 = new aiy($$1);
         this.a.put($$2, ajx.a($$0.p($$1), $$2));
      }
   }

   public void a(aox $$0) {
      for (ajx $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aox $$0) {
      for (ajx $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
