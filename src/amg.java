import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class amg {
   private final Map<alf, amf> a = Maps.newHashMap();

   @Nullable
   public amf a(alf $$0) {
      return this.a.get($$0);
   }

   public amf a(alf $$0, xp $$1) {
      amf $$2 = new amf($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(amf $$0) {
      this.a.remove($$0.a());
   }

   public Collection<alf> a() {
      return this.a.keySet();
   }

   public Collection<amf> b() {
      return this.a.values();
   }

   public us a(jk.a $$0) {
      us $$1 = new us();

      for (amf $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(us $$0, jk.a $$1) {
      for (String $$2 : $$0.e()) {
         alf $$3 = new alf($$2);
         this.a.put($$3, amf.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(arg $$0) {
      for (amf $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(arg $$0) {
      for (amf $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
