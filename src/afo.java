import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class afo {
   private final Map<aep, afn> a = Maps.newHashMap();

   @Nullable
   public afn a(aep $$0) {
      return this.a.get($$0);
   }

   public afn a(aep $$0, te $$1) {
      afn $$2 = new afn($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(afn $$0) {
      this.a.remove($$0.a());
   }

   public Collection<aep> a() {
      return this.a.keySet();
   }

   public Collection<afn> b() {
      return this.a.values();
   }

   public qs c() {
      qs $$0 = new qs();

      for (afn $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(qs $$0) {
      for (String $$1 : $$0.e()) {
         aep $$2 = new aep($$1);
         this.a.put($$2, afn.a($$0.p($$1), $$2));
      }
   }

   public void a(akj $$0) {
      for (afn $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(akj $$0) {
      for (afn $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
