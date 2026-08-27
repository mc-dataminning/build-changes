import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class ahm {
   private final Map<agm, ahl> a = Maps.newHashMap();

   @Nullable
   public ahl a(agm $$0) {
      return this.a.get($$0);
   }

   public ahl a(agm $$0, uv $$1) {
      ahl $$2 = new ahl($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(ahl $$0) {
      this.a.remove($$0.a());
   }

   public Collection<agm> a() {
      return this.a.keySet();
   }

   public Collection<ahl> b() {
      return this.a.values();
   }

   public sd c() {
      sd $$0 = new sd();

      for (ahl $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(sd $$0) {
      for (String $$1 : $$0.e()) {
         agm $$2 = new agm($$1);
         this.a.put($$2, ahl.a($$0.p($$1), $$2));
      }
   }

   public void a(amj $$0) {
      for (ahl $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(amj $$0) {
      for (ahl $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
