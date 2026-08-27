import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class afv {
   private final Map<aew, afu> a = Maps.newHashMap();

   @Nullable
   public afu a(aew $$0) {
      return this.a.get($$0);
   }

   public afu a(aew $$0, tl $$1) {
      afu $$2 = new afu($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(afu $$0) {
      this.a.remove($$0.a());
   }

   public Collection<aew> a() {
      return this.a.keySet();
   }

   public Collection<afu> b() {
      return this.a.values();
   }

   public qw c() {
      qw $$0 = new qw();

      for (afu $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(qw $$0) {
      for (String $$1 : $$0.e()) {
         aew $$2 = new aew($$1);
         this.a.put($$2, afu.a($$0.p($$1), $$2));
      }
   }

   public void a(akr $$0) {
      for (afu $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(akr $$0) {
      for (afu $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
