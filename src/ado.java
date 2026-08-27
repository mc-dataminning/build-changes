import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class ado {
   private final Map<acq, adn> a = Maps.newHashMap();

   @Nullable
   public adn a(acq $$0) {
      return this.a.get($$0);
   }

   public adn a(acq $$0, sw $$1) {
      adn $$2 = new adn($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(adn $$0) {
      this.a.remove($$0.a());
   }

   public Collection<acq> a() {
      return this.a.keySet();
   }

   public Collection<adn> b() {
      return this.a.values();
   }

   public qr c() {
      qr $$0 = new qr();

      for (adn $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(qr $$0) {
      for (String $$1 : $$0.e()) {
         acq $$2 = new acq($$1);
         this.a.put($$2, adn.a($$0.p($$1), $$2));
      }
   }

   public void a(aig $$0) {
      for (adn $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aig $$0) {
      for (adn $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
