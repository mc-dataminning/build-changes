import java.util.List;
import java.util.Map;

public class aen {
   private final String a;
   private final String b;

   public aen(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aen a(String $$0) {
      return new aen($$0, ".json");
   }

   public aeu a(aeu $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public aeu b(aeu $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<aeu, ann> a(anp $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<aeu, List<ann>> b(anp $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
