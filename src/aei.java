import java.util.List;
import java.util.Map;

public class aei {
   private final String a;
   private final String b;

   public aei(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aei a(String $$0) {
      return new aei($$0, ".json");
   }

   public aep a(aep $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public aep b(aep $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<aep, ani> a(ank $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<aep, List<ani>> b(ank $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
