import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class aly {
   private final Map<akv, alx> a = Maps.newHashMap();

   @Nullable
   public alx a(akv $$0) {
      return this.a.get($$0);
   }

   public alx a(akv $$0, wp $$1) {
      alx $$2 = new alx($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(alx $$0) {
      this.a.remove($$0.a());
   }

   public Collection<akv> a() {
      return this.a.keySet();
   }

   public Collection<alx> b() {
      return this.a.values();
   }

   public tq a(jt.a $$0) {
      tq $$1 = new tq();

      for (alx $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(tq $$0, jt.a $$1) {
      for (String $$2 : $$0.e()) {
         akv $$3 = akv.a($$2);
         this.a.put($$3, alx.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(are $$0) {
      for (alx $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(are $$0) {
      for (alx $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
