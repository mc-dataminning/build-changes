import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class amc {
   private final Map<alb, amb> a = Maps.newHashMap();

   @Nullable
   public amb a(alb $$0) {
      return this.a.get($$0);
   }

   public amb a(alb $$0, xl $$1) {
      amb $$2 = new amb($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(amb $$0) {
      this.a.remove($$0.a());
   }

   public Collection<alb> a() {
      return this.a.keySet();
   }

   public Collection<amb> b() {
      return this.a.values();
   }

   public ur a(jk.a $$0) {
      ur $$1 = new ur();

      for (amb $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(ur $$0, jk.a $$1) {
      for (String $$2 : $$0.e()) {
         alb $$3 = new alb($$2);
         this.a.put($$3, amb.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(arc $$0) {
      for (amb $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(arc $$0) {
      for (amb $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
