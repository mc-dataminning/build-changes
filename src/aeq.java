import java.util.List;
import java.util.Map;

public class aeq {
   private final String a;
   private final String b;

   public aeq(String $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public static aeq a(String $$0) {
      return new aeq($$0, ".json");
   }

   public aex a(aex $$0) {
      return $$0.c(this.a + "/" + $$0.a() + this.b);
   }

   public aex b(aex $$0) {
      String $$1 = $$0.a();
      return $$0.c($$1.substring(this.a.length() + 1, $$1.length() - this.b.length()));
   }

   public Map<aex, ans> a(anu $$0) {
      return $$0.b(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }

   public Map<aex, List<ans>> b(anu $$0) {
      return $$0.c(this.a, $$0x -> $$0x.a().endsWith(this.b));
   }
}
