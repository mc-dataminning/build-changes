import java.util.List;
import java.util.Map;

public class aer {
   private final String a;
   private final String b;

   public aer(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aer a(String $$0) {
      return new aer($$0, ".json");
   }

   public aey a(aey $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public aey b(aey $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<aey, ant> a(anv $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<aey, List<ant>> b(anv $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
