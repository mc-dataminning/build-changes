import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class afq {
   private final Map<aer, afp> a = Maps.newHashMap();

   @Nullable
   public afp a(aer $$0) {
      return this.a.get($$0);
   }

   public afp a(aer $$0, tf $$1) {
      afp $$2 = new afp($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(afp $$0) {
      this.a.remove($$0.a());
   }

   public Collection<aer> a() {
      return this.a.keySet();
   }

   public Collection<afp> b() {
      return this.a.values();
   }

   public qr c() {
      qr $$0 = new qr();

      for (afp $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(qr $$0) {
      for (String $$1 : $$0.e()) {
         aer $$2 = new aer($$1);
         this.a.put($$2, afp.a($$0.p($$1), $$2));
      }
   }

   public void a(akl $$0) {
      for (afp $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(akl $$0) {
      for (afp $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
