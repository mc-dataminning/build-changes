import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class als {
   private final Map<akq, alr> a = Maps.newHashMap();

   @Nullable
   public alr a(akq $$0) {
      return this.a.get($$0);
   }

   public alr a(akq $$0, wy $$1) {
      alr $$2 = new alr($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(alr $$0) {
      this.a.remove($$0.a());
   }

   public Collection<akq> a() {
      return this.a.keySet();
   }

   public Collection<alr> b() {
      return this.a.values();
   }

   public ua a(jo.a $$0) {
      ua $$1 = new ua();

      for (alr $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(ua $$0, jo.a $$1) {
      for (String $$2 : $$0.e()) {
         akq $$3 = akq.a($$2);
         this.a.put($$3, alr.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(aqu $$0) {
      for (alr $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aqu $$0) {
      for (alr $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
