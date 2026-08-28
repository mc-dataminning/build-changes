import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class amg {
   private final Map<ald, amf> a = Maps.newHashMap();

   @Nullable
   public amf a(ald $$0) {
      return this.a.get($$0);
   }

   public amf a(ald $$0, wv $$1) {
      amf $$2 = new amf($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(amf $$0) {
      this.a.remove($$0.a());
   }

   public Collection<ald> a() {
      return this.a.keySet();
   }

   public Collection<amf> b() {
      return this.a.values();
   }

   public tw a(ju.a $$0) {
      tw $$1 = new tw();

      for (amf $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(tw $$0, ju.a $$1) {
      for (String $$2 : $$0.e()) {
         ald $$3 = ald.a($$2);
         this.a.put($$3, amf.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(aro $$0) {
      for (amf $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aro $$0) {
      for (amf $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
