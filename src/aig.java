import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class aig {
   private final Map<ahg, aif> a = Maps.newHashMap();

   @Nullable
   public aif a(ahg $$0) {
      return this.a.get($$0);
   }

   public aif a(ahg $$0, vf $$1) {
      aif $$2 = new aif($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(aif $$0) {
      this.a.remove($$0.a());
   }

   public Collection<ahg> a() {
      return this.a.keySet();
   }

   public Collection<aif> b() {
      return this.a.values();
   }

   public sn c() {
      sn $$0 = new sn();

      for (aif $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(sn $$0) {
      for (String $$1 : $$0.e()) {
         ahg $$2 = new ahg($$1);
         this.a.put($$2, aif.a($$0.p($$1), $$2));
      }
   }

   public void a(ane $$0) {
      for (aif $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(ane $$0) {
      for (aif $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
