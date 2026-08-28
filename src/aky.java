import java.util.List;
import java.util.Map;

public class aky {
   private final String a;
   private final String b;

   public aky(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aky a(String $$0) {
      return new aky($$0, ".json");
   }

   public alf a(alf $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public alf b(alf $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<alf, aun> a(aup $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<alf, List<aun>> b(aup $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
