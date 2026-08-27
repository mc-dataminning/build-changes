import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.Map;
import javax.annotation.Nullable;

public class alu {
   private final Map<akt, alt> a = Maps.newHashMap();

   @Nullable
   public alt a(akt $$0) {
      return this.a.get($$0);
   }

   public alt a(akt $$0, xe $$1) {
      alt $$2 = new alt($$0, $$1);
      this.a.put($$0, $$2);
      return $$2;
   }

   public void a(alt $$0) {
      this.a.remove($$0.a());
   }

   public Collection<akt> a() {
      return this.a.keySet();
   }

   public Collection<alt> b() {
      return this.a.values();
   }

   public uk a(jc.a $$0) {
      uk $$1 = new uk();

      for (alt $$2 : this.a.values()) {
         $$1.a($$2.a().toString(), $$2.a($$0));
      }

      return $$1;
   }

   public void a(uk $$0, jc.a $$1) {
      for (String $$2 : $$0.e()) {
         akt $$3 = new akt($$2);
         this.a.put($$3, alt.a($$0.p($$2), $$3, $$1));
      }
   }

   public void a(aqu $$0) {
      for (alt $$1 : this.a.values()) {
         $$1.c($$0);
      }
   }

   public void b(aqu $$0) {
      for (alt $$1 : this.a.values()) {
         $$1.d($$0);
      }
   }
}
