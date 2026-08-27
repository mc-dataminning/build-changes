import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class aid {
   private final Map<ahd, aic> a = Maps.newHashMap();

   @Nullable
   public aic a(ahd $$0) {
      return this.a.get($$0);
   }

   public aic a(ahd $$0, vd $$1) {
      aic $$2 = new aic($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(aic $$0) {
      this.a.remove($$0.a());
   }

   public Collection<ahd> a() {
      return this.a.keySet();
   }

   public Collection<aic> b() {
      return this.a.values();
   }

   public sl c() {
      sl $$0 = new sl();

      for (aic $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(sl $$0) {
      for (String $$1 : $$0.e()) {
         ahd $$2 = new ahd($$1);
         this.a.put($$2, aic.a($$0.p($$1), $$2));
      }
   }

   public void a(ana $$0) {
      for (aic $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(ana $$0) {
      for (aic $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
