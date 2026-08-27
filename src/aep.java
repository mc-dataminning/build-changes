import java.util.List;
import java.util.Map;

public class aep {
   private final String a;
   private final String b;

   public aep(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aep a(String $$0) {
      return new aep($$0, ".json");
   }

   public aew a(aew $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public aew b(aew $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<aew, anr> a(ant $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<aew, List<anr>> b(ant $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
