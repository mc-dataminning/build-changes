import java.util.List;
import java.util.Map;

public class akm {
   private final String a;
   private final String b;

   public akm(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static akm a(String $$0) {
      return new akm($$0, ".json");
   }

   public akt a(akt $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public akt b(akt $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<akt, aub> a(aud $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<akt, List<aub>> b(aud $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
