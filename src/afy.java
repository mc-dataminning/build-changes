import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class afy {
   private final Map<aez, afx> a = Maps.newHashMap();

   @Nullable
   public afx a(aez $$0) {
      return this.a.get($$0);
   }

   public afx a(aez $$0, tl $$1) {
      afx $$2 = new afx($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(afx $$0) {
      this.a.remove($$0.a());
   }

   public Collection<aez> a() {
      return this.a.keySet();
   }

   public Collection<afx> b() {
      return this.a.values();
   }

   public qw c() {
      qw $$0 = new qw();

      for (afx $$1 : this.a.values()) {
         $$0.a($$1.a().toString(), $$1.f());
      }

      return $$0;
   }

   public void a(qw $$0) {
      for (String $$1 : $$0.e()) {
         aez $$2 = new aez($$1);
         this.a.put($$2, afx.a($$0.p($$1), $$2));
      }
   }

   public void a(aku $$0) {
      for (afx $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aku $$0) {
      for (afx $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
