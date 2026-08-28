import java.util.List;
import java.util.Map;

public class akd {
   private final String a;
   private final String b;

   public akd(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static akd a(String $$0) {
      return new akd($$0, ".json");
   }

   public akk a(akk $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public akk b(akk $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<akk, atu> a(atw $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<akk, List<atu>> b(atw $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
