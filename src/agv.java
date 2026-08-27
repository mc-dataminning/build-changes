import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class agv {
   private final Map<afw, agu> a = Maps.newHashMap();

   @Nullable
   public agu a(afw $$0) {
      return this.a.get($$0);
   }

   public agu a(afw $$0, ui $$1) {
      agu $$2 = new agu($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(agu $$0) {
      this.a.remove($$0.a());
   }

   public Collection<afw> a() {
      return this.a.keySet();
   }

   public Collection<agu> b() {
      return this.a.values();
   }

   public rt c() {
      rt $$0 = new rt();

      for (agu $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(rt $$0) {
      for (String $$1 : $$0.e()) {
         afw $$2 = new afw($$1);
         this.a.put($$2, agu.a($$0.p($$1), $$2));
      }
   }

   public void a(alr $$0) {
      for (agu $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(alr $$0) {
      for (agu $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
